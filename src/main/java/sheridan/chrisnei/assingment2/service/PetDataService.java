package sheridan.chrisnei.assingment2.service;

import sheridan.chrisnei.assingment2.model.Gender;
import sheridan.chrisnei.assingment2.model.Kind;
import sheridan.chrisnei.assingment2.model.Pet;
import sheridan.chrisnei.assingment2.repository.PetDataRepositoryJpa;
import java.util.*;

public class PetDataService {
    private PetDataRepositoryJpa repositoryJpa;
    public PetDataService(PetDataRepositoryJpa repositoryJpa) {
        this.repositoryJpa = repositoryJpa;
    }

    public Pet getPet(int id) {
        return repositoryJpa.findById(id);
    }

    public List<Pet> getPetsByKind(Kind kind) {
        return repositoryJpa.findByKind(kind);
    }

    public List<Pet> getPetsByGender(Gender gender) {
        return repositoryJpa.findByGender(gender);
    }

    public List<Pet> getAllPets() {
       return repositoryJpa.findAll();
    }

    public void addPet(Pet pet){
        repositoryJpa.add(pet);
    }

    public void deletePet(int id) {
        repositoryJpa.delete(id);
    }

    public void deleteAllPets() {
        repositoryJpa.deleteAll();
    }
}
