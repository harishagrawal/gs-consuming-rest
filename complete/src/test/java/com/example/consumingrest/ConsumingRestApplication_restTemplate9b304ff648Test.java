// Test generated by RoostGPT for test gs-consuming-rest using AI Model gpt

package com.example.consumingrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class ConsumingRestApplication_restTemplate9b304ff648Test {

    @Mock
    private RestTemplateBuilder restTemplateBuilder;

    @Mock
    private RestTemplate restTemplate;

    private ConsumingRestApplication consumingRestApplication;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        consumingRestApplication = new ConsumingRestApplication();
    }

    @Test
    public void testRestTemplateSuccess() {
        when(restTemplateBuilder.build()).thenReturn(restTemplate);
        RestTemplate result = consumingRestApplication.restTemplate(restTemplateBuilder);
        assertNotNull(result, "RestTemplate should not be null");
    }

    @Test
    public void testRestTemplateFailure() {
        when(restTemplateBuilder.build()).thenReturn(null);
        RestTemplate result = consumingRestApplication.restTemplate(restTemplateBuilder);
        assertNotNull(result, "RestTemplate should not be null");
    }
}
