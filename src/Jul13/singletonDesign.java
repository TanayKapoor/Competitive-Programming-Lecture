package Jul13;

class Singleton {
    private static Singleton instance = new Singleton();
    int data;

    private Singleton() {
        System.out.println("Singleton constructor");
        data = 100;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class singletonDesign {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.data = 200;
        System.out.println(obj1.data);
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.data);
    }
}
