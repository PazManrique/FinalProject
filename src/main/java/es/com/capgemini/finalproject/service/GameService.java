package es.com.capgemini.finalproject.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import es.com.capgemini.finalproject.model.CharacterFactory;

//@Service
public class GameService {
	int playerNumber= (int)(Math.random()*5)+1;
	int computerNumber = (int)(Math.random()*5)+1;
	CharacterFactory playerChoiceNumber = CharacterFactory.getInstance(playerNumber);
	String playerChoiceName = playerChoiceNumber.getName();
		
		CharacterFactory computerChoiceNumber = CharacterFactory.getInstance(computerNumber);
		String computerChoiceName = computerChoiceNumber.getName();
		
				
				public void computerChoice1( ) {
		
					computerChoiceNumber.compare(playerChoiceNumber);
		
		System.out.println("\n\nEl resultado del juego es...");
		System.out.println("El usuario eligió; " + playerChoiceName);
		System.out.println("El ordenador eligió; " + computerChoiceName);
		
		}

}
