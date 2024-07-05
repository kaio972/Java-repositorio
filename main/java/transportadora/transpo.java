package transportadora;

import java.util.Scanner;

import transportado.Frete;
import transportado.TipoFrete;

public class transpo {

	public static void main(String[] args) {
		try(Scanner ler = new Scanner(System.in)) {
			
			System.out.println("informe a distancia");
	           int distancia= ler.nextInt();
	           System.out.println("opçoes 2/  1-correio 2-sedex");
		        int opçoes = ler.nextInt();
		        TipoFrete tipoFrete = TipoFrete.values()[opçoes -1];
		        
		        Frete frete = tipoFrete.obterFrete();
		        
		        double preco = frete.calcularPreco(distancia);
		        
		        System.out.printf("o RS :%.2f",preco);
		}
	}
}
