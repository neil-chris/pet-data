package sheridan.chrisnei.assingment2.model;

import lombok.extern.slf4j.Slf4j;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * A class that models a pet
 */
@Entity
@Slf4j
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
        log.info("Invoked Pet.Pet()");
    }

    /**
     * Creates a pet with the give name, kind and gender
     * @param name
     * @param kind
     * @param gender
     */
    public Pet(String name, Kind kind, Gender gender, boolean vaccinated) {
        log.info("Invoked Pet.Pet(String name, Kind kind, Gender gender, boolean vaccinated)");
        this.name = name;
        this.kind = kind;
        this.gender = gender;
    }

    public int getId() {
        log.info("Invoked Pet.getId()");
        return id;
    }

    public void setId(int id) {
        log.info("Invoked Pet.setId()");
        this.id = id;
    }

    public String getName() {
        log.info("Invoked Pet.getName()");
        return name;
    }

    public void setName(String name) {
        log.info("Invoked Pet.setName()");
        this.name = name;
    }

    public Kind getKind() {
        log.info("Invoked Pet.getKind()");
        return kind;
    }

    public void setKind(Kind kind) {
        log.info("Invoked Pet.setKind()");
        this.kind = kind;
    }

    public Gender getGender() {
        log.info("Invoked Pet.getGender()");
        return gender;
    }

    public void setGender(Gender gender) {
        log.info("Invoked Pet.setGender()");
        this.gender = gender;
    }

    public boolean isVaccinated() {
        log.info("Invoked Pet.isVaccinated()");
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        log.info("Invoked Pet.setVaccinated()");
        this.vaccinated = vaccinated;
    }
}
