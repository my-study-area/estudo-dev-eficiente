package taxcalculator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainTaxCalculator {
    public static void main(String[] args) {
        System.out.println("ola");
        Calendar adrianoAdminissionDate = new GregorianCalendar(2021, Calendar.SEPTEMBER, 5, 8, 0);
        Calendar mariaAdminissionDate = new GregorianCalendar(2025, Calendar.JANUARY, 2, 8, 0);
        Calendar carlosAdminissionDate = new GregorianCalendar(2026, Calendar.JULY, 1, 8, 0);
        Employee adriano = new Employee(1, "Adriano", Role.DEVELOPER, adrianoAdminissionDate, 100);
        Employee maria = new Employee(1, "Maria", Role.TESTER, mariaAdminissionDate, 100);
        Employee carlos = new Employee(1, "Carlos", Role.DBA, carlosAdminissionDate, 100000);

        TaxCalculator taxCalculator = new TaxCalculator();
        double finalSalary = taxCalculator.calculateTax(adriano);
        System.out.println("Salario base: " + adriano.getBaseSalary());
        System.out.println("Salario com desconto: " + finalSalary);
        System.out.println("");
        System.out.println("");

        finalSalary = taxCalculator.calculateTax(maria);
        System.out.println("Salario base: " + maria.getBaseSalary());
        System.out.println("Salario com desconto: " + finalSalary);
        System.out.println("");
        System.out.println("");


        finalSalary = taxCalculator.calculateTax(carlos);
        System.out.println("Salario base: " + carlos.getBaseSalary());
        System.out.println("Salario com desconto: " + finalSalary);
        System.out.println("");
        System.out.println("");


    }
}
