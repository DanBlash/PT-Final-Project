package task.tracker.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data

public class LifeGoal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long life_goal_id;
	
	private String life_goal_name;
	
	private String active_progress;
	
	private String estimated_time;
	
	private Short difficulty;	
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy = "lifeGoals", cascade = CascadeType.ALL, orphanRemoval = false)
	private Set<DailyTask> dailytasks = new HashSet<>(); 
	
	
	
}