package other;
import some.A;

public class C extends A {
    public static void main(String[] args) {
        System.out.println("Class C");

        A obj = new A();
        System.out.println(obj.a);
        System.out.println(obj.setB(7));
        System.out.println(obj.getB());
    }
}
