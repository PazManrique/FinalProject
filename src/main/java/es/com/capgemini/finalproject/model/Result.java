package es.com.capgemini.finalproject.model;

import java.sql.Timestamp;
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
@Table(name="results")
public class Result {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idResults;
	
	@Column(name="player_Name", length = 45, nullable = false)
	private String playerName;
	
    
    @Column(name="player_Choice", length = 45, nullable = false)
	private String playerChoice;
    
    @Column(name="computer_Choice", length = 45, nullable = false)
	private String computerChoice;

    
    @Column(name = "date_Time")
    @CreationTimestamp
    private Timestamp dateTime;

}
