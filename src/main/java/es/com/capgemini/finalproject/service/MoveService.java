package es.com.capgemini.finalproject.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.com.capgemini.finalproject.model.Move;
import es.com.capgemini.finalproject.model.MoveFront;
import es.com.capgemini.finalproject.repo.MoveRepo;

@Service
public class MoveService {

	@Autowired 
	MoveRepo moveRepo;
	
	


    public Collection<MoveFront> getMove() {
        return moveRepo.findAll()
            .stream()
            .map(MoveService::convertMove)
            .collect(Collectors.toList());
    }
   
    public MoveFront addMoveFront(MoveFront moveFront) {
   

        final Move savedMoveFront = moveRepo.save(convertMoveFront(moveFront));
        return convertMove(savedMoveFront);
    }
    private static MoveFront convertMove(Move move) {
        return new MoveFront(move.getIdResults(),move.getPlayerName(),move.getPlayerChoice(), move.getComputerChoice());
    }

    private static Move convertMoveFront(MoveFront moveFront) {
        return new Move(moveFront.getIdResults(),moveFront.getPlayerName(),moveFront.getPlayerChoice(), moveFront.getComputerChoice());
    }
}
