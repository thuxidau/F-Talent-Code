import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1 = 0, sum2 = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0){
                count = 0;
                break;
            }
            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            for(int k = i + 1; k < n; k++) {
                sum2 += arr[k];
            }
            if(sum1 == sum2) {
                count++;
            }
            sum1 = 0;
            sum2 = 0;
        }
        System.out.println(count);
    }
}