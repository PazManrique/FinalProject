package es.com.capgemini.finalproject.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CharacterFactory {
	public static final int DUSTIN = 1;
	public static final int ELEVEN = 2;
	public static final int MAX = 3;
	public static final int MIKE = 4;
	public static final int VECNA = 5;

	protected String descriptionResult;
	private static List<CharacterFactory> elements;
	protected String name;
	protected int number;

	// Constructores

	/**
	 * 
	 */
	public CharacterFactory(String name, int number) {
		this.name = name;
		this.number = number;
	}

	// Accesos

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescriptionResult() {
		return descriptionResult;
	}

	// Métodos de negocio

	public abstract boolean isMe(int number);

	public abstract int comparar(CharacterFactory pCharacters);

	public static CharacterFactory getInstance(int pNumber) {
		// el padre conoce a todos sus hijos
		elements = new ArrayList<CharacterFactory>();
		elements.add(new Dustin());
		elements.add(new Eleven());
		elements.add(new Max());
		elements.add(new Mike());
		elements.add(new Vecna());
		
		
	

		for (CharacterFactory CharacterFactory : elements) {
			if (CharacterFactory.isMe(pNumber))
				return CharacterFactory;
		}
		return null;
	}

}
