package lesson2.test;

import lombok.Data;

import java.util.function.BinaryOperator;

@Data
public class Test {

    private String age;

    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        Integer b1 = new Integer(100);
        Integer a1 = 100;
        Integer a2 = 20;
        Integer b2 = new Integer(20);

        System.out.println(a==b);
        System.out.println(a1==b1);
        System.out.println(a2==b2);

        ReqVO reqVO = new ReqVO();
        reqVO.setAge(19);
        reqVO.setId("13807222999");
        reqVO.setName("Herry");
        System.out.println(reqVO.toString());

        //Lambda
        BinaryOperator<String> binaryOperator = (String username, String adname) -> {
            if (username .equals(adname)) {
                return "They are the same contents...\nPrograming Passing...";
            } else {
             return "They are different objects...\nPrograming Debuging...";
            }
        };

        System.out.println(binaryOperator.apply("Marry", "Marry"));
        System.out.println(binaryOperator.apply("Jack", "Marry"));
    }


}
