package es.com.capgemini.finalproject.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This class has the attributes and methods of a character
 * @author Nerea, Paz, Viviana, Cristina
 * 
 */


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

	/**
	 * Constructors
	 */
	
	public CharacterFactory(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public CharacterFactory() {
		
	}

	/**
	 * Access getters and setters
	 */

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
	

	public abstract boolean isMe(int number);

	public abstract int compare(CharacterFactory pCharacters);

	public static CharacterFactory getInstance(int pNumber) {
		
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
