package com.example.lastobligalternative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:63342", "http://localhost:8080"})
@RestController
public class Controller {

    @Autowired
    private Repository repo;

    @GetMapping("/hentAlle")
    public List<Billett> hentAlleBilletter() {
        return repo.findAll(Sort.by(Sort.Direction.DESC, "etternavn"));
    }

    @PostMapping ("/lagre")
    public ResponseEntity<String> lagre(@RequestBody Billett billett) {
        repo.save(billett);

        return ResponseEntity.ok("Billett registrert!");
    }

    @DeleteMapping("/slettAlle")
    public ResponseEntity<String> slettAlle() {
        repo.deleteAll();
        return ResponseEntity.ok("Billetter slettet");
    }
}

