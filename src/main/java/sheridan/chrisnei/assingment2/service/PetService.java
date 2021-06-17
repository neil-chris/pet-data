package sheridan.chrisnei.assingment2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sheridan.chrisnei.assingment2.model.Pet;
import sheridan.chrisnei.assingment2.repository.PetDataRepositoryJpa;
import java.util.*;

@Service
@Slf4j
public class PetService {

    @Autowired
    private PetDataRepositoryJpa repositoryJpa;

    public PetService(PetDataRepositoryJpa repositoryJpa) {
        log.info("Invoked PetService.PetService(PetDataRepositoryJpa repositoryJpa)");
        this.repositoryJpa = repositoryJpa;
    }

    public Pet getPet(int id) {
        log.info("Invoked PetService.getPet()");
        return repositoryJpa.findById(id);
    }

    public List<Pet> getAllPets() {
        log.info("Invoked PetService.getAllPets()");
       return repositoryJpa.findAll();
    }

    public void addPet(Pet pet){
        log.info("Invoked PetService.addPet()");
        repositoryJpa.save(pet);
    }

    public void deletePet(int id) {
        log.info("Invoked PetService.deletePet()");
        repositoryJpa.removeById(id);
    }

}
