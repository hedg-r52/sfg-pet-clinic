package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 07.11.2021
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
