package task.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import task.tracker.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {

}
