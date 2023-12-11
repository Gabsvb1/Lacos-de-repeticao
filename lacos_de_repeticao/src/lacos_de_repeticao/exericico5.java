package lacos_de_repeticao;

import java.util.Scanner;

public class exericico5 {

	public static void main(String[] args) {
		int numero;
		int resultado = 0;
		int contador = 0; 
		  Scanner leia = new Scanner(System.in);
		
		do {
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();

            if(numero> 0){
            	resultado = resultado + numero;
            }

          
        } while (numero != 0);
			
		  System.out.println("\n A soma dos números positivos é: " + resultado);

	}

}
