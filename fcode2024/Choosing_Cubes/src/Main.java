import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] strings = new String[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[t][n];
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            int fav = arr[i][f-1];

            boolean check = false;
            while(!check) {
                int count = 0;
                for (int a = 0; a < arr[i].length - 1; a++) {
                    if (arr[i][a] < arr[i][a + 1]) {
                        int tam = arr[i][a];
                        arr[i][a] = arr[i][a + 1];
                        arr[i][a + 1] = tam;
                        count++;
                    }
                }
                check = count <= 0;
            }

            boolean status = false, status2 = false;
            for(int a = 0; a < k - 1 ; a++) {
                if(arr[i][a] == fav) {
                    for(int b = k; b < n; b++) {
                        if(arr[i][b] == fav) {
                            status = true;
                            strings[i] = "NO";
                            break;
                        }
                    }
                    if(!status){
                        status2 = true;
                        strings[i] = "YES";
                        break;
                    }
                }
            }
            if(!status2){
                strings[i] = "MAYBE";
            }


            for (int a = 0; a < arr[i].length; a++){
                System.out.print(arr[i][a] + " - ");
            }
            System.out.println(fav);
            System.out.println(arr[i][k-1]);

//            int count_fav = 0;
//            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] == fav) {
//                    count_fav++;
//                }
//            }
//            if(count_fav >= 2) {
//                strings[i] = "MAYBE";
//            } else {
//
//
//
////                for (int a = 0; a < arr[i].length; a++){
////                    System.out.print(arr[i][a] + " - ");
////                }
////                System.out.println(arr[i][k-1]);
//                if(arr[i][k-1] != fav) {
//                    strings[i] = "NO";
//                } else {
//                    strings[i] = "YES";
//                }
//            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(strings[i]);
        }
    }
}