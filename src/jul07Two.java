import java.util.Scanner;

class Student {
    int code;
    String name;

    //    parameterized constructor
    //    Student() {
    //        this.code = code;
    //        this.name = name;
    //    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code");
        code = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
    }

    public String toString() {
        return "Roll no: " + code + " Name: " + name;
    }
}

public class jul07Two {
    public static void main(String[] args) {
        Student[] s1 = new Student[3];
        s1[0] = new Student();
        s1[1] = new Student();

        s1[0].insert();
        s1[2].insert();

        for (Student s:s1){
            System.out.println(s);
        }
    }
}
