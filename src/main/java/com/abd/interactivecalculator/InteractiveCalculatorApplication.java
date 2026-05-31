package com.abd.interactivecalculator;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InteractiveCalculatorApplication {

    public static void main(String[] args) {
        // Swing/JOptionPane requires non-headless mode.
        new SpringApplicationBuilder(InteractiveCalculatorApplication.class)
                .headless(false)
                .run(args);
    }

}
