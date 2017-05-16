/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.puj.aes.modyval.timestampclient.rest;

import edu.puj.aes.modyval.timestampclient.Application;
import edu.puj.aes.modyval.timestampclient.jaxb.Helloword;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author acost
 */
@Controller
@RequestMapping("/api")
public class TimestampClientController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    
    public static final String TIMESTAMP_HOST = "timestamp";
    public static final String TIMESTAMP_PORT = "8080";
    public static final String TIMESTAMP_ENDPOINT = "/api/timestamp";
    public static final String CLIENT_MESSAGE = "Hello World! Timestamp:";
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value = "/timestamp-client",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public @ResponseBody
    Helloword getHelloWorld() {
        Helloword helloword = new Helloword();
        helloword.setMessage(this.executeTimestampQuery());
        return helloword;
    }
    
    @RequestMapping(value = "/timestamp-client",
            method = RequestMethod.GET,
            produces = {MediaType.TEXT_HTML_VALUE, MediaType.TEXT_PLAIN_VALUE}
    )
    public @ResponseBody
    String getHelloWorldText() {
        return executeTimestampQuery();
    }
    
    private String executeTimestampQuery() {
        String urlRequest = String.format("http://%s:%s%s", TIMESTAMP_HOST, TIMESTAMP_PORT, TIMESTAMP_ENDPOINT);
        LOGGER.info("Intenta petición a {}", urlRequest);
        String response = restTemplate.getForObject(urlRequest, String.class);
        return String.format("%s%s", CLIENT_MESSAGE, response);
    }
    
}
