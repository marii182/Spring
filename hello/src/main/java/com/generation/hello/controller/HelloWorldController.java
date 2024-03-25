package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping() //Requisições do tipo Get/Busca
	public String hello() {
		return "Hello World <br> Turma 73! <br> Persistência, Mentalidade de Crescimento, Responsabilidade Pessoa, Orientação ao Futuro, Trabalho em Equipe, Orientação ao Detalhe, Proatividade, Comunicação. <br> Meu objetivo de aprendizagem dessa semana é aprender sobre Spring, que é um assunto novo no qual nunca tive contato antes.";
	}
	
}
