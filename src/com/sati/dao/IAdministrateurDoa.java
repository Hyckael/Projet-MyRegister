package com.sati.dao;

import java.util.List;

import com.Administrateur;

public interface IAdministrateurDoa {

 void saveStudent(Administrateur admin);

 void updateStudent(Administrateur admin);

 Administrateur getAdministrateurById(int id_Admin);

 List<Administrateur> getAllAdministrateur();

 void deleteAdministrateur(int Admin);
 
 List <Administrateur> rechercher(String nom);

}
