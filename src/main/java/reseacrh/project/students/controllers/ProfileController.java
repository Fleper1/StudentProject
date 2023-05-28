package reseacrh.project.students.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reseacrh.project.students.enteties.Publication;
import reseacrh.project.students.enteties.User;
import reseacrh.project.students.services.ProfileService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/number/{id}")
    public ResponseEntity<String> getNumber(@PathVariable Long id){
        return new ResponseEntity<>(profileService.getPhoneNumber(id), HttpStatus.OK);
    }

    @GetMapping("/publications")
    public ResponseEntity<List<Publication>> getPublications(@RequestParam Long id){
        List<Publication> myPublications = profileService.getMyPublications(id);
        return new ResponseEntity<>(myPublications, HttpStatus.OK);
    }

    @PutMapping("/changeProfile")
    public ResponseEntity<User> changeUser(@RequestBody User user){
        return new ResponseEntity<>(profileService.changeUser(user), HttpStatus.OK);
    }

    @GetMapping("/reviews")
    public ResponseEntity<List<Publication>> getReviews(@RequestParam Integer id) {
        return new ResponseEntity<>(profileService.getMyReviews(id), HttpStatus.OK);
    }
}
