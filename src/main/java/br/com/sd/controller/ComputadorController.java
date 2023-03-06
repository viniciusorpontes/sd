package br.com.sd.controller;

import br.com.sd.entity.Computador;
import br.com.sd.service.ComputadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/computadores")
public class ComputadorController {

    private final ComputadorService computadorService;

    public ComputadorController(ComputadorService computadorService) {
        this.computadorService = computadorService;
    }

    @GetMapping("/buscarTodos")
    public ResponseEntity<List<Computador>> buscarTodos() {
        return ResponseEntity.ok().body(computadorService.buscarTodos());
    }

}
