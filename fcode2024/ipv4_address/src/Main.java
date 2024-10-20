import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        boolean status = true;

        if(!line.contains(".") || line.length() > 15){
            status = false;
        } else {
            String[] words = line.split("\\.");
            if(words.length != 4){
                status = false;
            } else {
                for (String word : words) {
                    word = word.trim();
                    if(word.startsWith("0") && !word.endsWith("0")) {
                        status = false;
                        break;
                    }
                    try {
                        int num = Integer.parseInt(word);
                        if(num > 255){
                            status = false;
                            break;
                        }
                    } catch (NumberFormatException e){
                        status = false;
                    }
                }
            }
        }
        if(status){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}