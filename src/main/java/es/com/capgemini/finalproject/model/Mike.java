package es.com.capgemini.finalproject.model;

public class Mike extends CharacterFactory {
	public Mike() 
	{
		this("mike", MIKE);

	}
	public Mike(String name, int number) {
		super(name, number);
		
	}

	@Override
	public boolean isMe(int number) {
		return number == MIKE;
		
	}
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
