package br.com.zup.Pets.Friends.DTO;

import br.com.zup.Pets.Friends.Models.Pet;

import java.time.LocalDate;

public class ResumoPetDTO {

    private String nome;
    private String raca;
    private String especie;
    private LocalDate dataDeEntrada;

    public ResumoPetDTO(String nome, String raca, String especie, LocalDate dataDeEntrada) {
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.dataDeEntrada = dataDeEntrada;
    }

    public static ResumoPetDTO converterPetParaDTO(Pet pet){
        ResumoPetDTO resumoPetDTO = new ResumoPetDTO(pet.getNome(), pet.getRaca(),
                pet.getEspecie(), pet.getDataDeEntrada());

        return resumoPetDTO;
    }
}
