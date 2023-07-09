package task.tracker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import task.tracker.controller.model.DailyTaskStep;
import task.tracker.controller.model.LifeGoalDailyTask;
import task.tracker.controller.model.LifeGoalData;
import task.tracker.service.TaskTrackerService;

@RestController
@RequestMapping("/task_tracker")
@Slf4j
public class TaskTrackerController {

	@Autowired
	private TaskTrackerService taskTrackerService;
	
	
	@PostMapping("/life_goal")
	@ResponseStatus(code = HttpStatus.CREATED)
	public LifeGoalData insertLifeGoal(@RequestBody LifeGoalData lifeGoalData) {
		log.info("Creating Life Goal {}", lifeGoalData);
		return taskTrackerService.saveLifeGoal(lifeGoalData);
	}
	
	@PutMapping("/life_goal/{lifeGoalId}")
	public LifeGoalData updateLifeGoal(@PathVariable Long lifeGoalId, @RequestBody LifeGoalData lifeGoalData) {
		lifeGoalData.setLifeGoalId(lifeGoalId);
		log.info("Updating Life Goal {}", lifeGoalData);
		return taskTrackerService.saveLifeGoal(lifeGoalData);
	}
	
	@PostMapping("/life_goal/{lifeGoalId}/daily_task")
	@ResponseStatus(code = HttpStatus.CREATED)
	public LifeGoalDailyTask insertLifeGoalDailyTask(@PathVariable Long lifeGoalId, @RequestBody LifeGoalDailyTask lifeGoalDailyTask) {
		log.info("Creating Daily Task {}", lifeGoalDailyTask);
		return taskTrackerService.saveDailyTask(lifeGoalId, lifeGoalDailyTask);
	}
	
	@PutMapping("/life_goal/{lifeGoalId}/daily_task/{dailyTaskId}")
	public LifeGoalDailyTask updateLifeGoalDailyTask(@PathVariable Long lifeGoalId, @PathVariable Long dailyTaskId, @RequestBody LifeGoalDailyTask lifeGoalDailyTask) {
		log.info("Updating Daily Task {} for Life Goal {}", lifeGoalDailyTask, lifeGoalId);
		return taskTrackerService.updateDailyTask(lifeGoalId, dailyTaskId, lifeGoalDailyTask);
	}
	
	@PostMapping("/life_goal/{lifeGoalId}/{dailyTaskId}/task_steps")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DailyTaskStep insertDailyTaskStep(@PathVariable Long lifeGoalId, @PathVariable Long dailyTaskId, @RequestBody DailyTaskStep dailyTaskSteps) {
		log.info("Adding steps to Daily Task {}", dailyTaskId);
		return taskTrackerService.saveTaskStep(lifeGoalId, dailyTaskId, dailyTaskSteps);
	}
	
	@GetMapping("")
	public List<LifeGoalData> ListLifeGoals() {
		return taskTrackerService.retrieveAllLifeGoals();
	}
	
	@GetMapping("/{lifeGoalId}")
	public LifeGoalData getLifeGoalById(@PathVariable Long lifeGoalId) {
		return taskTrackerService.retrieveLifeGoalById(lifeGoalId);
	}
	
	@DeleteMapping("/{lifeGoalId}")
	public Map <String, String> deleteLifeGoalById(@PathVariable Long lifeGoalId) {
		log.info("Deleting Life Goal {}", lifeGoalId);
		return taskTrackerService.deleteLifeGoalById(lifeGoalId);
	}
	
	@DeleteMapping("/{lifeGoalId}/{dailyTaskId}")
	public Map <String, String> deleteDailyTaskById(@PathVariable Long lifeGoalId, @PathVariable Long dailyTaskId) {
		log.info("Deleting Daily Task {} from Life Goal {}", dailyTaskId, lifeGoalId);
		return taskTrackerService.deleteDailyTaskById(lifeGoalId, dailyTaskId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
