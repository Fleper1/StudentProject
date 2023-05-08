package reseacrh.project.students.enteties;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Contacts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private String messangerName;
    private String messangerCode;
    private Long owner;

    public Contacts(int id, String messangerName, String messangerCode, Long owner) {
        this.id = id;
        this.messangerName = messangerName;
        this.messangerCode = messangerCode;
        this.owner = owner;
    }

    public Contacts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessangerName() {
        return messangerName;
    }

    public void setMessangerName(String messangerName) {
        this.messangerName = messangerName;
    }

    public String getMessangerCode() {
        return messangerCode;
    }

    public void setMessangerCode(String messangerCode) {
        this.messangerCode = messangerCode;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }
}
