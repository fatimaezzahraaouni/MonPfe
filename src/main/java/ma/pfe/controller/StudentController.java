package ma.pfe.controller;

import ma.pfe.dtos.StudentsDto;
import ma.pfe.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService service;
    private final static Logger LOG= LoggerFactory.getLogger(StudentController.class);
    public StudentController (StudentService service){
        this.service= service;
    }
    @PostMapping("/create")
    public Long save (@RequestBody StudentsDto dto){
        LOG.debug("start method create");
        Long studentDto = service.create(dto);
        LOG.debug("end method create");
        return studentDto;

    }
    @PutMapping
    public boolean update(@RequestBody StudentsDto dto){
        LOG.debug("start method update");
        Boolean bool = service.update(dto);
        LOG.debug("end method update");
        return bool;
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id")long id){
        LOG.debug("start method delete");
        Boolean bool = service.delete(id);
        LOG.debug("end method delete");
        return bool;
    }
    @GetMapping
    public List<StudentsDto> selectAll(){
        LOG.debug("start method read All");
        List<StudentsDto> studentDtoList =  service.readAll();
        LOG.debug("end method read All");
        return studentDtoList;
    }

}
