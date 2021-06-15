package sheridan.chrisnei.assingment2.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * A class that models a pet
 */
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    private Kind kind;
    private Gender gender;
    private boolean vaccinated;

    /**
     * Creates a pet
     */
    public Pet() {

    }

    /**
     * Creates a pet with the give name, kind and gender
     * @param name
     * @param kind
     * @param gender
     */
    public Pet(String name, Kind kind, Gender gender, boolean vaccinated) {
        this.name = name;
        this.kind = kind;
        this.gender = gender;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated() {
        this.vaccinated = vaccinated;
    }
}
