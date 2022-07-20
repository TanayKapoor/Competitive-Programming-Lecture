package Jul20;

import java.util.Scanner;

class bankAccA {
    double amount;

    public bankAccA(double amt) {
        amount = amt;
    }

    public void auth(double rate) {
        System.out.println("Enter password");
        String pass = new Scanner(System.in).nextLine();
        if (pass.equals("abc")) {
            System.out.println("Done");
            interest i = new interest(rate);
            i.calcInterest();
        }
    }


    private class interest {
        double rate;

        public interest(double rate) {
            this.rate = rate;
        }

        public void calcInterest() {
            double intAmt = bankAccA.this.amount * rate / 100;
            System.out.println("Interest amount is: " + intAmt);
        }
    }
}

public class bankAcc {
    public static void main(String[] args) {
        bankAccA b = new bankAccA(1852);
        b.auth(8.4);
    }
}
