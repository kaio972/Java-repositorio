import java.util.Scanner;

public class whif {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		  Integer [] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
			
		   
		 int i = 0;
		   
		   while(i < numeros.length)
		   {
			  Integer numero = numeros[i];
			  
			  if (numero%3 == 0)
				  
				  System.out.println("numeros divisiveis po 3 : "  + numeros[i]);
		   }
		   i++;
		}
	

	

}
