package br.com.diferpan.aulasdev.projetoSpring01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpring01Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ProjetoSpring01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Word, first sprint boot project!");
	}
}
