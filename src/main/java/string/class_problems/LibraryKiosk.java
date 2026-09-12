import java.util.Scanner;

public class LibraryKiosk {

    static void countVowelsAndConsonants(String text){
        String vowels = new String("aeiou");
        int vows = 0, cons = 0;
        
        for (int i = 0; i < text.length(); i++){
            int flag = 0;
            if (Character.toLowerCase(text.charAt(i)) == ' '){
                continue;
            }
            for (int j = 0; j < vowels.length(); j++){
                if (Character.toLowerCase(text.charAt(i)) == vowels.charAt(j)){
                    vows++;
                    flag = 1;
                    break;
                }
                else {
                    flag = 0;
                }
            }
            if (flag != 1){
                cons++;
            }
        }
        System.out.println("Vowels: " + vows + " | Consonants: " + cons);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();
        countVowelsAndConsonants(title);
        sc.close();
    }
}