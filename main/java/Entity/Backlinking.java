package Entity;

import java.util.Objects;

public class Backlinking {
    private Long id;
    private String message;
    private String candidate;
    private Publication publication_id;

    public Backlinking(Long id, String message, String candidate, Publication publication_id) {
        this.id = id;
        this.message = message;
        this.candidate = candidate;
        this.publication_id = publication_id;
    }

    public Backlinking(String message, String candidate, Publication publication_id) {
        this(null, message, candidate, publication_id);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public Publication getPublication_id() {
        return publication_id;
    }

    public void setPublication_id(Publication publication_id) {
        this.publication_id = publication_id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backlinking user = (Backlinking) o;
        return Objects.equals(id, user.id) && Objects.equals(message, user.message) && Objects.equals(candidate, user.candidate) && Objects.equals(publication_id, user.publication_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message, candidate, publication_id);
    }

    @Override
    public String toString() {
        return "Backlinking{" + "id = " + id + ", message = " + message + ", candidate = " + candidate + ", publication_id = " + publication_id + '}';
    }
}
