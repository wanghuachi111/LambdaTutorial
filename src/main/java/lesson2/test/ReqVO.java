package lesson2.test;

import lombok.Data;

@Data
public class ReqVO {

    private Integer age;
    private String name;
    private String Id;

    @Override
    public String toString() {
        return "ReqVO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                '}';
    }


}
