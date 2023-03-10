package ma.pfe.service;

import ma.pfe.dtos.StudentsDto;
import ma.pfe.entites.StudentEntity;
import ma.pfe.mappes.StudentMapper;
import ma.pfe.repositries.StudentRepositry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService{
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceIMPL.class);

    private StudentService service;
    @Override
    public long create(StudentsDto dto) {
        LOG.debug("start method create");
        long reslt = service.create(dto);
        return reslt;
    }

    @Override
    public boolean update(StudentsDto dto) {
        LOG.debug("start method update");
        boolean reslt = service.update(dto);
        return reslt;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start method update");
        return service.delete(id);

    }

    @Override
    public List<StudentsDto> readAll() {
        return StudentService.super.readAll();
    }

}
