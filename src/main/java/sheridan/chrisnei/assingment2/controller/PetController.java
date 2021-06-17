package sheridan.chrisnei.assingment2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import sheridan.chrisnei.assingment2.model.Gender;
import sheridan.chrisnei.assingment2.model.Pet;
import sheridan.chrisnei.assingment2.service.PetService;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/pet")
@Slf4j
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/all")
    public String showAllPets(Model model) {
        log.info("Invoked PetController.showAllPets() method");
        List<Pet> pets = petService.getAllPets();
        model.addAttribute("pets", pets);
        return "all-pets";
    }

    @GetMapping("/create")
    public String showAddPetForm(Model model) {
        log.info("Invoked PetController.showAddPetForm() method");
        Pet pet = new Pet();
        pet.setGender(Gender.FEMALE);
        model.addAttribute("pet", pet);
        return "create-pet";
    }

    @PostMapping("/create")
    public String addPet( @Valid Pet pet, Errors errors) {
        log.info("Invoked PetController.addPet() method");
        if (errors.hasErrors()) {
            return "create-pet";
        }
        petService.addPet(pet);
        return "redirect:/pet/all";
    }

    @Transactional
    @GetMapping("/delete/{id}")
    public String deletePet(@PathVariable("id") int id, Model model) {
        log.info("Invoked PetController.deletePet() method");
        petService.deletePet(id);
        return "redirect:/pet/all";
    }

    @GetMapping("/update/{id}")
    public String showUpdatePetForm(@PathVariable("id") int id, Model model) {
        log.info("Invoked PetController.showUpdateForm() method");
        Pet pet = petService.getPet(id);
        model.addAttribute("pet", pet);
        return "update-pet";
    }

    @PostMapping("/update/{id}")
    public String updatePet(@PathVariable("id") int id, @Valid Pet pet, BindingResult result, Model model) {
        log.info("Invoked PetController.updatePet() method");
        if (result.hasErrors()) {
            pet.setId(id);
            return "update-pet";
        }
        petService.addPet(pet);
        return "redirect:/pet/all";
    }
}
