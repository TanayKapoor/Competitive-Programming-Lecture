package some;

public class B {
    public static void main(String[] args) {
        System.out.println("Class B");

        A obj = new A();
        System.out.println(obj.a);
        System.out.println(obj.setB(7));
        System.out.println(obj.getB());

    }
}
