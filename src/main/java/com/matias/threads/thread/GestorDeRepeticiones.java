package com.matias.threads.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GestorDeRepeticiones implements Runnable{
  public void consultarCargaDocumentosGedo(){
    ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    Runnable task = new GestorDeRepeticiones();
    executor.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
  }
  @Override
  public void run() {
    System.out.println("Resultado: " + Consultador.listaCompletaDeDocumentosGedo.size());
  }
}