package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.CodigoInvalidoException;
import com.example.demo.exception.NomeInvalidoException;
import com.example.demo.model.Materia;
import com.example.demo.repository.MateriaRepository;

@Transactional
@Service
public class MateriaService {

	
	@Autowired
	MateriaRepository repository;
	
	public List<Materia> listar(){
		List<Materia> materias = repository.findAll();
		return materias;
	}
	
	public Materia buscar(String nome) {
		return repository.findByNome(nome);
	}
	
	
	public ResponseEntity inserir(Materia m) {
		
		try {
			if(m.getNome() == null || m.getNome().isEmpty()) {
				throw new NomeInvalidoException("Nome inválido");
			}
			if(m.getCodigo() == null || m.getNome().isEmpty()) {
				throw new CodigoInvalidoException("Código inválido");
			}
			return ResponseEntity.ok(repository.save(m));
			//DUVIDA AQUI
		}catch(NomeInvalidoException e) {
			e.printStackTrace();
			return ResponseEntity.ok(e.getMessage());
		} catch (CodigoInvalidoException e) {			
			e.printStackTrace();
			return ResponseEntity.ok(e.getMessage());
		}		
	}

	public ResponseEntity remover(String nome) {
		repository.deleteByNome(nome);
		return ResponseEntity.ok("Materia removida");
	}
}
