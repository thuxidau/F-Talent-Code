//import java.util.Scanner;
//
//public class HighschoolLife {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        long sum = 0;
//        
//        for (long i = 0; i < n; i++) {
//            long value = sc.nextLong();
//            sum += value;
//        }
//        
//        System.out.print(sum);
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HighschoolLife {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        if(n == 0) sum = 0;
        else {
            String[] input = br.readLine().split(" ");
        
            for (int i = 0; i < n; i++) {
                int value = Integer.parseInt(input[i]);
                sum += value;
            }
        }
        
        
        System.out.print(sum);
    }
}
