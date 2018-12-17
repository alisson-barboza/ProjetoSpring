package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MatriculaDTO;
import com.example.demo.exception.IdadeInvalidaException;
import com.example.demo.exception.NomeInvalidoException;
import com.example.demo.model.Aluno;
import com.example.demo.model.Materia;
import com.example.demo.repository.AlunoRepository;


@Transactional
@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	@Autowired
	private MateriaService materiaService;
	
	
	public List<Aluno> listar() {		
		List<Aluno> alunos = repository.findAll();
		return alunos;		
	}	
	
	public Aluno buscarPorNome(String nome) {
		return repository.findByNome(nome);
	}
	
	@SuppressWarnings("rawtypes")
	public ResponseEntity inserir(Aluno a) {	
		try {
			if(a.getNome() == null || a.getNome().isEmpty()) {
				throw new NomeInvalidoException("Nome inválido");
			}
			if(a.getIdade() < 0) {
				throw new IdadeInvalidaException("Idade inválida");
			}
			return ResponseEntity.ok(repository.save(a));
			
		}catch(NomeInvalidoException e) {
			e.printStackTrace();
			return ResponseEntity.ok(e.getMessage());
			
		} catch (IdadeInvalidaException e) {			
			e.printStackTrace();
			return ResponseEntity.ok(e.getMessage());
			
		}	
	}
	
	
	public void remover(String nome) {
		repository.deleteByNome(nome);
	}

	public ResponseEntity matricular(MatriculaDTO dto) {
		Aluno aluno = repository.findByNome(dto.getAluno().getNome());
		
		for(Materia m : dto.getMaterias()) {
			m = materiaService.buscar(m.getNome());
			aluno.getMaterias().add(m);
		}		
		return ResponseEntity.ok(repository.save(aluno));
	}

}
