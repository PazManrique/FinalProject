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
	public int comparar(CharacterFactory pCharacters) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
