package es.com.capgemini.finalproject.model;
 
public class Vecna extends CharacterFactory {
	public Vecna() 
	{
		this("vecna", VECNA);

	}
	public Vecna(String name, int number) {
		super(name, number);
		
	}

	@Override
	public boolean isMe(int number) {
		return number == VECNA;
		
	}
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
