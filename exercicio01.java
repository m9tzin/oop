package ProgramaMedia;

/*
@author Matheus Sousa Marinho
*/

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args){
		float media=0;
		media=calculoMedia(media);
		System.out.println("O valor da media eh = "+media);

	}
	
	public static float calculoMedia(float m){
		
		float n1, n2, n3;
		System.out.println("Insira tres notas: ");
		Scanner scanf = new Scanner(System.in);
		
		n1=scanf.nextFloat();
		n2=scanf.nextFloat();
		n3=scanf.nextFloat();
		scanf.close();
		
		m=(n1+n2+n3)/3;
		
		return m;
	}

}
