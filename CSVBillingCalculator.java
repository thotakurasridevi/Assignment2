import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVBillingCalculator {
    public static void main(String[] args) {
        String csvFile = "D:/Inheritance/Tasks/emp(22).csv";
        String line = "";
        String csvSplitBy = ",";
        int totalTransactions = 0;
        double totalBillAmount = 0.0;
        double maximumBillAmount = Double.MIN_VALUE;
        double minimumBillAmount = Double.MAX_VALUE;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] transaction = line.split(csvSplitBy);
                double billAmount = Double.parseDouble(transaction[3]);
                totalTransactions++;
                totalBillAmount += billAmount;
                maximumBillAmount = Math.max(maximumBillAmount, billAmount);
                minimumBillAmount = Math.min(minimumBillAmount, billAmount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Total number of Transactions (bills): " + totalTransactions);
        System.out.println("Total Bill amount: " + totalBillAmount);
        System.out.println("Maximum Bill amount: " + maximumBillAmount);
        System.out.println("Minimum Bill amount: " + minimumBillAmount);
    }
}