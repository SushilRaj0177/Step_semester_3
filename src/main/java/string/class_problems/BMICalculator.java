import java.util.Scanner;

public class BMICalculator {

    static String getBmiStatus(double bmi){
        if(bmi < 18.5){
            return "Underweight";
        }
        else if (bmi >= 18.5 && bmi < 25){
            return "Normal";
        }
        else if(bmi >= 25 && bmi < 30){
            return "Overweight";
        }
        else if(bmi >= 30){
            return "Obese";
        }
        return "null";
    }
    static void printWellnessReport(int n, double[] heights, double[] weights, double[] bmi, String[] bmistatus){
        for(int i = 0; i < n; i++){
            System.out.println("Person " + (i+1) + " | Height: " + heights[i] + " | Weight: " + weights[i] + " | BMI: " + bmi[i] + " | Status: " + bmistatus[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of individuals: ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] BMI = new double[n];
        String[] bmiStatus = new String[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter your height of person " + (i+1)+": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter your weight of person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            BMI[i] = weight[i]/(height[i]*height[i]);
            bmiStatus[i] = getBmiStatus(BMI[i]);
        }

        printWellnessReport(n, height, weight, BMI, bmiStatus);
        
        sc.close();
    }    
}
