import java.util.Scanner;

public class VerticalPathsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        } 
        int count = 1;
        if(n == 0) count = 0;
        else{
           for (int i = 0; i < n - 1; i++) {
                if(values[i] >= values[i + 1]) count++;
            } 
        }
        
        System.out.print(count);
    }
}
