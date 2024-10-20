import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaxEarningandMaxLosing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(input[i]);
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        
        System.out.print(max + " ");
        System.out.print(min);
    }
}
