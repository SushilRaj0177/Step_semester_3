import java.util.Scanner;

public class MovieReviewProfiler {

    static void classifyWordLength(String review){
        String[] words = review.split(" ");
        int[] letterCounter = new int[words.length];
        int Short = 0, Medium = 0, Long = 0;

        for (int i = 0; i < words.length; i++){
            letterCounter[i] = words[i].length();
            if (letterCounter[i] < 5){
                Short++;
            }
            else if (letterCounter[i] < 9){
                Medium++;
            }
            else {
                Long++;
            }
        }

        System.out.println("Short: " + Short + " | Medium: " + Medium + " | Long: " + Long);       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter review: ");
        String review = sc.nextLine();

        classifyWordLength(review);

        sc.close();
    }
}