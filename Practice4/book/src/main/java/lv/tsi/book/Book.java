package lv.tsi.book;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Book {
    @Id
    @JsonProperty
    Long id;
    @JsonProperty
    String author;
    @JsonProperty
    String name;
    @JsonProperty
    int copies;

    public Long getId() {
        return id;
    }
    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getCopies() {
        return copies;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
