package br.com.zup.Pets.Friends.Services;

import br.com.zup.Pets.Friends.Models.Pet;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private static List<Pet> pets = new ArrayList<>();

    public Pet cadastrarPet(Pet pet) {
        pet.setDataDeEntrada(LocalDate.now());
        pets.add(pet);

        return pet;
    }

    public List<Pet> retornarListaDeTodosOsPets(){
        return pets;
    }

}
