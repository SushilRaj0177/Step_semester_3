import java.util.Scanner;

public class PalindromeCheck{

    static boolean isPalindromeIterative(String text){
        int start = 0, end = text.length() - 1;
        while(start <= end){
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    static boolean isPalindromeRecursive(String text, int start, int end){

        if(start >= end){
            return true;
        }
        else if(text.charAt(start) != text.charAt(end)){
            return false;
        }

        start++;
        end--;
        return isPalindromeRecursive(text, start, end);
    }

    static boolean isPalindromeArray(String text){
        char[] text_arr = new char[text.length()];
        char[] text_rev = new char[text.length()];

        for (int i = 0; i < text.length(); i++){
            text_arr[i] = text.charAt(i);
            text_rev[i] = text.charAt(text.length()-i-1);
        }
        
        for (int i = 0; i < text.length(); i++){
            if (text_arr[i] != text_rev[i]){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text:\t");

        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text), result2 = isPalindromeRecursive(text, 0, text.length()-1), result3 = isPalindromeArray(text);

        if((result1 == result2 && result2 == result3) && result1 == true){
            System.out.println("Iterative: Is a Palindrome | Recursive: Is a Palindrome | Array Reversal: Is a Palindrome");
        }
        else if((result1 == result2 && result2 == result3) && result1 == false) {
            System.out.println("Iterative: " + result1 + " | Recursive: " + result2 + " | Array Reversal: " + result3);
        }
        else{
            System.out.println("Values disagree");
        }

        sc.close();
    }
}