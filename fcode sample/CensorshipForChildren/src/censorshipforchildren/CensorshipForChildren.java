package censorshipforchildren;
import java.util.Scanner;
public class CensorshipForChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dictionary = sc.nextLine();
        String comment = sc.nextLine();
        
        String[] dictionaryArray = dictionary.split("\\s+");
        String[] commentArray = comment.split("\\b");
        
        String result = "";
        for (int i = 0; i < commentArray.length; i++) {
            boolean check = false;
            for (int j = 0; j < dictionaryArray.length; j++) {
                if(commentArray[i].equalsIgnoreCase(dictionaryArray[j])){
                    check = true;
                    result += commentArray[i].charAt(0);
                    for (int k = 1; k < commentArray[i].length() - 1; k++) {
                        result += '*';
                    } 
                    result += (commentArray[i].charAt(commentArray[i].length()-1));
                    break;
                } else if(commentArray[i].equalsIgnoreCase("fucker")){
                    check = true;
                    result += "f**ker";
                    break;
                }
            }
            if(!check)
            result +=(commentArray[i]);
        }
        System.out.print(result.trim());
    }
}
