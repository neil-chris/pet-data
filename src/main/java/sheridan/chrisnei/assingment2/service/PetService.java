package sheridan.chrisnei.assingment2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sheridan.chrisnei.assingment2.model.Pet;
import sheridan.chrisnei.assingment2.repository.PetDataRepositoryJpa;
import java.util.*;

@Service
public class PetService {

    @Autowired
    private PetDataRepositoryJpa repositoryJpa;

    public PetService(PetDataRepositoryJpa repositoryJpa) {
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
