package br.com.fiap.TrafficManagement.controller;

import br.com.fiap.TrafficManagement.model.Trafego;
import br.com.fiap.TrafficManagement.repository.TrafegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid; // Atualizado para usar jakarta.validation
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trafegos")
public class TrafegoController {

    @Autowired
    private TrafegoRepository trafegoRepository;

    @GetMapping
    public List<Trafego> getAllTrafegos() {
        return trafegoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Trafego> createTrafego(@RequestBody @Valid Trafego trafego) {
        Trafego createdTrafego = trafegoRepository.save(trafego);
        return ResponseEntity.ok(createdTrafego);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trafego> getTrafegoById(@PathVariable Long id) {
        Optional<Trafego> trafego = trafegoRepository.findById(id);
        return trafego.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trafego> updateTrafego(@PathVariable Long id, @RequestBody @Valid Trafego updatedTrafego) {
        if (!trafegoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        updatedTrafego.setId(id);
        Trafego savedTrafego = trafegoRepository.save(updatedTrafego);
        return ResponseEntity.ok(savedTrafego);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrafego(@PathVariable Long id) {
        if (!trafegoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        trafegoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
