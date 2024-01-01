package com.demo.cleancode.business;


import com.demo.cleancode.business.mock.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * class for invoking all business rules
 */
@Component
public class BusinessRules {

    private final CustomerContractBR customerContractBR;
    private final CkrBkiBR ckrBkiBR;

    private final CreditRiskBR creditRiskBR;

    /**
     * Constructor(object injection)
     *
     * @param customerContractBR     - CustomerContractBR
     * @param ckrBkiBR                - CkrBkiBR
     * @param creditRiskBR - CreditRiskBR
     */
    @Autowired
    public BusinessRules(CustomerContractBR customerContractBR, CkrBkiBR ckrBkiBR, CreditRiskBR creditRiskBR) {
        this.customerContractBR = customerContractBR;
        this.ckrBkiBR = ckrBkiBR;
        this.creditRiskBR = creditRiskBR;
    }

    /**
     * invoking all Business Rules
     *
     * @param contractClientGroupId - Long
     * @param registrationList     - List
     * @param customerRiskGrades  -List
     * @param clientAPIList            -List
     * @param contractList           - List< Agreement >
     * @return businessRuleResponse - BusinessRuleResponse
     */
    public BusinessRuleResponse invokeAllBR(List<CustomerRiskGrade> customerRiskGrades, List<Contract> contractList, List<Registration> registrationList, List<ClientAPI> clientAPIList, Long contractClientGroupId) {
        BusinessRuleResponse businessRuleResponse1, businessRuleResponse2, businessRuleResponse3, businessRuleResponse4, businessRuleResponse5;
        businessRuleResponse1 = customerContractBR.checkBRKKRA05(contractList);
        if (businessRuleResponse1.getAssessmentResponse().equals(Constants.ASSESSMENT_RESPONSE_ACC)) {
            businessRuleResponse2 = creditRiskBR.checkBRKKRA06(customerRiskGrades, contractClientGroupId);
        } else {
            return businessRuleResponse1;
        }
        if (businessRuleResponse2.getAssessmentResponse().equals(Constants.ASSESSMENT_RESPONSE_ACC)) {
            businessRuleResponse3 = ckrBkiBR.checkBRKKRA04(registrationList, clientAPIList, contractClientGroupId);
        } else {
            return businessRuleResponse2;
        }
        if (businessRuleResponse3.getAssessmentResponse().equals(Constants.ASSESSMENT_RESPONSE_ACC)) {
            businessRuleResponse4 = ckrBkiBR.checkBRKKRA03(registrationList, clientAPIList, contractClientGroupId);
        } else {
            return businessRuleResponse3;
        }
        if (businessRuleResponse4.getAssessmentResponse().equals(Constants.ASSESSMENT_RESPONSE_ACC)) {
            businessRuleResponse5 = ckrBkiBR.checkBRKKRA01(registrationList, clientAPIList);
            return businessRuleResponse5;

        } else {
            return businessRuleResponse4;
        }

    }
}

