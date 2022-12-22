package es.com.capgemini.finalproject.model;

import java.sql.Timestamp;

import java.text.SimpleDateFormat;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "moves")
public class Move {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idResults;

	@Column(name = "player_Name", nullable = true)
	private String playerName;

	@Column(name = "player_Choice")
	private Integer playerChoice;

	@Column(name = "computer_Choice")
	private Integer computerChoice;

	@Column(name = "date_Time")
	@CreationTimestamp
	private Timestamp dateTime;

	/**
	 * Constructors
	 */

	public Move(Integer idResults, String playerName, Integer playerChoice, Integer computerChoice) {
		super();
		this.idResults = idResults;
		this.playerName = playerName;
		this.playerChoice = playerChoice;
		this.computerChoice = computerChoice;
	}
	
	 /**
     * Method that collects the necessary data to display the result
     */

	public Result moveResult() {
		CharacterFactory computerChoiceNumber = CharacterFactory.getInstance(computerChoice);
		String computerChoiceName = computerChoiceNumber.getName();
		CharacterFactory playerChoiceNumber = CharacterFactory.getInstance(playerChoice);
		String playerChoiceName = playerChoiceNumber.getName();

		computerChoiceNumber.compare(playerChoiceNumber);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

		return new Result(playerName, playerChoiceName, computerChoiceName, computerChoiceNumber.getDescriptionResult(),
				sdf.format(dateTime));
	}

}
