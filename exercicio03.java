package ProgramaMedia;

/*
@author Matheus Sousa Marinho
*/

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		double[] notas = new double[10];
		double lernota;
		
		System.out.printf("Insira as notas: ", notas.length);

		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			while(true) {
				lernota = leitor.nextDouble();
				if(lernota >= 0 && lernota <= 10)
					break;
				else
					System.out.println("A nota inserida é invalido, insira uma nota entre 0 e 10.");
			}
			
			notas[i]=lernota;
			
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
