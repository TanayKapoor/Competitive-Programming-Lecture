package Jul21;

class outerClass {
    static int i = 10;
    int j = 20;
    private int k = 30;

    public void display() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

    class innerClass {
        void display() {
            System.out.println("i = " + i);
        }
    }
}

public class staticNestedClass {
    public static void main(String[] args) {
        outerClass obj = new outerClass();
        outerClass.innerClass obj1 = obj.new innerClass();
        obj.display();
        obj1.display();
    }
}
