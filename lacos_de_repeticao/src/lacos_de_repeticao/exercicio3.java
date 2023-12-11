package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int idade;
		int maior = 0;
		int menor = 0;
				
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("Digite uma idade");
		  idade= leia.nextInt();
		
		while(idade>0) {
			System.out.println("Digite uma idade");
			  idade= leia.nextInt();
			  if(idade < 0) {
				  
			  }else if(idade <21) {
				menor++;
			  }else if(idade > 50) {
				  maior++;
			  }
		}
		 
		System.out.println("Total de pessoas menores de 21 anos:" + menor);
		System.out.println("Total de pessoas maiores de 21 anos:" + maior);

	}

}
