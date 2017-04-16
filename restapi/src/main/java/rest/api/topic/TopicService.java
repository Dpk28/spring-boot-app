package rest.api.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by deepak on 16/4/17.
 */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Boot Prac"),
                new Topic("hibernate", "Hibernate Framework", "Hibernate Prac"),
                new Topic("ansible","Devops Tool","Devops Prac"));

    public List<Topic> getAllTopics()
    {
        return topics;
    }
}
