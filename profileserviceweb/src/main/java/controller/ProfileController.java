package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proApi/v1")
public class ProfileController {
	
	@GetMapping("/check_service")
	public String getProfileById(@PathVariable String profileId) {
		
		return "profile-service-up!!";
		
	}
	
}
