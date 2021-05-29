package lesson2.testAreas;

import lesson2.IMessageFormat;
import lesson2.IUserCredential;
import lesson2.Impl.MessageFormatImpl;
import lesson2.Impl.UserCredentialImpl;

import java.util.UUID;
import java.util.function.*;

/**
 * @author whc
 * @Title: app
 * @Package: lesson2.testAreas
 * @Description:
 * @date 2021/5/24 20:08
 */
public class App {
    public static void main(String[] args) {

        //1.函数式接口
        IUserCredential ic = new UserCredentialImpl();

        System.out.println(ic.verifyUser("admin"));

        System.out.println(ic.getCredential("admin"));


        //2.静态方法
        String message = "Hello, world!";

        if (IMessageFormat.verifyMessage(message)) {

            IMessageFormat format = new MessageFormatImpl();

            format.format(message, "json");
        }

        //3.匿名内部类
        IUserCredential ic2 = new IUserCredential() {
            @Override
            public String verifyUser(String username) {
                return "admin".equals(username) ? "admin" : "normal";
            }
        };

        System.out.println(ic2.verifyUser("admin"));
        System.out.println(ic2.verifyUser("user"));

        //4.Lambda表达式，针对函数式接口的简单实现
        IUserCredential ic3 = (String username) -> {
            return "admin".equals(username) ? "lbd-admin" : "lbd-normal";
        };

        System.out.println(ic3.verifyUser("admin"));
        System.out.println(ic3.verifyUser("user"));

        //java.util.function.Predicate<T>   return boolean
        Predicate<String> predicate = (String username) -> {
            return "admin".equals(username);
        };

        System.out.println(predicate.test("admin"));
        System.out.println(predicate.test("user"));

        //java.util.function.Consumer<T>    no return
        Consumer<String> consumer = (String message1) -> {
            System.out.println("要发送的消息: " + message1);
            System.out.println("消息发送完成");
        };
        consumer.accept("hello, my friend ");
        consumer.accept("fuck off!");

        //java.util.function.Function<T,R>   return R
        Function<String, String> function = (String direction) -> {
            if (direction.equals("East")) {
                return "Right Direction";
            } else {
                return "Wrong Direction";
            }
        };
        System.out.println(function.apply("East"));
        System.out.println(function.apply("West"));


        //java.util.function.Supplier<T> 不接受参数，提供T对象的创建工厂
        Supplier<String> supplier = () -> {
            return UUID.randomUUID().toString();
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        //java.util.function.UnaryOperator<T> 接收参数T，返回结果对象T
        UnaryOperator<String> unary = (String target) -> {
            return target + " is changed";
        };
        System.out.println(unary.apply("Hello"));

        //java.util.function.BinaryOperator<T> 接收参数T，返回结果对象T
        BinaryOperator<Integer> binary = (Integer i1, Integer i2) -> {
            return i1 > i2 ? i1 : i2;
        };
        System.out.println(binary.apply(2,6));

        BinaryOperator<Double> binary1 = (Double i1, Double i2) -> {
            return i1 > i2 ? i1 : i2;
        };
        System.out.println(binary.apply(2,6));
    }

    

}
