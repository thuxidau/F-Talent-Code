package censorshipforchildren;
import java.util.*;
public class ThePointOfEachPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        
        String [] players = {a,b,c,d};   
//        System.out.println(Arrays.toString(calculatePoints(players)));
        int[] result = calculatePoints(players);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);            
        }
    }
    public static int[] calculatePoints(String[] players){
        int [] points = new int[4];
        int [] scores = new int[4];
        for (int i = 0; i < 4; i++) {
            String[] blocks = players[i].split(",");
            for (String block : blocks) {
                String[] numbers = block.split(":");
                scores[i] += Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            }
        }
        
        List<Integer> sortedScores = new ArrayList<>();
        for (int score : scores) {
            sortedScores.add(score);
        }
        Collections.sort(sortedScores);

        for (int i = 0; i < 4; i++) {
            int rank = sortedScores.indexOf(scores[i]);
            switch (rank) {
                case 0:
                    points[i] = 3;
                    break;
                case 1:
                    points[i] = 0;
                    break;
                case 2:
                    points[i] = -1;
                    break;
                case 3:
                    points[i] = -2;
                    break;
            }
        }
        return points;
    }
}