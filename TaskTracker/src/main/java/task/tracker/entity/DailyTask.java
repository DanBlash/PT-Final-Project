package task.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data


public class DailyTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long daily_task_id;
	
	private String task_name;
	
	private String task_estimated_time;
	
	private String notes;
	
}
