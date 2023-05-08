package reseacrh.project.students.enteties;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection="resumes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resume {

    @Id
    private ObjectId id;
    private Long ownerId;
    private Map<String, String> languages;
    private String fullName;
    private int age;
    private List<String> skills;
    private String aboutMe;
    private String goals;
}
