// Test generated by RoostGPT for test gs-consuming-rest using AI Model gpt

package com.example.consumingrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.*;

public class ConsumingRestApplication_run005be79b72Test {

    @InjectMocks
    ConsumingRestApplication consumingRestApplication;

    @Mock
    RestTemplate restTemplate;

    @Mock
    Quote quote;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRun_success() throws Exception {
        when(restTemplate.getForObject(anyString(), eq(Quote.class))).thenReturn(quote);
        CommandLineRunner runner = consumingRestApplication.run(restTemplate);
        runner.run();
        verify(restTemplate, times(1)).getForObject(anyString(), eq(Quote.class));
    }

    @Test
    public void testRun_failure() throws Exception {
        when(restTemplate.getForObject(anyString(), eq(Quote.class))).thenThrow(new RuntimeException());
        CommandLineRunner runner = consumingRestApplication.run(restTemplate);
        try {
            runner.run();
        } catch (Exception e) {
            verify(restTemplate, times(1)).getForObject(anyString(), eq(Quote.class));
        }
    }
}
