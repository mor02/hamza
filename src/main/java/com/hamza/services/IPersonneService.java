/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamza.services;

import com.hamza.beans.Personne;
import java.util.List;

/**
 *
 * @author Hamza
 */
public interface IPersonneService {
    
    public void ajouter(Personne personne);
    
    public void supprimer (int id);
    
    public void modifier(Personne personne);
    
    public List<Personne> lister();
    
    public Personne rechercher(long id);
    
}

