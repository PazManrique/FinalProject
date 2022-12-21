package es.com.capgemini.finalproject.model;

import lombok.Data;

@Data
public class Result {
	private String playerName;
	private String playerChoiceDescription;
	private String computerChoiceDescription;
	private String descriptionResult;
	private String dateResult;
	
	public Result(String playerName, String playerChoiceDescription, String computerChoiceDescription,
			String descriptionResult, String dateResult) {
		super();
		this.playerName = playerName;
		this.playerChoiceDescription = playerChoiceDescription;
		this.computerChoiceDescription = computerChoiceDescription;
		this.descriptionResult = descriptionResult;
		this.dateResult = dateResult;
	}
}
