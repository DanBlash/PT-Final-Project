package task.tracker.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import task.tracker.entity.TaskStep;

@Data
@NoArgsConstructor

public class DailyTaskStep {

	private Long taskStepId;
	
	private String stepText;
	
	private String stepOrder;
	
	public DailyTaskStep(TaskStep taskStep) {
		
		taskStepId = taskStep.getTaskStepId();
		
		stepText = taskStep.getStepText();
		
		stepOrder = taskStep.getStepOrder();
		
	}

}
