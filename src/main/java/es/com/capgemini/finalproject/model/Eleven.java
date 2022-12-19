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
public int comparar(CharacterFactory pCharacters) {
	// TODO Auto-generated method stub
	return 0;
}


}

