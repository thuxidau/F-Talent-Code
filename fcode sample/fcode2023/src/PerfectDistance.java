import java.io.*;
public class PerfectDistance {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int kq = 0;
        for (int i = m; i <= n; i++) {
            kq += calculateSum(i);
        }
        
        System.out.print(kq);
    }
    
    public static int calculateSum(int n){
        int sum = n;
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0){
                sum -= i;
            }
        }
        sum = Math.abs(sum);
        return sum;
    }
}