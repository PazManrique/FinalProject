package es.com.capgemini.finalproject.model.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.com.capgemini.finalproject.model.CharacterFactory;
import es.com.capgemini.finalproject.model.Move;
import es.com.capgemini.finalproject.model.Result;

public class MoveUtil {
	public static List<Result> asResults(List<Move> pMoves) {
		List<Result> results = new ArrayList<Result>();
		for (Move move : pMoves) {
			CharacterFactory characterFactoryComputer = CharacterFactory.getInstance(move.getComputerChoice());
			String computerChoiceDescription = characterFactoryComputer.getName();
			CharacterFactory characterFactoryPlayer = CharacterFactory.getInstance(move.getPlayerChoice());
			String playerChoiceDescription = characterFactoryPlayer.getName();
			
			characterFactoryComputer.compare(characterFactoryPlayer);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

			results.add(new Result(move.getPlayerName(), playerChoiceDescription, computerChoiceDescription,characterFactoryComputer.getDescriptionResult() , sdf.format(new Date())));
		}
		return results;
		
	}
	
	public static Result asResult(Move pMove) {
			CharacterFactory characterFactoryComputer = CharacterFactory.getInstance(pMove.getComputerChoice());
			String computerChoiceDescription = characterFactoryComputer.getName();
			CharacterFactory characterFactoryPlayer = CharacterFactory.getInstance(pMove.getPlayerChoice());
			String playerChoiceDescription = characterFactoryPlayer.getName();
			
			characterFactoryComputer.compare(characterFactoryPlayer);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

			return new Result(pMove.getPlayerName(), playerChoiceDescription, computerChoiceDescription,characterFactoryComputer.getDescriptionResult() , sdf.format(new Date()));
	}
}
