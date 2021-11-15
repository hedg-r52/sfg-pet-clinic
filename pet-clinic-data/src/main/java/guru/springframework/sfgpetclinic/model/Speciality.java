package guru.springframework.sfgpetclinic.model;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 15.11.2021
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
