package Herença_e_Polimorfismo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ArrayElementAccess2 { //Declaração da classe principal chamada ArrayElementAccess2.

	public static void main(String[] args) {
		
		// Chama o método method1 para iniciar a execução do programa.
		method1();
		
		// Exibe uma mensagem indicando o fim do programa.
		 System.out.println("End of program");
	}
	
	// Declaração do método method1.
	public static void method1() {
		System.out.println("+++METHOD1 START+++"); // Exibe uma mensagem indicando o início do method1.
		method2();
		System.out.println("+++METHOD1 END+++"); // Exibe uma mensagem indicando o fim do method1.
	}

	
	public static void method2() {
		System.out.println("+++METHOD2 START+++");
Scanner sc = new Scanner(System.in);
		
try {
    // Lê uma linha de entrada e divide em um vetor de strings
    String[] vect = sc.nextLine().split(" ");

    // Lê um número inteiro que representa uma posição no vetor
    int position = sc.nextInt();

    // Tenta imprimir o elemento na posição especificada
    System.out.println(vect[position]);
} catch (ArrayIndexOutOfBoundsException e) {
    // Trata uma exceção se a posição estiver fora dos limites do vetor
    System.out.println("Invalid position!");
    
    // Imprime o rastreamento da pilha de exceções para depuração
    e.printStackTrace();
    
    // Lê o próximo token para evitar um loop infinito em caso de erro
    sc.next();
} catch (InputMismatchException e) {
    // Trata uma exceção se a entrada do usuário não for um número inteiro
    System.out.println("Input error");
} finally {
    // Fecha o scanner para liberar recursos
    sc.close();
}

// Imprime uma mensagem indicando o final do método
System.out.println("+++METHOD2 END+++");
}
}