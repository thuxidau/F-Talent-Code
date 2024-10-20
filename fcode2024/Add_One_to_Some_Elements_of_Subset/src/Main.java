import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] count = new int[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[][] arr = new int[t][n];
            for(int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            int s = max - min;
            count[i] = s;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(count[i]);
        }
    }
}