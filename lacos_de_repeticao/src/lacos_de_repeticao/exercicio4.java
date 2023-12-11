package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int idade;
		 int genero;
		 int desenvolvedor;
		 String continua = "s";
		 int backEnd=0;
		 int mulheresFront=0;
		 int homensMobile40=0;
		 int naoBinarioFullmenor30=0;
		 int totalPessoas=0;
		 int totalIdade =0;
		 
		 		 
		 
		while(!continua.equals("n")) {
			totalPessoas++;	
		 System.out.println("digite a idade");
		  idade= leia.nextInt();
		  
		    System.out.println("\n-- Mulher Cis 1  ");
			System.out.println("\n-- Homem Cis 2 ");
			System.out.println("\n-- Não Binário 3 ");
			System.out.println("\n-- Mulher Trans 4 ");
			System.out.println("\n-- Homem Trans 5 ");
			System.out.println("\n-- Outros 6 ");
			
			System.out.println("Digite o número do gênero ");
			 genero= leia.nextInt();
			 
			 System.out.println("\n-- Backend 1 ");
				System.out.println("\n-- Frontend 2 ");
				System.out.println("\n-- Mobile 3");
				System.out.println("\n-- FullStack 4");
			 
				System.out.println("Digite o número do desenvolvedor ");
				 desenvolvedor= leia.nextInt();
				
				 if(desenvolvedor==1) {
					 backEnd++;
				 }
				 if(genero ==1 || genero==4 && desenvolvedor == 2) {
					 mulheresFront++;
				 }
				 if(genero==2 || genero ==5 && desenvolvedor == 3 && idade >40) {
					 homensMobile40++;
				 }
				 if(genero==3 && desenvolvedor ==4 && idade<30) {
				    naoBinarioFullmenor30++;
				 }
				 totalIdade+=idade;
				
				 	
				 
			 System.out.println("Deseja continuar a leitura dos dados S/N? ");
			 continua= leia.next();
				 
	}
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backEnd);
		System.out.println("Total de mulheres Cis e Trans desenvolvedoras FrontEnd: " +  mulheresFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maior de 40 anos: " + homensMobile40);
		System.out.println("Total de pessoas não Binárias desenvolvedoras FullStack menores de 30 anos: "+ naoBinarioFullmenor30);
		System.out.println("O número total de pessoas que responderam a pesquisa: " + totalPessoas);
		System.out.println("A média de idade das pessoas que responderam a pesquisa: " + totalIdade/totalPessoas );
		
		

}}
