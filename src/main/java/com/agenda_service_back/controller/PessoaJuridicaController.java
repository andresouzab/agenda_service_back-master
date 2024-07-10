package com.agenda_service_back.controller;


import com.agenda_service_back.DTO.PessoaJuridicaDTO;
import com.agenda_service_back.service.PessoaJuridicaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //habilita REST
@RequestMapping ("/pessoa_juridica") // localhost:8080/pessoa_juridica

public class PessoaJuridicaController {
    @Autowired
    private PessoaJuridicaService pessoaJuridicaService;

    @GetMapping // retorna uma lista de pessoas juridicas
    public ResponseEntity<List<PessoaJuridicaDTO>> getAllPessoasJuridicas(){
        List<PessoaJuridicaDTO> pessoaJuridicaDTO = pessoaJuridicaService.findAll();
        return ResponseEntity.ok(pessoaJuridicaDTO);
    }
    @GetMapping("/{id}") // localhost:8080/pessoas_juridicas/id
    public ResponseEntity<PessoaJuridicaDTO> getPessoaJuridicaById(@PathVariable Integer id){
        PessoaJuridicaDTO pessoaJuridicaDTO = pessoaJuridicaService.findById(id);
        return ResponseEntity.ok(pessoaJuridicaDTO);
    }
    @PostMapping
    public ResponseEntity<PessoaJuridicaDTO> createPessoaJuridica(@Valid @RequestBody PessoaJuridicaDTO pessoaJuridicaDTO){
        PessoaJuridicaDTO createPessoaJuridicaDTO = pessoaJuridicaService.create(pessoaJuridicaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createPessoaJuridicaDTO);

    }
    @PutMapping("/{id}")
    public ResponseEntity<PessoaJuridicaDTO> updatePessoaJuridica(@PathVariable Integer id, @Valid @RequestBody PessoaJuridicaDTO pessoaJuridicaDTO){
        PessoaJuridicaDTO updatePessoaJuridicaDTO = pessoaJuridicaService.update(id, pessoaJuridicaDTO);
        return ResponseEntity.ok(updatePessoaJuridicaDTO);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoaJuridica(@PathVariable Integer id){
        pessoaJuridicaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

