package es.com.capgemini.finalproject.model;

/**
 * This class contains the attributes and methods of a character.
 * @author Paz, Viviana, Nerea, Cristina
 */

public class Mike extends CharacterFactory {
	
	 /**
     * Constructors
     */
	
	public Mike() 
	{
		this("mike", MIKE);

	}
	public Mike(String name, int number) {
		super(name, number);
		
	}
	
	/**
     * Method to compare the received number and the 
     * character number
     */

	@Override
	public boolean isMe(int number) {
		return number == MIKE;
		
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
		 
		 case DUSTIN: 
		 case VECNA: result = -1; descriptionResult = name + " pierde contra " +
				 pCharacterFactory.getName(); break; 
		
		 case MAX: result = 1; descriptionResult = name + " le gana a " +
				 pCharacterFactory.getName(); break; 
				 
		 case ELEVEN: result = 1; descriptionResult = name + " le gana a " +
					 pCharacterFactory.getName(); break; 
					 
		
			 		 
		 default: result = 0;
		 descriptionResult = name + " empata con " +
		 pCharacterFactory.getName(); break;
		 } 
		 return result;
		 
		}
	

}
