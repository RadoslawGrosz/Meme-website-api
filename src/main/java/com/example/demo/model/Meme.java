package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Meme")
public class Meme {

    @Id
    private final ObjectId _id;
    private final String title;
    private final String description;
    private final String image;
    private final List<String> tags;

    public Meme(@JsonProperty("id") ObjectId _id,
                @JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("image") String image,
                @JsonProperty("tags") List<String> tags) {
        this._id = _id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.tags = tags;
    }

    public ObjectId getId() {
        return _id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getImage() {
        return image;
    }
}
