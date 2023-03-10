package ma.pfe.service;

import ma.pfe.dtos.StudentsDto;

import java.util.List;

public interface StudentService {
    long create(StudentsDto dto);
    boolean update(StudentsDto dto);

    boolean delete( long id);

    default List<StudentsDto> readAll() {

        return null;
    }
}
