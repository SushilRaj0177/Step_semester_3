import java.util.Scanner;


public class FileExtensionValidator {
    static String validateFileExtension(String fileName){
        int dotIndex = fileName.lastIndexOf(".");
        String extension = fileName.substring((dotIndex+1));

        if (extension.equalsIgnoreCase("pdf") || extension.equalsIgnoreCase("docx") || extension.equalsIgnoreCase("zip")){
            return "Accepted";
        }
        else {
            return "Rejected - Invalid file type";
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String fileName = sc.nextLine();
        
        System.out.println(validateFileExtension(fileName));
        sc.close();
    }
}