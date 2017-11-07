package wujy.application.interfaceService;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrixImpl implements FeignInterface{

	@Override
	public String NameFromClient(String name) {
		return "<h>"+name+"</h><br/>something goes error. ";
	}

}
