package task.tracker.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import task.tracker.entity.Category;

@Data
@NoArgsConstructor

public class LifeGoalCategory {

	private Long categoryId;
	
	private String categoryName;
	
	public LifeGoalCategory(Category category) {
		categoryId = category.getCategoryId();
		
		categoryName = category.getCategoryName();
	}

}
