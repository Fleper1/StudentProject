package Entity;

import java.util.Objects;

public class Contacts {
    private Long id;
    private String massanger_name;
    private String massenger_code;
    private User owner;

    public Contacts(Long id, String massanger_name, String massenger_code, User owner) {
        this.id = id;
        this.massanger_name = massanger_name;
        this.massenger_code = massenger_code;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMassanger_name() {
        return massanger_name;
    }

    public void setMassanger_name(String massanger_name) {
        this.massanger_name = massanger_name;
    }

    public String getMassenger_code() {
        return massenger_code;
    }

    public void setMassenger_code(String massenger_code) {
        this.massenger_code = massenger_code;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts user = (Contacts) o;
        return Objects.equals(id, user.id) && Objects.equals(massanger_name, user.massanger_name) && Objects.equals(massenger_code, user.massenger_code) && Objects.equals(owner, user.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, massanger_name, massenger_code, owner);
    }

    @Override
    public String toString() {
        return "Contacts{" + "id = " + id + ", massanger_name = " + massanger_name + ", massenger_code = " + massenger_code + ", owner = " + owner + '}';
    }
}
