package sheridan.chrisnei.assingment2.repository;

import sheridan.chrisnei.assingment2.model.*;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.*;

public interface PetDataRepositoryJpa extends JpaRepository<Pet, Integer> {
    Pet findById(int id);
    Pet findByName(String name);
    List<Pet> findByKind(Kind kind);
    List<Pet> findByGender(Gender gender);
    List<Pet> findAll();
    void add(Pet pet);
    void delete(int id);
    void deleteAll();
}
