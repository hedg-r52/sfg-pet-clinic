package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 05.11.2021
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
