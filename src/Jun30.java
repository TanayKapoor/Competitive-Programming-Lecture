// Packages and imports

public class Jun30 {
    static class modelDemo {
        private int c;
        private String s;

        modelDemo() {
        }

        public void details() {
            System.out.println(c);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        System.out.println("Working?");
        modelDemo S1 = new modelDemo();
        S1.details();
    }
}
