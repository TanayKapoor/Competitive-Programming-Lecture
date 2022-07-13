package Jul08;

public class jaggedArray {
    public static void main(String[] args) {
        int[][] x = new int[2][];
        x[0] = new int[2];
        x[1] = new int[3];
        x[0][0] = 10;
        x[0][1] = 20;
        x[1][0] = 30;
        x[1][1] = 40;

        for(int[] j : x){
            for(int i : j){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
