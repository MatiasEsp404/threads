package com.matias.threads.thread;

import com.matias.threads.model.DocumentoGedo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public 	class ConsultaGedo implements Callable<List<DocumentoGedo>> {
  public List<DocumentoGedo> call() throws Exception {
    List<DocumentoGedo> documentoGedos = new ArrayList<>();
    Thread.sleep(2000);
    for (int i = 0; i < 100; i++) {
      documentoGedos.add(new DocumentoGedo(String.valueOf(i)));
    }
    return documentoGedos;
  }
}