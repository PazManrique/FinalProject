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
	public int comparar(CharacterFactory pCharacterFactory) {
	
	int result = 0;
		int ReceivedNumber = pCharacterFactory.getNumber();

		switch (ReceivedNumber) {
		case TIJERA:
			result = -1;
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijera.getNombre();
		break;
	case PIEDRA:
		result = 1;
			descripcionResultado = nombre + " le gana a " + pPiedraPapelTijera.getNombre();
		break;
	default:
			result = 0;
		descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();			break;
	}
	return result;
	}






