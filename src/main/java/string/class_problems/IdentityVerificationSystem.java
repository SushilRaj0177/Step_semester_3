import java.util.Scanner;

public class IdentityVerificationSystem {
    static String reverseCustomerName(String customerName){

        char[] charArray = new char[customerName.length()];

        for (int i = 0; i < customerName.length(); i++){
            charArray[i] = customerName.charAt(customerName.length()-i-1);
        }

        String reverseCustomerName = new String(charArray);
        return reverseCustomerName;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        
        String customerName = sc.nextLine();
        String reversedName = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName + "\nReversed Name: " + reversedName);

        sc.close();
    }
}