package Banco;

import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner cliente1 = new Scanner(System.in);
		Scanner comando1 = new Scanner(System.in);
		Scanner comando2 = new Scanner(System.in);
		Scanner saque1 = new Scanner(System.in);
		String d1 ="Depositar";
		String s1 ="Sacar";
		String s3 ="";	
		
		
		//construtor
		Conta c1 = new Conta("Cliente 1");
		System.out.println("Parabens cliente 1");
		System.out.println("Conta Criada com sucesso!\nSeu "+c1.toString());
		System.out.println("O que deseja fazer agora?:");
			
		if(d1.equalsIgnoreCase(comando1.next())) {
			System.out.println("Qual valor a ser depositado");
			c1.depositar(cliente1.nextFloat());
			System.out.println("\nDeposito realizado com sucesso! \nSeu novo "+ c1.toString()+"\n");
			System.out.println("O que deseja fazer agora?;");}
		else {
			System.out.println("Digite uma das opções");
			System.out.println("Sacar ou Depositar");
		}
		
		if(s1.equalsIgnoreCase(comando2.next()));{
			System.out.println("Quanto Deseja Sacar ?");
			c1.sacar(saque1.nextFloat());
			System.out.println("\nSeu "+ c1.toString()+"\n");
			}if (s1.equalsIgnoreCase(" ")) {
				System.out.println("Digite algo valido");
				
			} 
				
			
	
				
		}
		}
			
			
		
		
	
		

		
		
		
		
		
		
		
		
		
	
	

