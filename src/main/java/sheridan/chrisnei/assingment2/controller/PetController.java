package sheridan.chrisnei.assingment2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sheridan.chrisnei.assingment2.model.Pet;
import sheridan.chrisnei.assingment2.service.PetDataService;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {

    private PetDataService petDataService;

    @GetMapping("/all")
    public void listPets(Model model) {
        List<Pet> pets = petDataService.getAllPets();
    }

    @GetMapping("/delete/{id}")
    public String deletePet(@PathVariable("id") int id, Model model) {
        Pet pet = petDataService.getPet(id);
//                .orElseThrow(() -> new IllegalArgumentException("Invalid pet Id:" + id));
        petDataService.deletePet(pet);
        return "redirect:/pet/all";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Pet pet = petDataService.getPet(id);
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

        petDataService.addPet(pet);
        return "redirect:pet/all";
    }
}
