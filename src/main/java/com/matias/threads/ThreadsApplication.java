package com.matias.threads;

import com.matias.threads.thread.Consultador;
import com.matias.threads.thread.GestorDeRepeticiones;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreadsApplication.class, args);

		System.out.println("Programa iniciado");
		Consultador consultador = new Consultador();
		Thread thread = new Thread(consultador);
		thread.start();
		GestorDeRepeticiones repeticiones = new GestorDeRepeticiones();
		repeticiones.consultarCargaDocumentosGedo();
	}

}
