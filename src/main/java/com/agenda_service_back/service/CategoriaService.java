
package com.agenda_service_back.service;

import com.agenda_service_back.DTO.CategoriaDTO;
import com.agenda_service_back.entity.Categoria;
import com.agenda_service_back.mapper.CategoriaMapper;
import com.agenda_service_back.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CategoriaMapper categoriaMapper;


    //buscar todas as categorias
    public List<CategoriaDTO> findAll(){
        List<Categoria> categorias =
                categoriaRepository.findAll();
        return categorias.stream()
                .map(categoriaMapper::toDTO)
                .collect(Collectors.toList());
    }
    //buscar uma categoria pelo id
    public CategoriaDTO findById(Integer id){
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Categoria nâo encontrada"));
        return categoriaMapper.toDTO(categoria);
    }
    //criando uma nova categoria
    public CategoriaDTO create(CategoriaDTO categoriaDTO){
        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        categoria = categoriaRepository.save(categoria);
        return categoriaMapper.toDTO(categoria);
    }
    //update categoria
    public CategoriaDTO update(Integer id,CategoriaDTO categoriaDTO){
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Categoria não"));
        categoria = categoriaMapper.updateEntity(categoriaDTO,categoria);
        categoria = categoriaRepository.save(categoria);
        return categoriaMapper.toDTO(categoria);
    }
    public void deleteById(Integer id){
        categoriaRepository.deleteById(id);
    }
}
