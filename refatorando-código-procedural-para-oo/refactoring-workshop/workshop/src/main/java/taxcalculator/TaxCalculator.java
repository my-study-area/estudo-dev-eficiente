package taxcalculator;

import static taxcalculator.Role.*;

public class TaxCalculator {

    public double calculateTax(Employee employee) {
        if(DEVELOPER.equals(employee.getRole())) {
            return new TenOrTwentyPercent().calculate(employee);
        }

        if(DBA.equals(employee.getRole()) || TESTER.equals(employee.getRole())) {
            return new FifteenOrTwentyFivePercent().calculate(employee);
        }

        // ... and many more ...

        throw new RuntimeException("invalid employee");
    }
}