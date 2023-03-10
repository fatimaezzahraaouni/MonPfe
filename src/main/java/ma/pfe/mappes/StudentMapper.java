package ma.pfe.mappes;

import ma.pfe.dtos.StudentsDto;
import ma.pfe.entites.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
     public StudentsDto convertEntityToDto(StudentEntity entity){
        StudentsDto StudentsDto= new StudentsDto();
         StudentsDto.setName(entity.getName());
         StudentsDto.setId(entity.getId());
        return StudentsDto;

    }
    public StudentEntity convertDtoToEntity (StudentsDto dto){
        StudentEntity StudentEntity= new StudentEntity();
        StudentEntity.setId(dto.getId());
        StudentEntity.setName(dto.getName());
        return StudentEntity;

    }
   public List<StudentEntity> convertDtosToEnities(List<StudentsDto> dtos){
        return dtos.stream().map(dto -> convertDtoToEntity(dto)).collect(Collectors.toList());

    }
    public List <StudentsDto> convertEntitiesToDtos(List<StudentEntity> entities){
        return entities.stream().map(entity-> convertEntityToDto(entity)).
                collect(Collectors.toList());

    }

}
