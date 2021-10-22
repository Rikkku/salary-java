import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sSs = 780;
        int pHealth = 300;
        int dLoan = 2300;
        int dOthers = 200;

        System.out.println("Please enter your Full Name");
        String wName = scanner.nextLine();
        System.out.println("Enter your occupation");
        String yOccup = scanner.nextLine();
        System.out.println("Enter your Salary");

        int ySalary = scanner.nextInt();
        int fDeduct = ySalary-sSs;
        int sDeduct = fDeduct-pHealth;
        int tDeduct = sDeduct-dLoan;
        int ldeduct = tDeduct-dOthers;
        int dAdd = sSs+pHealth+dLoan+dOthers;

        System.out.println("Name :  " + wName);
        System.out.println("Occupation :  " + yOccup);
        System.out.println("Deductions ");
        System.out.println("SSS :  " + sSs);
        System.out.println("Philhealth :  " + pHealth);
        System.out.println("Loan :  " + dLoan);
        System.out.println("Others :  " + dOthers);

        System.out.println("TOTAL DEDUCTIONS :  " + dAdd);
        System.out.println("Net pay :  " + ldeduct);
    }
}
