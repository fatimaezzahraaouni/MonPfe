package ma.pfe.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_STUDENTS")
public class StudentEntity {
    @Id
    private long id;
    private String name;

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
