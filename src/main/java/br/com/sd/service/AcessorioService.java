package br.com.sd.service;

import br.com.sd.entity.Acessorio;
import br.com.sd.repository.AcessorioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcessorioService {

    private final AcessorioRepository acessorioRepository;

    public AcessorioService(AcessorioRepository acessorioRepository) {
        this.acessorioRepository = acessorioRepository;
    }

    public List<Acessorio> buscarTodos() {
        return acessorioRepository.findAll();
    }

}
