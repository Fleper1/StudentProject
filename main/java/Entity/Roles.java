package Entity;

import java.util.Objects;

public class Roles {
    private Long id;
    private String role;

    public Roles(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    public Roles(String role) {
        this(null, role);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roles user = (Roles) o;
        return Objects.equals(id, user.id) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role);
    }

    @Override
    public String toString() {
        return "Statuses{" + "id = " + id + ", role = " + role + '}';
    }
}
