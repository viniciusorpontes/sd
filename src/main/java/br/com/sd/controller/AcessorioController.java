package br.com.sd.controller;

import br.com.sd.entity.Acessorio;
import br.com.sd.service.AcessorioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/acessorios")
public class AcessorioController {

    private final AcessorioService acessorioService;

    public AcessorioController(AcessorioService acessorioService) {
        this.acessorioService = acessorioService;
    }

    @GetMapping("/buscarTodos")
    public ResponseEntity<List<Acessorio>> buscarTodos() {
        return ResponseEntity.ok().body(acessorioService.buscarTodos());
    }

}
