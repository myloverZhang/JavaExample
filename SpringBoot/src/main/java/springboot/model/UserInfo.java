package springboot.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by CTWLPC on 2017/8/2.
 */
public class UserInfo implements Serializable{
    @NotNull
    @Size(min = 2,max = 18)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public UserInfo() {
    }

    public UserInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
