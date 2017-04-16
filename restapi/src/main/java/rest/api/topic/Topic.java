package rest.api.topic;

/**
 * Created by deepak on 16/4/17.
 */
public class Topic {
    private String id;
    private String description;
    private String name;

    public Topic(String id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public Topic()
    {

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
