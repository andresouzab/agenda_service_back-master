
package com.agenda_service_back.service;
import com.agenda_service_back.DTO.PessoaJuridicaDTO;
import com.agenda_service_back.entity.PessoaJuridica;
import com.agenda_service_back.mapper.PessoaJuridicaMapper;
import com.agenda_service_back.repository.PessoaJuridicaRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaJuridicaService {
    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    private PessoaJuridicaMapper pessoaJuridicaMapper;


    //buscar todas as pessoas juridicas
    public List<PessoaJuridicaDTO> findAll(){
        List<PessoaJuridica> pessoaJuridica =
                pessoaJuridicaRepository.findAll();
        return pessoaJuridica.stream()
                .map(pessoaJuridicaMapper::toDTO)
                .collect(Collectors.toList());
    }
    //buscar um pessoa juridica pelo id
    public PessoaJuridicaDTO findById(Integer id){
        PessoaJuridica pessoaJuridica = pessoaJuridicaRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Pessoa Juridica nâo encontrado"));
        return pessoaJuridicaMapper.toDTO(pessoaJuridica);
    }
    //criando uma pessoa Juridica
    public PessoaJuridicaDTO create(PessoaJuridicaDTO pessoaJuridicaDTO){
        PessoaJuridica pessoaJuridica = pessoaJuridicaMapper.toEntity(pessoaJuridicaDTO);
        pessoaJuridica = pessoaJuridicaRepository.save(pessoaJuridica);
        return pessoaJuridicaMapper.toDTO(pessoaJuridica);
    }
    //update pessoa
    public PessoaJuridicaDTO update(Integer id, PessoaJuridicaDTO pessoaJuridicaDTO){
        PessoaJuridica pessoaJuridica = pessoaJuridicaRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Pessoa Juridica não encontrado"));
        pessoaJuridicaDTO.setId(id);
        pessoaJuridica = pessoaJuridicaMapper.updateEntity(pessoaJuridicaDTO, pessoaJuridica);
        pessoaJuridica = pessoaJuridicaRepository.save(pessoaJuridica);
        return pessoaJuridicaMapper.toDTO(pessoaJuridica);
    }
    public void deleteById(Integer id){
        pessoaJuridicaRepository.deleteById(id);
    }
}
