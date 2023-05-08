package reseacrh.project.students.enteties;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ModeratorsFeedbacks implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private Long moderatorId;
    private int publicationId;
    private String text;


    public ModeratorsFeedbacks() {
    }

    public ModeratorsFeedbacks(int id, Long moderatorId, int publicationId, String text) {
        this.id = id;
        this.moderatorId = moderatorId;
        this.publicationId = publicationId;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getModeratorId() {
        return moderatorId;
    }

    public void setModerator_id(Long moderatorId) {
        this.moderatorId = moderatorId;
    }

    public int getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(int publicationId) {
        this.publicationId = publicationId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
