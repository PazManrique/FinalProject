package es.com.capgemini.finalproject;

import java.util.Scanner;

import es.com.capgemini.finalproject.model.CharacterFactory;

public class Main {

	public static void main(String[] args) {
	System.out.println("Vamos a jugar a piedra, papel o tijera");
	System.out.println("Ingrese un número 1-Piedra 2-Papel 3-Tijera");
	Scanner sc = new Scanner(System.in);
	int nro = sc.nextInt();
	
	int nroOrdenador = (int)(Math.random()*5)+1;
	
	CharacterFactory pptUsuario = CharacterFactory.getInstance(nro);
	CharacterFactory pptOrdenador = CharacterFactory.getInstance(nroOrdenador);
	
	pptUsuario.compare(pptOrdenador);
	
	System.out.println("\n\nEl resultado del juego es...");
	System.out.println("El usuario eligió; " + pptUsuario.getName());
	System.out.println("El ordenador eligió; " + pptOrdenador.getName());
	System.out.println("resultado " + pptUsuario.getDescriptionResult());
	sc.close();
	}

	
}
