package mx.edu.uteq.idgs12.academic_ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.edu.uteq.idgs12.academic_ms.entity.University;
import mx.edu.uteq.idgs12.academic_ms.repository.UniversityRepository;

@Service
public class UniversityService {

    private final UniversityRepository universityRepository;

    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public List<University> getAll() {
        return universityRepository.findAll();
    }

    public Optional<University> getById(Integer id) {
        return universityRepository.findById(id);
    }
}
