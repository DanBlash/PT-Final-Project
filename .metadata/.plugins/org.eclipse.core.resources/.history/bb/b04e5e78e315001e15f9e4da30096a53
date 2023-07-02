package task.tracker.service;

import java.util.NoSuchElementException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import task.tracker.controller.model.LifeGoalData;
import task.tracker.dao.LifeGoalDao;
import task.tracker.entity.LifeGoal;

public class TaskTrackerService {

	@Autowired
	private LifeGoalDao lifeGoalDao;

	@Transactional(readOnly = false)
	public LifeGoalData saveLifeGoal(LifeGoalData lifeGoalData) {
		Long lifeGoalId = lifeGoalData.getLifeGoalId();
		LifeGoal lifeGoal = findOrCreateLifeGoal(lifeGoalId);
		copyLifeGoalFields(lifeGoal, lifeGoalData);
		return new LifeGoalData(lifeGoalDao.save(lifeGoal));
	}

	private void copyLifeGoalFields(LifeGoal lifeGoal, LifeGoalData lifeGoalData) {
		lifeGoal.setLifeGoalName(lifeGoalData.getLifeGoalName());
		lifeGoal.setActiveProgress(lifeGoalData.getActiveProgress());
		lifeGoal.setEstimatedTime(lifeGoalData.getEstimatedTime());
		lifeGoal.setDifficulty(lifeGoalData.getDifficulty());

	}

	private LifeGoal findOrCreateLifeGoal(Long lifeGoalId) {
		LifeGoal lifeGoal;

		if (Objects.isNull(lifeGoalId)) {
			lifeGoal = new LifeGoal();
		} else {
			lifeGoal = findLifeGoalByID(lifeGoalId);
		}
		return lifeGoal;
	}

	private LifeGoal findLifeGoalByID(Long lifeGoalId) {
		return lifeGoalDao.findById(lifeGoalId)
				.orElseThrow(() -> new NoSuchElementException("Life Goal with ID = " + lifeGoalId + " was not found."));
	}

}
