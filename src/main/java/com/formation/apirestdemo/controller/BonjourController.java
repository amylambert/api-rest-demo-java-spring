package com.formation.apirestdemo.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/bonjour")
public class BonjourController {
    
    public BonjourController() {}

    // ============================================================
    // GET /api/v1/bonjour — Retourne "Bonjour tout le monde !"
    // ============================================================
    @GetMapping
    public Map<String, String> bonjour() {
        return Map.of("message", "Bonjour le monde !");
    }

    // ============================================================
    // GET /api/v1/bonjour/{prenom} — Retourne "Bonjour {prenom} !"
    // ============================================================
    @GetMapping("/{prenom}")
    public Map<String, String> bonjourParPrenom(@PathVariable String prenom) {
        return Map.of("message", "Bonjour " + prenom + " !");
    }
    
    // ============================================================
    // POST /api/v1/bonjour/{prenom} — Retourne "Bienvenue {prenom} !"
    // ============================================================
    @PostMapping
    public Map<String, String> bienvenue(@RequestBody Map<String, String> corps) {
        return Map.of("message", "Bienvenue " + corps.get("prenom") + " !");
    }
    
}
