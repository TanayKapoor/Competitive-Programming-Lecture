/* Save this in a file called Main.java to compile and test it */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(num);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) %2!=0&& arrayList.get(i + 1) %2!=0 && arrayList.get(i) + arrayList.get(i + 1) >=20){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
