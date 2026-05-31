package com.abd.interactivecalculator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration for the interactive startup behavior.
 */
@Component
@ConfigurationProperties(prefix = "calculator.startup")
public class CalculatorStartupProperties {

    /**
     * Whether to start the interactive calculator UI on application startup.
     */
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

