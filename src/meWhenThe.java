public class meWhenThe {
    public static void method1(){
        System.out.println("me when");
    }
    public static void method3(){
        method2();
        System.out.println("me when the");
        method1();
    }
    public static void method2(){
        System.out.println("me when your mom");
        method1();
    }
    public static void main(String[] args){
        method3();
        method1();
        method2();
    }
}
