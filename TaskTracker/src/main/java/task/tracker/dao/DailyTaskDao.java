package task.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import task.tracker.entity.DailyTask;


public interface DailyTaskDao extends JpaRepository<DailyTask, Long> {

}
