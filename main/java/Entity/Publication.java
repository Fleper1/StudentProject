package Entity;

import java.util.Objects;

public class Publication {
    private Long id;
    private String title;
    private String path_to_filling;
    private String creator;
    private String moderator;
    private Statuses statuses_id;


    public Publication(Long id, String title, String path_to_filling, String creator, String moderator, Statuses statuses_id) {
        this.id = id;
        this.title = title;
        this.path_to_filling = path_to_filling;
        this.creator = creator;
        this.moderator = moderator;
        this.statuses_id = statuses_id;
    }

    public Publication(String title, String path_to_filling, String creator, String moderator, Statuses statuses_id) {
        this(null, title, path_to_filling, creator, moderator, statuses_id);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath_to_filling() {
        return path_to_filling;
    }

    public void setPath_to_filling(String path_to_filling) {
        this.path_to_filling = path_to_filling;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModerator() {
        return moderator;
    }

    public void setModerator(String moderator) {
        this.moderator = moderator;
    }

    public Statuses getStatuses_id() {
        return statuses_id;
    }

    public void setStatuses_id(Statuses statuses_id) {
        this.statuses_id = statuses_id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication user = (Publication) o;
        return Objects.equals(id, user.id) && Objects.equals(title, user.title) && Objects.equals(path_to_filling, user.path_to_filling) && Objects.equals(creator, user.creator) && Objects.equals(moderator, user.moderator) && Objects.equals(statuses_id, user.statuses_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, path_to_filling, creator, moderator, statuses_id);
    }

    @Override
    public String toString() {
        return "Publication{" + "id = " + id + ", title = " + title + '\n' + ", path_to_filling = " + path_to_filling + '\n' + ", creator = " + creator + '\n' + ", moderator = " + moderator + '\n' + ", statuses_id = " + statuses_id + '}';
    }
}
