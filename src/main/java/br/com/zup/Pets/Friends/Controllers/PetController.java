package br.com.zup.Pets.Friends.Controllers;

import br.com.zup.Pets.Friends.DTO.CadastroPetDTO;
import br.com.zup.Pets.Friends.DTO.ResumoPetDTO;
import br.com.zup.Pets.Friends.Models.Pet;
import br.com.zup.Pets.Friends.Services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pets/")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet cadastrarPet (@RequestBody CadastroPetDTO cadastroPetDTO){
        Pet pet = cadastroPetDTO.converterDTOParaPet();
        return petService.cadastrarPet(pet);
    }

    @GetMapping("{email}/")
    public ResumoPetDTO pesquisarPetPorEmail(@PathVariable String email){
        Pet pet =  petService.pesquisarPeloEmailDoDono(email);
        return ResumoPetDTO.converterPetParaDTO(pet);
    }



}
