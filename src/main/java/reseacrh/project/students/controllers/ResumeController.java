package reseacrh.project.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reseacrh.project.students.enteties.Resume;
import reseacrh.project.students.services.BacklinkingService;
import reseacrh.project.students.services.ResumeService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/resume")
public class ResumeController {
    private final ResumeService resumeService;
    private final BacklinkingService backlinkingService;

    @Autowired
    public ResumeController(ResumeService resumeService, BacklinkingService backlinkingService) {
        this.resumeService = resumeService;
        this.backlinkingService = backlinkingService;
    }

    @PostMapping("/add")
    public ResponseEntity<Resume> addResume(@RequestBody Resume resume) {
        return new ResponseEntity<>(resumeService.newResume(resume), HttpStatus.CREATED);
    }

    @GetMapping("/current/{resumeId}")
    public ResponseEntity<Resume> getResume(@PathVariable String resumeId) {
        return new ResponseEntity<>(resumeService.getResumeByImdbId(resumeId), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Resume>> getAllResume(@PathVariable Long id) {
        List<Long> respondentsId = backlinkingService.getRespondentsId(id);
        return new ResponseEntity<>(resumeService.getAllResume(respondentsId), HttpStatus.OK);
    }
}
