package com.example.Task411;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Component("Calculator")
public class Calculator {

    private final Map<String, Operation> operations;

    public Calculator(Map<String, Operation> operations) {
        this.operations = operations;
    }

    public void calc(String operationType, double a, double b) throws Exception {
        double result;
        result = Optional.ofNullable(operations.get(operationType))
                .orElseThrow(() -> new Exception("Unsupported operation"))
                .getResult(a, b);
        System.out.println(result);
    }

    public String getSupportedOperations() {
        return operations.keySet().toString();
    }


}
