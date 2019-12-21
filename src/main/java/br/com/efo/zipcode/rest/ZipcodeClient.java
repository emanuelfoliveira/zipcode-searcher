package br.com.efo.zipcode.rest;

import br.com.efo.zipcode.model.response.ZipcodeResponse;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ZipcodeClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${rest.zipcode.url}")
    private String endpoint;

    public ZipcodeResponse search(final String zipcode) {
        val endpointFormatted = String.format(endpoint, "12321760");
        val responseEntity = restTemplate.getForEntity(endpointFormatted, ZipcodeResponse.class);
        return responseEntity.getBody();
    }

}
