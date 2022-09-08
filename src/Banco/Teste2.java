package Banco;

import javax.swing.JOptionPane;

public class Teste2 {
	public static void main(String[] args) {
		//Escreva um programa que retorne o valor hora de um funcionario com base
		//no seu salario mensal e horas trabalhadas
		String salario= JOptionPane.showInputDialog("Quanto é o seu salario mensal?: ")  ;
		String horasTrabalhadas= JOptionPane.showInputDialog("Quantas horas você trabaçha ao mes?: ")  ;
		double salario1 = Double.parseDouble(salario);
		double horas1 = Double.parseDouble(horasTrabalhadas);
		double total = (salario1 / horas1);
		System.out.printf("Você ganha %.2f reais por hora trabalhada",total );
	
	}

}
