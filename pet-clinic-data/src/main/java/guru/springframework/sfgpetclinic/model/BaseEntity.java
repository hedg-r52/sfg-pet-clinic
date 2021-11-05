package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 05.11.2021
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
