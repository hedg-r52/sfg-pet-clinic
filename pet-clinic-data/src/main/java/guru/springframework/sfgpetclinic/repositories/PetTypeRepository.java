package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 17.11.2021
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
