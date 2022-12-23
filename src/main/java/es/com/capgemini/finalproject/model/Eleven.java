package es.com.capgemini.finalproject.model;

/**
 * This class contains the attributes and methods of a character.
 * @author Paz, Viviana, Nerea, Cristina
 */

public class Eleven extends CharacterFactory {
/**
* Constructors
* */

public Eleven() 
{
	this("eleven", ELEVEN);

}
public Eleven(String name, int number) {
	super(name, number);
	
}

/**
 * Method to compare the received number and the 
 * character number
 */

@Override
public boolean isMe(int number) {
	return number == ELEVEN;
	
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
	 case MAX: result = -1; descriptionResult = name + " pierde contra " +
			 pCharacterFactory.getName(); break; 
			 
	 case DUSTIN: 	 
	 case VECNA: result = 1; descriptionResult = name + " le gana a " +
			 pCharacterFactory.getName(); break; 
		 		 
	 default: result = 0;
	 descriptionResult = name + " empata con " +
	 pCharacterFactory.getName(); break;
	 } 
	 return result;
	 
	}


}

