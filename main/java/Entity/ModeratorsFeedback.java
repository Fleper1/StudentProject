package Entity;

import java.util.Objects;

public class ModeratorsFeedback {
    private Long id;
    private String moderator_id;
    private Publication publication_id;
    private String text;

    public ModeratorsFeedback(Long id, String moderator_id, Publication publication_id, String text) {
        this.id = id;
        this.moderator_id = moderator_id;
        this.publication_id = publication_id;
        this.text = text;
    }

    public ModeratorsFeedback(String moderator_id, Publication publication_id, String text) {
        this(null, moderator_id, publication_id, text);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModerator_id() {
        return moderator_id;
    }

    public void setModerator_id(String moderator_id) {
        this.moderator_id = moderator_id;
    }

    public Publication getPublication_id() {
        return publication_id;
    }

    public void setPublication_id(Publication publication_id) {
        this.publication_id = publication_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModeratorsFeedback user = (ModeratorsFeedback) o;
        return Objects.equals(id, user.id) && Objects.equals(moderator_id, user.moderator_id) && Objects.equals(publication_id, user.publication_id) && Objects.equals(text, user.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, moderator_id, publication_id, text);
    }

    @Override
    public String toString() {
        return "ModeratorsFeedback{" + "id = " + id + ", moderator_id = " + moderator_id + ", publication_id = " + publication_id + ", text = " + text + '}';
    }
}
