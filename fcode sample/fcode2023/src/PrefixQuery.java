import java.util.Scanner;
public class PrefixQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stringn = new String[n];
        for (int i = 0; i < n; i++) {
            stringn[i] = sc.nextLine();
        }
        
        sc.nextLine();
        int q = sc.nextInt();
        sc.nextLine();
        String[] stringq = new String[q];
        for (int i = 0; i < q; i++) {
            stringq[i] = sc.nextLine();
        }
        
        int countN = 0;
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n; j++) {
                if(stringn[j].contains(stringq[i])){
                    countN++;
                }
            }
            if(i == q-1){
               System.out.print(countN); 
            }
            else {
                System.out.println(countN); 
            }
            countN = 0;
        }
    }
}