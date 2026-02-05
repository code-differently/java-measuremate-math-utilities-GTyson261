import java.util.Scanner;

public class TipTaxCalculator {
    //Methods
    public double taxRate(double tax, double bill) {
        return bill * (tax / 100);
    }

    public double tipRate(double tip, double bill) {
        return bill * (tip / 100);
    }

    public double totalAmount(double tip, double bill, double tax) {
        return bill + tax + tip;
    }

    public long roundedTotal(long total) {
        return Math.round(total);
    }


    static void main(String[] args) {
//scanner
        Scanner scan = new Scanner(System.in);
        TipTaxCalculator calculator = new TipTaxCalculator();
//scanner inputs
        System.out.print("Bill amount:$");
        double bill = scan.nextDouble();
        System.out.print("Tax rate:" + "%");
        double tax = scan.nextDouble();
        System.out.print("Tip rate is %");
        double tip = scan.nextDouble();
        scan.close();
//call methods
        double taxAmount = calculator.taxRate(bill, tax);
        double tipAmount = calculator.tipRate(bill, tip);
        double totalBill = calculator.totalAmount(bill, taxAmount, tipAmount);
        long roundedTotal = calculator.roundedTotal((long) totalBill);
//my message
        System.out.println("Bill amount:$" + bill);
        System.out.println("Tax:$" + taxAmount);
        System.out.println("Tip amount:$" + tipAmount);
        System.out.println("Total:$" + totalBill);
        System.out.println("Rounded total bill: $" + roundedTotal);


    }
}
