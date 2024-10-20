import java.util.Scanner;
public class AverageEarning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float [] values = new float[n];
        int count=0;
        float sum = 0,kq;
        
        if(n == 0) kq = 0;
        else {
            for (int i = 0; i < n; i++) {
                values[i] = sc.nextFloat();
                if(values[i] > 0){
                    sum += values[i];
                    count++;
                }
            }
            if(count == 0) kq = 0;
            else kq = sum/count;
        }
        
        System.out.printf("%.2f", kq);
    }
}
