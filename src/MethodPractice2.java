import static java.lang.System.*;

public class MethodPractice2 {
    public static void v(){
        out.println("x   x");
        out.println(" x x  ");
        out.println("  x ");
    }
    public static void cone(){
        out.println("  x ");
        out.println(" x x  ");
        out.println("x   x");
    }
    public static void x(){
        v();
        cone();
    }
    public static void face(){
        out.println(" o o ");
        out.println("  |  ");
        out.println("\\___/ ");
    }
    public static void beard(){
        face();
        v();
    }
    public static void head(){
        cone();
        face();
        v();
    }
    public static void art(){
        cone();
        x();
        x();
        x();
        x();
        v();
    }
    public static void main(String[] args){
        art();
    }
}
