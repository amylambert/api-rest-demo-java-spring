package com.formation.apirestdemo.controller;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
public class BonjourController {
    
    public BonjourController() {}

    // ============================================================
    // GET /api/v1/bonjour — Retourne "Bonjour tout le monde !"
    // ============================================================
    @GetMapping
    public ResponseEntity<String> bonjourTous() {
        String message = "Bonjour tout le monde !";
        return ResponseEntity.ok(message); // 200 OK
    }

    // ============================================================
    // GET /api/v1/bonjour/{prenom} — Retourne "Bonjour {prenom} !"
    // ============================================================
    @GetMapping("/{prenom}")
    public ResponseEntity<String> bonjourParPrenom(@PathVariable String prenom) {
        String message = String.format("Bonjour %s !", prenom);
        return ResponseEntity.ok(message); // 200 OK
    }
    
    // ============================================================
    // POST /api/v1/bonjour/{prenom} — Retourne "Bienvenue {prenom} !"
    // ============================================================
    @PostMapping
    public ResponseEntity<String> bienvenuePrenom(@Valid @RequestBody String prenom) {
        String message = String.format("Bienvenue %s !", prenom);
        return ResponseEntity
            .status(HttpStatus.OK) // 200 OK
            .body(message);
    }
    
}
