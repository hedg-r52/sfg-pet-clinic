package guru.springframework.sfgpetclinic.model;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 04.11.2021
 */
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
