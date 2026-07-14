package br.com.alura.projeto.screensound;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSound implements CommandLineRunner {

	private final Principal principal;

	ScreenSound(Principal principal) {
		this.principal = principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(ScreenSound.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
