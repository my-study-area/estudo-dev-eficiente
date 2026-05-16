package taxcalculator;

import java.util.HashMap;

public class TaxStrategiesRepositoryFake implements TaxStrategiesRepository {
    @Override
    public TaxValues getRole(Role role) {
        HashMap<Role, TaxValues> taxValues = new HashMap<>();
        TaxValues tenOrTwentyPercent = new TaxValues(3000, 0.8, 0.9);
        TaxValues fifteenOrTwentyFivePercent = new TaxValues(2000, 0.75, 0.85);
        taxValues.put(Role.DEVELOPER, tenOrTwentyPercent);
        taxValues.put(Role.DBA, fifteenOrTwentyFivePercent);
        taxValues.put(Role.TESTER, fifteenOrTwentyFivePercent);

        return taxValues.get(role);
    }
}
