package task.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import task.tracker.entity.TaskStep;

public interface TaskStepDao extends JpaRepository<TaskStep, Long> {

}
