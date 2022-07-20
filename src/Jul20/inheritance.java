package Jul20;

class One {
    Two t;

    public One(Two temp) {
        t = temp;
    }

    public double cube(double x) {
        return t.square(x) * x;
    }
}

class Two {
    Three t;

    public Two(Three o3) {
        t = o3;
    }

    public double square(double x) {
        return x * t.get(x);
    }
}

class Three {
    public double get(double d) {
        return d;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Three o3 = new Three();
        Two o2 = new Two(o3);
        One o1 = new One(o2);
        System.out.println(o2.square(5));
        System.out.println(o1.cube(5));
    }
}
