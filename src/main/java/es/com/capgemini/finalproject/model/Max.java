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
	public int comparar(CharacterFactory pCharacters) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
