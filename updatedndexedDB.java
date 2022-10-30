import java.util.*;

public class displayForEachLoop {

    public static Scanner scn = new Scanner (System.in);

    public static void input (int[][] arr) {
        int n = scn.nextInt();
        int m = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display (int[][] arr) {
        for (int ar[] : arr) {
            for (int ele : ar) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        display(arr);
    }
}
