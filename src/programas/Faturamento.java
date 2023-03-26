package programas;

import java.io.FileReader;
import com.google.gson.Gson;

public class Faturamento {
  public static void main(String[] args) throws Exception {
    Gson gson = new Gson();
    FileReader reader = new FileReader("./src/programas/dados.json");

    Dia[] dias = gson.fromJson(reader, Dia[].class);
    Double menor = dias[0].valor, maior = dias[0].valor, media = 0.0, soma = 0.0;
    
    for (Dia dia : dias) {
    	if(dia.valor > 0.0) {
    		if(dia.valor < menor) {
    			menor = dia.valor;
    		}
    		if(dia.valor > maior) {
    			maior = dia.valor;
    		}
    		media++;
    		soma += dia.valor;
    	}
    }
    media= soma/media;
    soma = 0.0;
    for (Dia dia : dias) {
    	if (dia.valor > media) {
    		soma++;
    }
    }
    System.out.println("Menor faturamento: "+menor);
    System.out.println("Mair faturamento: "+maior);
    System.out.println("Dias com faturamento superior a média mensal: "+soma);
  }

  static class Dia {
    String dia;
    double valor;
  }
}
