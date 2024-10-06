package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Pessoasvetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);
	
	   System.out.println("Quantas pessoas seram digitadas?  ");
	   
	   int n = sc.nextInt();
	   
	   String [] nomes = new String[n];
	   int [] idades = new int [n];
	   double[] alturas = new double[n];
	   
	   for(int i=0; i<n; i++ ) {
		   System.out.println("dados da " + (i+1 + "a pessoa:"));
		   System.out.println("Nome: ");
		   nomes[i] = sc.next();
		   System.out.println("idade: ");
		   idades[i] = sc.nextInt();
		   System.out.println("altura: ");
		   alturas[i] = sc.nextDouble();
	   }
	   
	   double soma = 0.0; // soma inicia com zero
	   for(int i=0; i<n; i++ ) {
	  soma = soma + alturas[i];
	}
	
	 double mediaAltura = soma / n;
	 
	 System.out.println();
	 System.out.printf("altura media: %.2f5n  ", mediaAltura);
	 
	 int contador = 0; // contador iniciar com zero
	 for(int i=0; i<n; i++ ) {
	   if (idades[i] < 16) {
		   contador = contador + 1;
	   }
	 
	 }
	   
	  double porcento = contador * 100 / n;
	   System.out.printf("pessoas com menos de 16 anos: %.1f%%%n", porcento);
	 
	   for(int i=0; i<n; i++ ) {
	    if (idades[i]< 16) {       // condiçao para mostras os nomes na tela, pessoas com menos de 16 anos 
	    	System.out.println(nomes[i]);
	    }
	   
	   }
	 sc.close();
	}
}
