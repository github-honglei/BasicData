package net.xdclass.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

	Map<String,Object> result = new HashMap<>();
	
	@RequestMapping(path="/{id}/{name}",method = RequestMethod.GET)
	public Object test(@PathVariable("id") int id,@PathVariable("name") String name) {
		result.put("id", id);
		result.put("name", name);
		return result;
	}
	
	@GetMapping(path="/t1/{id}/{name}")
	public Object test1(@PathVariable("id") int id,@PathVariable("name") String name) {
		result.put("id", id);
		result.put("name", name);
		return result;
	}
	
	@GetMapping(path="/t2/{id}/{name}")
	public Object test2(@RequestParam(defaultValue = "abc",name = "id") String id,@PathVariable("name") String name) {
		result.put("id", id);
		result.put("name", name);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
