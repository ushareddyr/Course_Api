package io.javabrains.springbootquickstart.CourseApidata.Course;

import io.javabrains.springbootquickstart.CourseApidata.TopicController.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
