package task.tracker.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import task.tracker.entity.Category;
import task.tracker.entity.DailyTask;
import task.tracker.entity.LifeGoal;

@Data
@NoArgsConstructor

public class LifeGoalData {

	private Long lifeGoalId;
	
	private String lifeGoalName;
	
	private String activeProgress;
	
	private String estimatedTime;
	
	private String difficulty;
	
	private Set<LifeGoalDailyTask> dailyTasks = new HashSet<>();
	
	private Set<LifeGoalCategory> categories = new HashSet<>();
	
	
	public LifeGoalData(LifeGoal lifeGoal) {
		
		lifeGoalId = lifeGoal.getLifeGoalId();
		
		lifeGoalName = lifeGoal.getLifeGoalName();
		
		activeProgress = lifeGoal.getActiveProgress();
		
		estimatedTime = lifeGoal.getEstimatedTime();
		
		difficulty = lifeGoal.getDifficulty();
		
		for (DailyTask dailyTask : lifeGoal.getDailyTasks()) {
			dailyTasks.add(new LifeGoalDailyTask(dailyTask));
		}
		
		for (Category category : lifeGoal.getCategories()) {
			categories.add(new LifeGoalCategory(category));
		}
		
	}
}
