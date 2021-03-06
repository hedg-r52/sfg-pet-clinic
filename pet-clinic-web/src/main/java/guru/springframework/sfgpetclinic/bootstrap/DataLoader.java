package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.*;
import guru.springframework.sfgpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 08.11.2021
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(
            OwnerService ownerService,
            VetService vetService,
            PetTypeService petTypeService,
            SpecialtyService specialtyService,
            VisitService visitService
    ) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = PetType.builder().name("Dog").build();
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = PetType.builder().name("Cat").build();
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = Owner.builder()
                .firstName("Michael")
                .lastName("Weston")
                .address("123 Brickerel")
                .city("Miami")
                .telephone("1231231234")
                .build();

        Speciality radiology = Speciality.builder().description("Radiology").build();
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality surgery = Speciality.builder().description("Surgery").build();
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality dentistry = Speciality.builder().description("Dentistry").build();
        Speciality savedDentistry = specialtyService.save(dentistry);

        Pet mikesPet = Pet.builder()
                .petType(savedDogPetType)
                .owner(owner1)
                .birthDate(LocalDate.now())
                .name("Rosco")
                .build();
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = Owner.builder()
                .firstName("Fiona")
                .lastName("Glenamme")
                .address("123 Brickerel")
                .city("Miami")
                .telephone("1231231234")
                .build();

        Pet fionaPet = Pet.builder()
                .petType(savedCatPetType)
                .owner(owner2)
                .birthDate(LocalDate.now())
                .name("Just Cat")
                .build();
        owner2.getPets().add(fionaPet);
        ownerService.save(owner2);

        Visit catVisit = Visit.builder()
                .pet(fionaPet)
                .date(LocalDate.now())
                .description("Sneezy Kitty")
                .build();

        System.out.println("Loaded Owners.....");

        Vet vet1 = Vet.builder()
                .firstName("Sam")
                .specialties(new HashSet<>())
                .lastName("Axe")
                .build();
        vet1.getSpecialties().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = Vet.builder()
                .firstName("Jessie")
                .lastName("Porter")
                .specialties(new HashSet<>())
                .build();
        vet2.getSpecialties().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }
}
