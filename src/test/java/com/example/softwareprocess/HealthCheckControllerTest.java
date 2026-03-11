package com.example.softwareprocess;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HealthCheckControllerTest {

    @Test
    public void testHealthCheck() {
        HealthCheckController controller = new HealthCheckController();
        String response = controller.healthCheck();
        assertThat(response).isEqualTo("OK");
    }
}
