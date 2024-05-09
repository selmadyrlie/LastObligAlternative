package com.example.lastobligalternative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    private Repository repo;

    @GetMapping("/hentAlle")
    public List<Billett> visBillett() {
        return repo.findAll(Sort.by(Sort.Direction.DESC, "etternavn"));
    }

    @PostMapping ("/lagre")
    public ResponseEntity<String> registerTicket(@RequestBody Billett billett) {
        repo.save(billett);

        return ResponseEntity.ok("Billett registrert!");
    }

    @DeleteMapping("/slettAlle")
    public ResponseEntity<String> clearTickets() {
        repo.deleteAll();
        return ResponseEntity.ok("Billetter slettet");
    }
}

