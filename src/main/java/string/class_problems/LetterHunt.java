import java.util.Scanner;

public class LetterHunt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        int j = 0, flag = 1;
        char first = '\0';

        for(int i = 0; i < text.length(); i++){
            for (j = 0; j < text.length(); j++){
                if(i != j){
                    if(text.charAt(i) == text.charAt(j)){
                        flag = 0;
                        break;
                    }
                    else{
                        flag = 1;
                    }
                }
            }

            if(flag == 1){
                first = text.charAt(i);
                break;
            }
            
        }

        if (first != '\0'){
            System.out.println("First occuring letter with no repetition: " + first);
        }
        else{
            System.out.println("No non-repeating letters");
        }
        sc.close();
    }
}