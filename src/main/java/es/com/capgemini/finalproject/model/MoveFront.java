package es.com.capgemini.finalproject.model;

import lombok.Data;

@Data
public class MoveFront {

	
	private Integer idResults;
	private String playerName;
	private Integer playerChoice;
	private Integer computerChoice;
	
	public MoveFront() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MoveFront(Integer idResults, String playerName, Integer playerChoice, Integer computerChoice) {
		super();
		this.idResults = idResults;
		this.playerName = playerName;
		this.playerChoice = playerChoice;
		this.computerChoice = computerChoice;
	}
}
