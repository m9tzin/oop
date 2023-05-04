package ProgramaMedia;

/*
@author Matheus Sousa Marinho
*/

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		double[] notas = new double[10];
	
		System.out.printf("Insira as notas: ", notas.length);

		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			notas[i]=leitor.nextDouble();
		}
		
		double m = calculoMedia(notas, notas.length);
		
		System.out.println("A média é = "+m);
		
		leitor.close();
	}
	
	public static double calculoMedia(double[] notas, int tamanho) {
		int i;
		double m, soma=0;
		
		for(i=0;i<10;i++) {
			soma+=notas[i];
		}
		
		m=soma/tamanho;
		
		return m;
	}
	

}
