package br.com.zup.Pets.Friends.DTO;


import br.com.zup.Pets.Friends.Models.Pet;

public class CadastroPetDTO {

    private String nome;
    private String raca;
    private String especie;
    private String nomeDoDono;
    private String email;

    public CadastroPetDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pet converterDTOParaPet() {
        Pet pet = new Pet();
        pet.setNome(this.nome);
        pet.setEmail(this.email);
        pet.setRaca(this.raca);
        pet.setEspecie(this.especie);
        pet.setNomeDoDono(this.nomeDoDono);
        return pet;


    }
}
