package task.tracker.controller.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import task.tracker.controller.model.LifeGoalData;
import task.tracker.service.TaskTrackerService;

@RestController
@RequestMapping("/task_tracker")
@Slf4j


public class TaskTrackerController {

	@Autowired
	private TaskTrackerService taskTrackerService;
	
	@PostMapping("/task_tracker")
	@ResponseStatus(code = HttpStatus.CREATED)
	public LifeGoalData insertLifeGoal(@RequestBody LifeGoalData lifeGoalData) {
		log.info("Creating Life Goal {}", lifeGoalData);
		return taskTrackerService.saveLifeGoal(lifeGoalData);
	}
	
	
}
