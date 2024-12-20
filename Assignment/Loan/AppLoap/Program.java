package AppLoap;

import LoanFile.Discountable;
import LoanFile.Loan;
import LoanFile.Loaner;
import LoanFile.Taxable;

public class Program {
    static double getTotalDiscount(Loan... loans) throws Throwable {
        double totaldiscount = 0;
        for (Loan loan : loans) {
            if (loan instanceof Discountable d) {
                totaldiscount = totaldiscount + (Loaner.getEmI(loan) * (1 - d.getDiscount()))/12;
            }
        }
        return totaldiscount;
    }

    static double getTotalTax(Loan... loans) throws Throwable {
        double totalTax = 0;
        for (Loan loan : loans) {
            if (loan instanceof Taxable t) {
                totalTax = totalTax + (Loaner.getEmI(loan) * t.getTax())/12;
            }
        }
        return totalTax;
    }

    public static void main(String[] args) throws Throwable {
        Loan jack = Loaner.personalLoan(120000, 10);
        Loan jill = Loaner.personalLoan(2020000, 10);

        Loan john = Loaner.homeLoan(120000, 10);
        Loan steve = Loaner.homeLoan(120000, 10);

        System.out.printf("Jack Personal Loan Emi is : %.2f\n", Loaner.getEmI(jack));
        System.out.printf("John HomeLoan Loan Emi is : %.2f\n", Loaner.getEmI(john));

        System.out.printf("Total Tax applied is : %.2f\n",getTotalTax(jill,jill));
        System.out.printf("Total Discount given is : %.2f\n",getTotalDiscount(john,steve));

    }
}
