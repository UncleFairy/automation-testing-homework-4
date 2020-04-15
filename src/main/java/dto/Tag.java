package dto;

public class Tag {
    private String name;

    private String id;

    public Tag(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Tag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
