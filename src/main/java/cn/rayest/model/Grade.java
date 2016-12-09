package cn.rayest.model;

import java.util.List;

/**
 * Created by Rayest on 2016/6/25 0025.
 */
public class Grade {
    private Integer id;
    private String gradeName;
    private List<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /*
         @Override
         public String toString() {
           return "Grade{" +
                 "id=" + id +
                 ", gradeName='" + gradeName + '\'' +
                 ", students=" + students +
                 '}';
         }
    */


    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
