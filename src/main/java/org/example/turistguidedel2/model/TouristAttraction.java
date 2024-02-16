package org.example.turistguidedel2.model;

import java.util.List;

public class TouristAttraction {
    private String name;
    private String description;
    private List<String> tags;

    public TouristAttraction(String name, String description, List<String> tags) {
        this.name = name;
        this.description = description;
        this.tags = tags;
    }

    public TouristAttraction() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
