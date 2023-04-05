package com.ifgoiano.studentform.service;

import com.ifgoiano.studentform.entities.University;
import com.ifgoiano.studentform.repository.UniversityRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniversityService {

    private final UniversityRepository repository;

    public UniversityService(UniversityRepository repository) {
        this.repository = repository;
    }

    public Map<String, University> findAll() {
        return repository.findAll();
    }

    public Set<String> getUniversitiesNames() {
        return findAll().keySet();
    }

    public University getByName(String name) {
        return findAll().get(name);
    }
}
