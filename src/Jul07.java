class Sample {
    static int count = 0;
    final float tax = 0.2f;
    public Sample() {
        count++;
    }

    public void show() {
        int data = 10;
        System.out.println("data = " + data);
        System.out.println("count = " + count);
        System.out.println("tax = " + 1000 * tax);

        float result = tax * 1000;
        System.out.println("result = " + result);
    }

    public static void showData() {
        int var = 100;
//      System.out.println(data); data is not accessible here
        System.out.println(var);
        System.out.println(count);
    }
}

public class Jul07 {
    public static void main(String[] args) {
        Sample obj = new Sample();
        Sample obj2 = new Sample();
        System.out.println("Obj 1");
        obj.show();
        Sample.showData();
        System.out.println("Obj 2");
        obj2.show();
        Sample.showData();
    }
}
