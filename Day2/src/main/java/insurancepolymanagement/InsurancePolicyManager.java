package insurancepolymanagement;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
private Map<String, InsurancePolicy> policyMap = new HashMap<>();
private Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
private TreeMap<LocalDate, InsurancePolicy> sortedByExpiryMap = new TreeMap<>();

public void addPolicy(InsurancePolicy policy) {
    policyMap.put(policy.getPolicyNumber(), policy);
    orderedPolicyMap.put(policy.getPolicyNumber(), policy);
    sortedByExpiryMap.put(policy.getExpiryDate(), policy);
}

public InsurancePolicy getPolicyByNumber(String policyNumber) {
    return policyMap.get(policyNumber);
}

public List<InsurancePolicy> getPoliciesExpiringSoon() {
    LocalDate today = LocalDate.now();
    LocalDate nextMonth = today.plusDays(30);
    return new ArrayList<>(sortedByExpiryMap.subMap(today, nextMonth).values());
}

public List<InsurancePolicy> getPoliciesByHolder(String policyHolder) {
    List<InsurancePolicy> result = new ArrayList<>();
    for (InsurancePolicy policy : policyMap.values()) {
        if (policy.getPolicyHolder().equalsIgnoreCase(policyHolder)) {
            result.add(policy);
        }
    }
    return result;
}

public void removeExpiredPolicies() {
    LocalDate today = LocalDate.now();
    sortedByExpiryMap.headMap(today, false).clear();
    policyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    orderedPolicyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
}
}