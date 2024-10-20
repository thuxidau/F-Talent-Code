import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        if(y < 4 && w < 4){
            System.out.println("1/1");
        } else {
            if(y == 6 || w == 6){
                System.out.println("1/6");
            } else if(y == 5 || w == 5){
                System.out.println("1/3");
            } else if(y == 4 || w == 4){
                System.out.println("1/2");
            }
        }
    }
}