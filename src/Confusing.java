public class Confusing{

    public static void method1() {

        System.out.println("method1");

    }

    public static void method2() {

        method1();

        System.out.println("method2");

    }

    public static void method3() {

        method2();

        System.out.println("method3");

        method1();

    }

    public static void main(String[] args){

        method1();

        method2();

        method3();

        method1();

    }

}