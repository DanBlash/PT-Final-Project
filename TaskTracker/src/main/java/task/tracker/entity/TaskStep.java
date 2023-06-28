package task.tracker.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data

public class TaskStep {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskStepId;
	
	private String stepText;
	
	private String stepOrder;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy = "taskStep", cascade = CascadeType.PERSIST)
	private Set<DailyTask> dailyTasks = new HashSet<>();
}