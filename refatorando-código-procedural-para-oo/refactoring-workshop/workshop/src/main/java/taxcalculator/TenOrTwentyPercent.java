package taxcalculator;

public class TenOrTwentyPercent implements TaxCalculatorStrategy {
    @Override
    public double calculate(Employee employee) {
        if(employee.getBaseSalary() > 3000.0) {
            return employee.getBaseSalary() * 0.8;
        }
        else {
            return employee.getBaseSalary() * 0.9;
        }
    }
}
