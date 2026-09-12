import java.util.Scanner;

public class CSVParser {

    static void parseStudentRecord(String csvLine){
        String[] csvOutput = csvLine.split(",");

        if (csvOutput.length != 3){
            System.out.println("Invalid Record");
            return;
        }
        System.out.println("Name: " + csvOutput[0] + " | Roll No: " + csvOutput[1] + " | Dept: " + csvOutput[2]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input CSV line:  ");
        String csvLine = sc.nextLine();
        parseStudentRecord(csvLine);
        sc.close();
    }    
}