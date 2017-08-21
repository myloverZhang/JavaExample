package springboot;

import java.io.Serializable;

/**
 * Created by CTWLPC on 2017/8/1.
 */
public class StudentInfo implements Serializable{
    private Long age;
    private String name;

    public StudentInfo() {
    }

    public StudentInfo(Long age, String name) {
        this.age = age;
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "springboot.StudentInfo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
