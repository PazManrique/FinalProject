package es.com.capgemini.finalproject.model;

public class Dustin extends CharacterFactory {

	public Dustin() {
		this("dustin", DUSTIN);

	}
	public Dustin(String name, int number) {
		super(name, number);
		
	}

	@Override
	public boolean isMe(int number) {
		return number == DUSTIN;
		
	}
	@Override
	public int compare(CharacterFactory pCharacterFactory) {
		 
		 int result = 0; 
		 int ReceivedNumber = pCharacterFactory.getNumber();
		 
		 switch (ReceivedNumber) { 
		 
		 case MIKE:
		 case MAX:
			 result = 1; descriptionResult = name + " gana a " + 
		 pCharacterFactory.getName(); break; 
		
		
				 
		 case ELEVEN:
		 case VECNA: result = -1; descriptionResult = name + " pierde contra " +
				 pCharacterFactory.getName(); break; 
			 		 
		 default: result = 0;
		 descriptionResult = name + " empata con " +
		 pCharacterFactory.getName(); break;
		 } 
		 return result;
		 
		}
}



	
	





