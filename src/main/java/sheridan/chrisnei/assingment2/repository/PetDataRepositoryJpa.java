package sheridan.chrisnei.assingment2.repository;

import sheridan.chrisnei.assingment2.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface PetDataRepositoryJpa extends JpaRepository<Pet, Integer> {
    Pet findById(int id);
    List<Pet> findAll();
    void removeById(int id);
}
