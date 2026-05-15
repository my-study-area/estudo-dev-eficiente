package taxcalculator;

import static taxcalculator.Role.*;

public class TaxCalculator {

    public double calculateTax(Employee employee) {
        employee.getRole().getStrategy().calculate(employee);
        return employee.calculateTax();
    }
}