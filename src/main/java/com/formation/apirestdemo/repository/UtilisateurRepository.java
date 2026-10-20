package com.formation.apirestdemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.formation.apirestdemo.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    /**
    * Recherche des produits dont l'email correspond au paramètre
    */
    Utilisateur findByEmail(String email);
}