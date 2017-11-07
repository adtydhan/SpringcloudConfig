package wujy.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import wujy.application.service.TestService;

@RestController
public class RestTemplateController  {
	
	@Autowired
	TestService testService;
	
    @RequestMapping(value = "/hi")
    public String hiService(@RequestParam String name) {
        return testService.hiService(name);
    }
}