package es.com.capgemini.finalproject.model;

/**
 * This class contains the attributes and methods of a character.
 * @author Paz, Viviana, Nerea, Cristina
 */
 
public class Vecna extends CharacterFactory {
	
	 /**
     * Constructors
     */
	
	public Vecna() 
	{
		this("vecna", VECNA);

	}
	public Vecna(String name, int number) {
		super(name, number);
		
	}
	
	/**
     * Method to compare the received number and the 
     * character number
     */

	@Override
	public boolean isMe(int number) {
		return number == VECNA;
		
	}
	
	/**
     * Method that evaluates all possible cases of game result
     * 
     */
	
	@Override
	public int compare(CharacterFactory pCharacterFactory) {
		 
		 int result = 0; 
		 int ReceivedNumber = pCharacterFactory.getNumber();
		 
		 switch (ReceivedNumber) { 
		 
		 case MIKE: 	 
	 case DUSTIN: result = 1; descriptionResult = name + " le gana " +
			 pCharacterFactory.getName(); break; 
		 		 
		
		 case MAX: 
		 case ELEVEN: result = -1; descriptionResult = name + " pierde contra " +
					 pCharacterFactory.getName(); break; 
		
		 default: result = 0;
		 descriptionResult = name + " empata con " +
		 pCharacterFactory.getName(); break;
		 } 
		 return result;
		 
		}
	

}
