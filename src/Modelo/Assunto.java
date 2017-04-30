/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author pc
 */
public class Assunto {
    private String nome;
    private int codigo;
    private String disciplina;
    private String grau_de_ensino;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getGrau_de_ensino() {
        return grau_de_ensino;
    }

    public void setGrau_de_ensino(String grau_de_ensino) {
        this.grau_de_ensino = grau_de_ensino;
    }
    
}
