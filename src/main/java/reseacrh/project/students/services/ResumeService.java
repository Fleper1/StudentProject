package reseacrh.project.students.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reseacrh.project.students.enteties.Resume;
import reseacrh.project.students.repositories.ResumeRepo;

import java.util.List;

@Service
public class ResumeService {
    private final ResumeRepo resumeRepo;

    @Autowired
    public ResumeService(ResumeRepo resumeRepo) {
        this.resumeRepo = resumeRepo;
    }

    public Resume newResume(Resume resume) {
        return resumeRepo.save(resume);
    }

    public Resume getResumeByImdbId(String imdbId) {
        return resumeRepo.findResumeByImdbId(imdbId);
    }

    public List<Resume> getAllResume(List<Long> usersId) {
        return resumeRepo.findResumes(usersId);
    }
}
