package lesson2.testAreas;

/**
 * @author whc
 * @Title: App5
 * @Package: lesson2.testAreas
 * @Description: lambda表达式遇到重载问题时
 * @date 2021/6/3 19:42
 */
public class App5 {

    interface Param1 {
        void outInfo(String info);
    }

    interface Param2 {
        void outInfo(String info);
    }

    public void lambdaMethod(Param1 param1) {
        param1.outInfo("Hello, param1!");
    }

    public void lambdaMethod(Param2 param2) {
        param2.outInfo("Hello, param2!");
    }

    public static void main(String[] args) {
        App5 app5 = new App5();

        //匿名内部类的方式重载
        app5.lambdaMethod(new Param1() {
            @Override
            public void outInfo(String info) {
                System.out.println(info);
            }
        });

        app5.lambdaMethod(new Param2() {
            @Override
            public void outInfo(String info) {
                System.out.println(info);
            }
        });

//        //lambda的方式重载,会报错
//        app5.lambdaMethod( (String info) -> {
//            System.out.println(info);
//        });
    }
}
