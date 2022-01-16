/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.unicesumar.entidade;

/**
 *
 * @author Alan
 */
public class CadastroPaciente {
    private String cpf;    
     private String nome;    
     private String sexo;    
     private Integer idade;      

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "CPF: "+this.getCpf()+ " \nNome: " + this.getNome()+ " \nSexo: "+ this.getSexo()+ " \nIdade "+ this.getIdade()+"\n";
    }
      
}
