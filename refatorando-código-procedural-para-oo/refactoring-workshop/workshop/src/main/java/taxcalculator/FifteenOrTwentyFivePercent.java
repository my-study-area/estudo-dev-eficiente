package taxcalculator;

public class FifteenOrTwentyFivePercent implements TaxCalculatorStrategy {
    @Override
    public double calculate(Employee employee) {
        if(employee.getBaseSalary() > 2000.0) {
            return employee.getBaseSalary() * 0.75;
        }
        else {
            return employee.getBaseSalary() * 0.85;
        }
    }
}
