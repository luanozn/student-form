package com.ifgoiano.studentform.repository;

import static com.ifgoiano.studentform.entities.enums.Shift.AFTERNOON;
import static com.ifgoiano.studentform.entities.enums.Shift.EVENING_NIGHT;
import static com.ifgoiano.studentform.entities.enums.Shift.FULL_TIME;
import static com.ifgoiano.studentform.entities.enums.Shift.MORNING;

import com.ifgoiano.studentform.entities.Course;
import com.ifgoiano.studentform.entities.University;
import com.ifgoiano.studentform.entities.enums.Shift;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversityRepository {

    private final Map<String, University> universities;

    public UniversityRepository() {
        universities = new HashMap<>();
    }

    public Map<String, University> findAll() {
        universities.put("IF Goiano Campus Urutaí",
                new University(
                        "IF Goiano Campus Urutaí",
                        List.of(
                                new Course(
                                    "Bacharelado em Sistemas de Informação",
                                    3600,
                                    List.of(MORNING, EVENING_NIGHT)
                                ),
                                new Course(
                                    "Bacharelado em Agronomia",
                                    5000,
                                    List.of(FULL_TIME)
                                ),
                                new Course(
                                    "Licenciatura em Química",
                                        3000,
                                        List.of(AFTERNOON, EVENING_NIGHT)
                                )))
        );

        universities.put("IF Goiano Campus Iporá",
                new University(
                        "IF Goiano Campus Iporá",
                        List.of(
                                new Course(
                                        "Bacharelado em Nutrição",
                                        3600,
                                        List.of(MORNING, AFTERNOON)
                                ),
                                new Course(
                                        "Tecnologia em Análise e Desenvolvimento de Sistemas",
                                        5000,
                                        List.of(MORNING)
                                ),
                                new Course(
                                        "Gestão da Tecnologia de Informação",
                                        3000,
                                        List.of(EVENING_NIGHT)
                                )))
        );

        return universities;
    }
}
