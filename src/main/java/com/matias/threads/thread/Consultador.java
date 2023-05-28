package com.matias.threads.thread;

import com.matias.threads.model.DocumentoGedo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Consultador implements Runnable {
  public static List<DocumentoGedo> listaCompletaDeDocumentosGedo = new ArrayList<>();
  @Override
  public void run() {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Future<List<DocumentoGedo>> future = executor.submit(new ConsultaGedo());
    System.out.println("Inicia consulta a GEDO");
    try {
      listaCompletaDeDocumentosGedo = future.get();
    } catch (InterruptedException | ExecutionException e) {
      System.out.println("Saltó un error xD");
    }
    executor.shutdown();
  }
}