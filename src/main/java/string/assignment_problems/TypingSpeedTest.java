import java.util.Scanner;

public class TypingSpeedTest {

    static void checkTypingAccuracy(String original, String typed){
        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++){
            if (typed.charAt(i) == original.charAt(i)){
                matched++;
            }
            else {
                if (firstMismatch == -1){
                    firstMismatch = i;
                }
            }
        }

        if (matched == original.length()){
            System.out.println("Matched: " + matched + "/" + original.length() + " | Accuracy: 100% | No Mismatches");
        }
        else {
            double accuracy = Math.round((double) matched/original.length() * 100);
            System.out.println("Matched: " + matched + "/" + original.length() + " | Accuracy: " + accuracy +"% | First Mismatch at position " + (firstMismatch+1) + " ('" + original.charAt(firstMismatch) + "' vs '" + typed.charAt(firstMismatch) + "')");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type original phrase: ");
        String original = sc.nextLine();

        System.out.print("Enter typed phrase: ");
        String typed = sc.nextLine();

        checkTypingAccuracy(original, typed);
        sc.close();
    }
}