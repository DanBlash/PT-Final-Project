package task.tracker.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data

public class LifeGoal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lifeGoalId;

	private String lifeGoalName;

	private String activeProgress;

	private String estimatedTime;

	private String difficulty;
	
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "life_goal_category", joinColumns = @JoinColumn(name = "life_goal_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories = new HashSet<>();


	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy = "lifeGoal", cascade = CascadeType.ALL, orphanRemoval = false)
	private Set<DailyTask> dailyTasks = new HashSet<>();

	

}
