package com.ospa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void testHello() throws Exception {
        String body = restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello World!");
    }

    @Test
    public void testCalc() throws Exception {
        String url = "/calc?left=100&right=200";
        var response = restTemplate.getForObject(url, java.util.Map.class);

        assertThat(response.get("left")).isEqualTo(100);
        assertThat(response.get("right")).isEqualTo(200);
        assertThat(response.get("answer")).isEqualTo(300);
    }
}