package com.fourcatsdev.aula20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula20Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula20Application.class, args);
		/*
			Depois de cadastrado, para se logar,
			deve ser atualizado direto no banco
			na tabela de usuarios
			o atributo ativo=true
			
			Para se logar como administrador ou bibliotecario,
			deve ser atualizado direto no banco
			na tabela usuario_papel
			atribuir o id correspondente de papel do usuário
			papel_id=?
		*/
	}
}