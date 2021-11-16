package controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import dto.Profile;
import dto.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dao.ProfileDAO;

@RestController
@RequestMapping("/proApi/v1")
public class ProfileController {
	
	@PostMapping("/profile")
	public ResponseEntity saveProfile(@RequestBody Profile pr) {
		ProfileDAO p = new ProfileDAO();
		boolean b = p.saveProfile(pr);
		if(b)
			return ResponseEntity.status(HttpStatus.CREATED).build();
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
	@GetMapping("/profile/{user_id}")
	public ResponseEntity<Profile> getProfileByUse(@PathVariable("user_id") String user_id){
		Profile pr = null;
		ProfileDAO p = new ProfileDAO();
		pr = p.fetchProfile(user_id);
		if(pr == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(pr));	
	}
	
	
}
