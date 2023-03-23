package Entity;

import java.util.Objects;

public class Statuses {
    private Long id;
    private String status;

    public Statuses(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Statuses(String status) {
        this(null, status);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statuses user = (Statuses) o;
        return Objects.equals(id, user.id) && Objects.equals(status, user.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }

    @Override
    public String toString() {
        return "Statuses{" + "id = " + id + ", status = " + status + '}';
    }
}
