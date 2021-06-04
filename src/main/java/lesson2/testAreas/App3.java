package lesson2.testAreas;

public class App3 {

    String s1 = "全局变量";

    public void testInnerClass() {
        String s2 = "局部变量";

        new Thread(new Runnable() {

            String s3 = "内部变量";

            @Override
            public void run() {
                //访问全局变量
//                System.out.println(this.s1);  //this关键字表示是当前内部类型的对象，此处会报错
                System.out.println(s1);  //直接访问即可

                //访问局部变量
                System.out.println(s2);  //直接访问即可，但是局部变量不可修改[final]
//                s2 = "hello";  //报错

                //访问内部变量，直接访问或使用this都可
                System.out.println(s3);
                System.out.println(this.s3);
            }
        }).start();

    }

    //2.lambda表达式变量捕获
    public void testLambda() {

        String s2 = "局部变量lambda";

        new Thread( () -> {
            String s3 = "内部变量lambda";

            //访问全局变量
            System.out.println(this.s1); //this关键字，表示的就是所属方法所在类型的对象

            //访问局部变量
            System.out.println(s2);  //s2依旧推导为[final] 即无法修改

            //直接访问内部变量，并可以修改
            System.out.println(s3);
            s3 = "lambda内部变量直接修改";
            System.out.println(s3);

        }).start();
    }



    public static void main(String[] args) {

        App3 app3 = new App3();

        //1.conventional way
        app3.testInnerClass();

        //2.lambda way
        app3.testLambda();
    }

}
