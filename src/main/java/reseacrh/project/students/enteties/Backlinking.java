package reseacrh.project.students.enteties;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Backlinking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private String message;
    private Long candidate;
    private String publicationId;


    public Backlinking(int id, String message, Long candidate, String publicationId) {
        this.id = id;
        this.message = message;
        this.candidate = candidate;
        this.publicationId = publicationId;
    }

    public Backlinking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCandidate() {
        return candidate;
    }

    public void setCandidate(Long candidate) {
        this.candidate = candidate;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }
}
