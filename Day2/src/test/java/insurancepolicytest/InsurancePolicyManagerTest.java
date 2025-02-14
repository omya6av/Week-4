package insurancepolicytest;

import insurancepolymanagement.InsurancePolicy;
import insurancepolymanagement.InsurancePolicyManager;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class InsurancePolicyManagerTest {
      @Test
    void testPolicyManagement() {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        InsurancePolicy policy1 = new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10));
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40));
        InsurancePolicy policy3 = new InsurancePolicy("P003", "Alice", LocalDate.now().minusDays(5));

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);

        assertEquals(policy1, manager.getPolicyByNumber("P001"));
    }
}
