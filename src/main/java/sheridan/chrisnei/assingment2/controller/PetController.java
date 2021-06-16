package sheridan.chrisnei.assingment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sheridan.chrisnei.assingment2.model.Gender;
import sheridan.chrisnei.assingment2.model.Kind;
import sheridan.chrisnei.assingment2.model.Pet;
import sheridan.chrisnei.assingment2.service.PetService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/all")
    public String showAllPets(Model model) {
        addPets();
        List<Pet> pets = petService.getAllPets();
        model.addAttribute("pets", pets);
        return "all-pets";
    }

    @GetMapping("/delete/{id}")
    public String deletePet(@PathVariable("id") int id, Model model) {
        Pet pet = petService.getPet(id);
//                .orElseThrow(() -> new IllegalArgumentException("Invalid pet Id:" + id));
        petService.deletePet(pet);
        return "redirect:/pet/all";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Pet pet = petService.getPet(id);
        model.addAttribute("pet", pet);
        return "update-pet";
    }

    @PostMapping("/update/{id}")
    public String updatePet(@PathVariable("id") int id, @Valid Pet pet,
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            pet.setId(id);
            return "update-pet";
        }

        petService.addPet(pet);
        return "redirect:pet/all";
    }

    private void addPets() {
        Pet pet1 = new Pet("Boogie", Kind.DOG, Gender.MALE, true);
        Pet pet2 = new Pet("Purity", Kind.CAT, Gender.FEMALE, true);
        Pet pet3 = new Pet("Bunny", Kind.RABBIT, Gender.MALE, true);

        petService.addPet(pet1);
        petService.addPet(pet2);
        petService.addPet(pet3);
    }
}
