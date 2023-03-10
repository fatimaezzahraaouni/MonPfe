package ma.pfe.repositries;

import ma.pfe.entites.StudentEntity;
import ma.pfe.service.StudentServiceIMPL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepositryIML implements StudentRepositry{
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceIMPL.class);
    private StudentRepositry repositry;

    @Override
    public long create(StudentEntity e) {
        LOG.debug("Start méthod create");
        long resultat = repositry.create(e);
        return resultat;
    }
    @Override
    public boolean update(StudentEntity e) {
        LOG.debug("Start méthod update");
        boolean resultat = repositry.update(e);
        return resultat;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("Start méthod delete");
        return repositry.delete(id);
    }

    @Override
    public List<StudentEntity> readall() {
        LOG.debug("Start méthod name");
        return null;
    }

}
