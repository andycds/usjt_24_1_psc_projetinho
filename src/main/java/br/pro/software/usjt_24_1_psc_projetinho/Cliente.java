/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.usjt_24_1_psc_projetinho;

/**
 *
 * @author andyc
 */
public class Cliente{
    private String nome, email;
    private int idade;

    public Cliente() {
    }

    public Cliente(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public void salvar(){
        System.out.println("Agora eu chamo o inserir do ClienteDAO e passo eu mesmo para ele.");
        System.out.println(this);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            ", idade='" + getIdade() + "'" +
            "}";
    }

}
