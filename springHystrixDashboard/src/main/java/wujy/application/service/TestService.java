package wujy.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name) {
        return restTemplate.getForObject("http://compute-service/name?a="+name,String.class);
    }
    
    public String error(String name){
    	return name+",sorry,error happened";
    }
}
