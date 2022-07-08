import java.text.DecimalFormat;
import java.util.Scanner;

class Employee {
    double Employee(double salary) {
        DecimalFormat df = new DecimalFormat("#.##");
        double daAllowed = salary * 20 / 100;
        double Hra = salary * 30 / 100;
        Double ans = Double.valueOf(df.format(daAllowed + Hra + salary));
        return ans;
    }
}

public class Jul04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextInt();
        Employee e = new Employee();
        System.out.println(e.Employee(sal));
    }
}
