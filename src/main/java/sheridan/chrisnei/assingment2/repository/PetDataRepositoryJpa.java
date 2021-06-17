package sheridan.chrisnei.assingment2.repository;

import org.springframework.stereotype.Repository;
import sheridan.chrisnei.assingment2.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

@Repository
public interface PetDataRepositoryJpa extends JpaRepository<Pet, Integer> {
    Pet findById(int id);
    List<Pet> findAll();
    void removeById(int id);
}
