package com.example.Task411;

import org.springframework.stereotype.Component;

import static java.lang.Double.NaN;

@Component
public class Divider implements Operation{

    @Override
    public double getResult(double a, double b) {

        if (b == 0) return NaN;
         else return a/b;

    }

}
