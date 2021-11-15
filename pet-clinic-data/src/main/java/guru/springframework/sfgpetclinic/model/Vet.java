package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 04.11.2021
 */
public class Vet extends Person {

    private Set<Speciality> specialties;

    public Set<Speciality> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Speciality> specialties) {
        this.specialties = specialties;
    }
}
