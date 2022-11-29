package org.example;

import java.math.BigDecimal;

public class ExampleStackOverflow {

    public Integer fibonacci(Integer n){
        if (n == 1){
            return 1;
        }
        else if (n == 0){
            return 0;
        }
        return fibonacci(n-1);
    }

    public void fuzzerTestOneInput(String name) {
        System.out.println("Hello " + name);
        step1();
    }

    private void step1() {
        BigDecimal unused = BigDecimal.valueOf(10, 100);
        step2();
    }

    private void step2() {
        boolean unused = "foobar".contains("bar");
        step1();
    }
}
