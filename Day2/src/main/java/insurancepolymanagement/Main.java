package insurancepolymanagement;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        InsurancePolicy policy1 = new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10));
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40));
        InsurancePolicy policy3 = new InsurancePolicy("P003", "Alice", LocalDate.now().minusDays(5));

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);

        System.out.println("All Policies:");
        System.out.println(manager.getPolicyByNumber("P001"));
        System.out.println(manager.getPolicyByNumber("P002"));
        System.out.println(manager.getPolicyByNumber("P003"));

        System.out.println("\nPolicies Expiring Soon:");
        for (InsurancePolicy policy : manager.getPoliciesExpiringSoon()) {
            System.out.println(policy);
        }

        System.out.println("\nPolicies for Alice:");
        for (InsurancePolicy policy : manager.getPoliciesByHolder("Alice")) {
            System.out.println(policy);
        }

        manager.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies:");
        System.out.println(manager.getPolicyByNumber("P003"));
    }
}

