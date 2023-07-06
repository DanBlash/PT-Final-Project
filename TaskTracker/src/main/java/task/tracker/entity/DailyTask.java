package task.tracker.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data


public class DailyTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dailyTaskId;
	
	private String taskName;
	
	private String taskEstimatedTime;
	
	private String notes;
	
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.PERSIST, optional = true)
	@JoinColumn(name = "life_goal_id", nullable = true)
	private LifeGoal lifeGoal;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy = "dailyTask", cascade = CascadeType.PERSIST)
	private Set<TaskStep> taskSteps = new HashSet<>();
	
}
