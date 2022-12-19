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
	public int comparar(CharacterFactory pCharacters) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
