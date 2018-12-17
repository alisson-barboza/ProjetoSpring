package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;


@SpringBootApplication
public class LeveApplication implements CommandLineRunner {
	
	@Autowired
	AlunoService service;
	
	public static void main(String[] args) {
		SpringApplication.run(LeveApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		/*Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.setNome("Alisson");
		aluno1.setIdade(21);
		
		aluno2.setNome("Bruno");
		aluno2.setIdade(20);

		aluno3.setNome("Mariana");
		aluno3.setIdade(22);

		service.inserir(aluno1);
		service.inserir(aluno2);
		service.inserir(aluno3);
		
		
		List<Aluno> result = service.listar();
		result.forEach(a-> System.out.println(a.getNome() + " " + a.getIdade()));
*/
	}

}


