import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = 5;
        int count = 0;
        while (x > 0) {
            if(x - p < 0){
                p--;
            }
            x -= p;
            count++;
        }
        System.out.println(count);
    }
}