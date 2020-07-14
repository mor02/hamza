/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.services;

import com.hamza.beans.Personne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamza
 */
public class PersonneServiceImpl implements IPersonneService{
    
    
    
    private static List<Personne> personnes = new ArrayList<>();

    static{
        Personne p1 = new Personne("Jean","Dujardin");
        Personne p2 = new Personne("Brad","Pitt");
        personnes.add(p1);
        personnes.add(p2);
    }
//    public static List<Personne> initListe(){
//        Personne p1 = new Personne("Jean","Dujardin");
//        Personne p2 = new Personne("Brad","Pitt");
//        personnes.add(p1);
//        personnes.add(p2);
//        return personnes;
//    }
    

    @Override
    public void ajouter(Personne personne) {
        personnes.add(personne);
    }

    @Override
    public void supprimer(int id) {
        for (int i = 0; i < personnes.size();i++){
            Personne personne = personnes.get(i);
            if(id == personne.getIdPersonne()){
                personnes.remove(i);
                return;
            }
        }
    }

    @Override
    public void modifier(Personne personne) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personne> lister() {
        return personnes;
    }

    @Override
    public Personne rechercher(long id) {
       for (int i = 0; i < personnes.size();i++){
            Personne personne = personnes.get(i);
            if(id == personne.getIdPersonne()){
                return personne;
            }
        }
       throw new RuntimeException("Personne inconnue");
    }
    
    
}
