package Entity;

import java.util.Objects;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String phone_number;
    private String path_to_resume;
    private String student_card;
    private Roles roles_id;
    private String path_to_photo;


    public User(Long id, String name, String surname, String phone_number, String path_to_resume, String student_card, Roles roles_id, String path_to_photo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.path_to_resume = path_to_resume;
        this.student_card = student_card;
        this.roles_id = roles_id;
        this.path_to_photo = path_to_photo;
    }

    public User(String name, String surname, String phone_number, String path_to_resume, String student_card, Roles roles_id, String path_to_photo) {
        this(null, name, surname, phone_number, path_to_resume, student_card, roles_id, path_to_photo);
    }

        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPath_to_resume() {
        return path_to_resume;
    }

    public void setPath_to_resume(String path_to_resume) {
        this.path_to_resume = path_to_resume;
    }

    public String getStudent_card() {
        return student_card;
    }

    public void setStudent_card(String student_card) {
        this.student_card = student_card;
    }

    public Roles getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(Roles roles_id) {
        this.roles_id = roles_id;
    }

    public String getPath_to_photo() {
        return path_to_photo;
    }

    public void setPath_to_photo(String path_to_photo) {
        this.path_to_photo = path_to_photo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(phone_number, user.phone_number) && Objects.equals(path_to_resume, user.path_to_resume) && Objects.equals(student_card, user.student_card) && Objects.equals(roles_id, user.roles_id) && Objects.equals(path_to_photo, user.path_to_photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phone_number, path_to_resume, student_card, roles_id, path_to_photo);
    }

    @Override
    public String toString() {
        return "User{" + "id = " + id + ", name = " + name + '\n' + ", surname = " + surname + '\n' + ", phone_number = " + phone_number + '\n' + ", path_to_resume = " + path_to_resume + '\n' + ", student_card = " + student_card + '\n' + ", roles_id = " + roles_id + '\n' + ", path_to_photo = " + path_to_photo + '}';
    }
}
