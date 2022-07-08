import java.time.LocalDate;
import java.util.Scanner;

public class ageDifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first dob in yyy/mm/dd format");
        String bDate = s.nextLine();
        LocalDate birthDate = LocalDate.parse(bDate);
        System.out.println("Enter your second dob in yyy/mm/dd format");
        String bDate1 = s.nextLine();
        LocalDate birthDate1 = LocalDate.parse(bDate1);
        LocalDate currentDate = LocalDate.now();
        int age1 = currentDate.getYear() - birthDate.getYear();
        int age = currentDate.getYear() - birthDate1.getYear();
        if (currentDate.getMonthValue() < birthDate.getMonthValue()) {
            age1--;
        } else if (currentDate.getMonthValue() == birthDate.getMonthValue() && currentDate.getDayOfMonth() < birthDate.getDayOfMonth()) {
            age1--;
        }
        if (currentDate.getMonthValue() < birthDate1.getMonthValue()) {
            age--;
        } else if (currentDate.getMonthValue() == birthDate1.getMonthValue() && currentDate.getDayOfMonth() < birthDate1.getDayOfMonth()) {
            age--;
        }
        System.out.println("Difference of age is " + Math.abs(age - age1));

    }
}
