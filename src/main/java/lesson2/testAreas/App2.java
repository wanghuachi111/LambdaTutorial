package lesson2.testAreas;

public class App2 {

    public static void main(String[] args) {

        //1.Lambda表达式的基本语法
        /**
         * [接口声明] = (参数) -> {执行代码块};
         */

        Ilambda1 i1 = () -> {
            System.out.println("Hello, Imooc!");
            System.out.println("Welcome to Imooc!");
        };
        i1.test();

        //代码块中只有一行代码时，可以进行简化
        Ilambda1 i2 = () -> System.out.println("Hello, Imooc!");
        i2.test();

        Ilambda2 i21 = (String name, Integer age) -> {
            System.out.println(name + " is " + age + " year's old!");
        };
        i21.test("Mike", 18);

        //如果带参数，可以省略声明时的参数类型，jvm会自动根据接口中的参数类型推导
        Ilambda2 i22 = (name, age) -> {
            System.out.println("This man who named " + name + " is " + age + " year's old!");
        };
        i22.test("Tom", 21);
    }

    //没有参数、返回值的lambda表达式
    interface Ilambda1 {
        void test();
    }

    //带有参数、没有返回值的lambda表达式
    interface Ilambda2 {
        void test(String a, Integer b);
    }

    //带有参数、返回值的lambda表达式
    //如果只有一行代码，可以省略return关键字 直接写代码块  如： (x, y) -> x+y;  单行代码的计算结果会自动返回；
}
