/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.beans;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hamza
 */
public class Personne implements Serializable{

    private Integer idPersonne;
    
    @NotBlank(message = "Le nom ne doit pas être vide")
    @Size(max = 30, message ="Le nombre de caractère doit être inférieur à 30")
    private String nom;
    
    @NotNull(message = "Le prénom ne doit pas être vide")
    @Size(min = 2, message = "Le prénom ne doit pas faire moins de 2 caractères")
    @Size(max = 30, message ="Le nombre de caractère doit être inférieur à 30")
    private String prenom;

    public Personne() {

    }

    public Integer getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }
    
    public Personne (String prenom, String nom){
        this.setNom(nom);
        this.setPrenom(prenom);
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;

    }
    
    public String getFullName(){
        return getPrenom() + " " + getNom();
    } 
}
