package model;

import java.util.Scanner;

public class AppTarefa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("----MENU PRINCIPAL-----");
			System.out.println("1 - Inclusão de Tarefa");
			System.out.println("2 - Consulta de Tarefa");
			System.out.println("3 - Alteração de Tarefa");
			System.out.println("4 - Exclusão de Tarefa");
			System.out.println("0 - F I M ");
			System.out.println("Digite a opção desejada:");
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				System.out.println("Inclusão de selecionada");
			} else if(opcao ==2) {
				System.out.println("Consulta selecionada");
			} else if (opcao ==3) {
				System.out.println("Alteração selecionada");
			} else if(opcao == 4) {
				System.out.println("Exclusão selecionada");
			} else {
				System.out.println("Aplicação encerrada");				
			}
		} while (opcao !=0);
	
         scanner.close();
	}
}



