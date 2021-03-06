package sheridan.chrisnei.assingment2.service;

import org.springframework.beans.factory.annotation.Autowired;
import sheridan.chrisnei.assingment2.model.Pet;
import sheridan.chrisnei.assingment2.repository.PetDataRepositoryJpa;
import java.util.*;

public class PetDataService {

    @Autowired
    private PetDataRepositoryJpa repositoryJpa;

    public PetDataService(PetDataRepositoryJpa repositoryJpa) {
        this.repositoryJpa = repositoryJpa;
    }

    public Pet getPet(int id) {
        return repositoryJpa.findById(id);
    }

    public List<Pet> getAllPets() {
       return repositoryJpa.findAll();
    }

    public void addPet(Pet pet){
        repositoryJpa.save(pet);
    }

    public void deletePet(Pet pet) {
        repositoryJpa.removeById(pet.getId());
    }

}
