package edu.rgoncar723.ssh;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Investiga el uso de random y genera por pantalla los números de la lotería
		/*
		 * Random: Es una clase del package java.util que pemite generar numeros
		 * aleatorios en pantalla.
		 */
		// primitiva.
		Random random = new Random();
		int number = 0;
		System.out.println("¡Buena suerte en el sorteo!");
		System.out.println("Números de la Lotería Primitiva:");
		// Genera 5 números principales
		System.out.println("Numeros de la loteria: ");
		for (int i = 0; i <= 5; i++) {
			number = random.nextInt(99) + 1;
			System.out.print(number + " ");
		}

		// Número complementario
		for (int i = 0; i <= 1; i++) {
			number = random.nextInt(99) + 1;
		}
		System.out.printf("\nNumero complementario: %d", number);
		System.out.println("Cambio realizado desde GitHub.");

	}

}
