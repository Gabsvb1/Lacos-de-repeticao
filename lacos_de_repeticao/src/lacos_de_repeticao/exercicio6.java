package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int numero;
		float resultado = 0;
		int contador = -1;
		Scanner leia = new Scanner(System.in);
		
		do {
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();

            if( numero % 3 == 0 ){
            	resultado = resultado + numero; 
            	contador++;
            }

          
        } while (numero != 0);
			System.out.println(contador);
		  System.out.println("\n A média de todos os números multiplos de 3 é: " + resultado/contador);

		

	}

}
