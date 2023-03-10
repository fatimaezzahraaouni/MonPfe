package ma.pfe.repositries;

import ma.pfe.entites.StudentEntity;

import java.util.List;

public interface StudentRepositry {
    long create(StudentEntity e );
    boolean update(StudentEntity e);
    boolean delete(long id);

    List<StudentEntity> readall();


}

