package task.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class TaskSteps {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long task_steps_id;
	
	private String step_text;
	
	private String step_order;
	
}