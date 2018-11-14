package br.com.cbds.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.cbds.microservices.model.Splogs;
import br.com.cbds.microservices.service.SplogsService;


@RestController
@RequestMapping(value = "splogs/")

public class SplogsServiceController {

	
	@Autowired
	private SplogsService splogsService;
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void savePlayer(@RequestBody Splogs splogs) {
		splogsService.saveId(splogs);
	}
	
	@RequestMapping(value = "/splog/{Id}", method = RequestMethod.GET)
	public Iterable<Splogs> getSplogsById(@PathVariable("Id") Integer Id) {	
		return (Iterable<Splogs>) splogsService.getId(Id);		
	}
	
	@RequestMapping(value = "/splogsid/{Id}", method = RequestMethod.GET)
	public Splogs getSplogsByIds(@PathVariable("Id") Integer Id) {	
		return splogsService.getId(Id);		
	}
	
	@Autowired
	 private RestTemplate restTemplate;
	
	 @GetMapping
	 @RequestMapping(value = "/splogsid/hello", method = RequestMethod.GET)
	    public String hello() {
	        String url = "http://hello-server/rest/hello/server";
	        return restTemplate.getForObject(url, String.class);
	    }

	
	
	
}
