package sheridan.chrisnei.assingment2.domain;

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
    private PetKind kind;
    private PetGender gender;

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
    public Pet(String name, PetKind kind, PetGender gender) {
        this.name = name;
        this.kind = kind;
        this.gender = gender;
    }

    public PetKind getKind() {
        return kind;
    }

    public void setKind(PetKind kind) {
        this.kind = kind;
    }

    public PetGender getGender() {
        return gender;
    }

    public void setGender(PetGender gender) {
        this.gender = gender;
    }
}
