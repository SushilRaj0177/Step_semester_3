import java.util.Scanner;

public class StockInventory {

    static void analyzeInventory(int[] sectionA, int[] sectionB){
        int totalA = 0, totalB = 0;
        String status = "Balanced";

        for (int i = 0; i < sectionA.length; i++){
            totalA += sectionA[i];
        }

        for (int i = 0; i < sectionB.length; i++){
            totalB += sectionB[i];
        }

        if (totalA != totalB){
            status = "Unbalanced";
        }
        
        int maxA = 0;
        int maxB = 0;

        for (int i = 1; i < sectionA.length; i++){
            if (sectionA[i] > sectionA[maxA]){
                maxA = i;
            }
        }

        for (int i = 1; i < sectionB.length; i++){
            if (sectionB[i] > sectionB[maxB]){
                maxB = i;
            }
        }

        if (sectionA[maxA] >= sectionB[maxB]){
            System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status + " | Highest Quantity: " + sectionA[maxA] + " (Section A, Item " + (maxA+1) + ") ");
        }
        else {
            System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status + " | Highest Quantity: " + sectionB[maxB] + " (Section B, Item " + (maxB+1) + ") ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of items in Section A: ");
        int itemCountA = sc.nextInt();

        System.out.print("Enter the number of items in Section B: ");
        int itemCountB= sc.nextInt();

        if (itemCountA != itemCountB){
            System.out.println("Error! Number of items in Section A is not the same as Section B");
        }
        else if (itemCountA == 0 || itemCountB == 0){
            System.out.println("Error! item counts cannot be zero!"); //I'm adding this to avoid accessing 1st element of an empty array and causing out-of-bounds error (edge case, not mentioned in question but still wanted to fix it.)
        }
        else {
            int[] sectionA = new int[itemCountA];
            int[] sectionB = new int[itemCountB];

            System.out.println("Enter the quantites of each items in section A: ");
            for (int i = 0; i < itemCountA; i++){
                sectionA[i] = sc.nextInt();
            }

            System.out.println("Enter the quantites of each items in section B: ");
            for (int i = 0; i < itemCountB; i++){
                    sectionB[i] = sc.nextInt();
            }

            analyzeInventory(sectionA, sectionB);

        }
        sc.close();

    }
}