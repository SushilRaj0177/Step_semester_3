import java.util.Scanner;

public class DuplicateSeatChecker {

    static void checkDuplicateSeats(int[] seatNumbers){

        int[] duplicateNumbers = new int[seatNumbers.length];
        int numOfDuplicates = 0;
        int flag = 0;

        for (int i = 0; i < seatNumbers.length; i++){
            for (int j = i+1; j < seatNumbers.length; j++){
                if(seatNumbers[i] == seatNumbers[j]){
                    flag = 1;
                    for (int k = 0; k < numOfDuplicates; k++){
                        if (seatNumbers[i] == duplicateNumbers[k]){
                            flag = 0;
                            break;
                        }
                    }
                    if (flag == 1){
                        duplicateNumbers[numOfDuplicates] = seatNumbers[i];
                        numOfDuplicates++;
                    }
                }
            }
        }

        if (numOfDuplicates != 0){
            System.out.print("Duplicate Seat Number Found: ");
            for (int i = 0; i < numOfDuplicates; i++){
                System.out.print(duplicateNumbers[i] + " ");
            }
        }
        else {
            System.out.println("No Duplicate Seats Found.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        System.out.println("Enter the seat numbers: ");
        int[] seatNumbers = new int[n];
        for (int i = 0; i < n; i++){
            seatNumbers[i] = sc.nextInt();
        }

        checkDuplicateSeats(seatNumbers);
        
        sc.close();
    }
}