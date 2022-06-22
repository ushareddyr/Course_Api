package io.javabrains.springbootquickstart.CourseApidata.TopicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    List<Topic> topics = new ArrayList<>( Arrays.asList(
                new Topic("spring", "Spring Boot", "Spring Boot Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javaScript", "Javascript", "Javascript Description")
        ));
    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics= new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;

    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

}
