package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> { // what is the class and what type is the ID 

	public List<Course> findByTopicId(String topicId);
}
