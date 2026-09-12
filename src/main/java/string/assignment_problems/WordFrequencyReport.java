import java.util.Scanner;
import java.util.HashMap;

public class WordFrequencyReport {
    static void printFilteredWordFrequency(String feedback) {

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for(int i = 0; i < words.length; i++) {

            int flag = 0;

            for (int j = 0; j < stopWords.length; j++) {
                if (words[i].equals(stopWords[j])) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                continue;
            }

            if (frequency.containsKey(words[i])) {
                frequency.put(words[i], frequency.get(words[i]) + 1);
            }
            else {
                frequency.put(words[i], 1);
            }
        }

        while (!frequency.isEmpty()) {

            String highestWord = "";
            int highestCount = 0;

            for (String word : frequency.keySet()) {
                if (frequency.get(word) > highestCount) {
                    highestCount = frequency.get(word);
                    highestWord = word;
                }
            }

            System.out.println(highestWord + ": " + highestCount);

            frequency.remove(highestWord);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feedback: ");
        String feedback = sc.nextLine();
        printFilteredWordFrequency(feedback);

        sc.close();
    }
}