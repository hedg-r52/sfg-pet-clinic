package guru.springframework.sfgpetclinic.services;


import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 05.11.2021
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
