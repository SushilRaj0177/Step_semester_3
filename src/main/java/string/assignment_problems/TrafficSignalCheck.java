import java.util.Scanner;

public class TrafficSignalCheck {
    static void findLongestStreak(String logs){
        int longestStreak = 0, currentStreak = 0;
        char longestChar = logs.charAt(0); //if input provides equal number of streaks, then the first character with the streak is printed (edge case)
        for (int i = 1; i < logs.length(); i++){
            if (logs.charAt(i) == logs.charAt(i-1)){
                currentStreak++;
            }
            else {
                currentStreak = 0;
            }
            if (currentStreak > longestStreak){
                longestStreak = currentStreak;
                longestChar = logs.charAt(i);
            }

        }
        System.out.println("Longest Streak: '" + longestChar + "' repeated " + (longestStreak+1) + " times.");
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's logs: ");
        String logs = sc.nextLine();

        findLongestStreak(logs);

        sc.close();
    }
}