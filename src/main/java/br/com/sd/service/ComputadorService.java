package br.com.sd.service;

import br.com.sd.entity.Computador;
import br.com.sd.repository.ComputadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputadorService {

    private final ComputadorRepository computadorRepository;

    public ComputadorService(ComputadorRepository computadorRepository) {
        this.computadorRepository = computadorRepository;
    }

    public List<Computador> buscarTodos() {
        return computadorRepository.findAll();
    }

}
