package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
		
	int numero1;
	int numero2;
	int contador;
	
	System.out.println("digite o primeiro número do intervalo");
	numero1=leia.nextInt();
	
	System.out.println("digite o segundo número do intervalo");
	numero2=leia.nextInt();
	
	if(numero1 > numero2) {
		System.out.println("Intervalo Invalido!");
	
		
	}else {
		for(contador = numero1; contador <= numero2; contador++) {
			if(contador % 3 == 0 && contador % 5 ==0) {
				System.out.println(contador + " é multiplo de 3 e 5");
			}
		}
		
	}
	
	
	
	
	}
	
	
	
	
	

}
