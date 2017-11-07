package wujy.application.interfaceService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "compute-service", fallback = FeignHystrixImpl.class)
public interface FeignInterface {
	@RequestMapping(value = "name")
	String NameFromClient(@RequestParam(value = "a") String name);
}
