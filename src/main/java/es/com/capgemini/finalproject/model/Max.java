package es.com.capgemini.finalproject.model;

public class Max extends CharacterFactory {
	public Max() 
	{
		this("max", MAX);

	}
	public Max(String name, int number) {
		super(name, number);
		
	}

	@Override
	public boolean isMe(int number) {
		return number == MAX;
		
	}
	@Override
	public int compare(CharacterFactory pCharacterFactory) {
		 
		 int result = 0; 
		 int ReceivedNumber = pCharacterFactory.getNumber();
		 
		 switch (ReceivedNumber) { 
		 
		 case MIKE: 
		 case DUSTIN: result = -1; descriptionResult = name + " pierde contra " +
				 pCharacterFactory.getName(); break; 
				 
		 case ELEVEN: 	 
		 case VECNA: result = 1; descriptionResult = name + " le gana a " +
				 pCharacterFactory.getName(); break; 
			 		 
		 default: result = 0;
		 descriptionResult = name + " empata con " +
		 pCharacterFactory.getName(); break;
		 } 
		 return result;
		 
		}

	

}
