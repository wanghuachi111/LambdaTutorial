package lesson2.testAreas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whc
 * @Title: App4
 * @Package: lesson2.testAreas
 * @Description: lambda表达式类型检测
 * @date 2021/6/3 15:24
 */
public class App4 {

    public static void test(MyInterface<String, List> inter) {
        List<String> list = inter.Strategy("hello", new ArrayList());
        System.out.println(list);
    }

    public static void main(String[] args) {

        //1.匿名内部类
        test(new MyInterface<String, List>() {
            @Override
            public List Strategy(String s, List list) {
                list.add(s);
                return list;
            }
        });

        //2.lambda表达式
        test( (x, y) -> {
            y.add(x);
            return y;
        });
    }
}

@FunctionalInterface
interface MyInterface<T, R> {

    R Strategy(T t, R r);

}
