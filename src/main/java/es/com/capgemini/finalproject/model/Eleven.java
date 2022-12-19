package es.com.capgemini.finalproject.model;

public class Eleven extends CharacterFactory {
public Eleven() 
{
	this("eleven", ELEVEN);

}
public Eleven(String name, int number) {
	super(name, number);
	
}

@Override
public boolean isMe(int number) {
	return number == ELEVEN;
	
}

@Override
public int compare(CharacterFactory pCharacterFactory) {
	 
	 int result = 0; 
	 int ReceivedNumber = pCharacterFactory.getNumber();
	 
	 switch (ReceivedNumber) { 
	 
	 case MIKE: result = -1; descriptionResult = name + " pierde contra " + 
	 pCharacterFactory.getName(); break; 
	
	 case MAX: result = -1; descriptionResult = name + " pierde contra " +
			 pCharacterFactory.getName(); break; 
			 
	 case DUSTIN: result = 1; descriptionResult = name + " le gana a  " +
				 pCharacterFactory.getName(); break; 
				 
	 case VECNA: result = 1; descriptionResult = name + " le gana a " +
			 pCharacterFactory.getName(); break; 
		 		 
	 default: result = 0;
	 descriptionResult = name + " empata con " +
	 pCharacterFactory.getName(); break;
	 } 
	 return result;
	 
	}


}

