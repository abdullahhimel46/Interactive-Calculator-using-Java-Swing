package com.abd.interactivecalculator;

import com.abd.interactivecalculator.model.Calculator;
import com.abd.interactivecalculator.config.CalculatorStartupProperties;
import org.jspecify.annotations.NullMarked;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Starts the interactive calculator dialogs when the Spring Boot app starts.
 *
 * <p>Enabled by default. Disable via: {@code calculator.startup.enabled=false}
 * (useful for tests).
 */
@Component
@Profile("!test")
@NullMarked
public class StartupRunner implements CommandLineRunner {

    private final CalculatorStartupProperties properties;

    public StartupRunner(CalculatorStartupProperties properties) {
        this.properties = properties;
    }

    @Override
    public void run(String... args) {
        if (!properties.isEnabled()) {
            return;
        }
        // Delegate to the existing Calculator main method which shows JOptionPane dialogs.
        Calculator.main(args);
    }
}




