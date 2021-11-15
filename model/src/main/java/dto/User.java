package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	public User() {
		super();
	}
	
	@Id
	private String userId;
	private String userName;
	private String userEmail;
	private String pictureUrl;
	@OneToOne(cascade = {CascadeType.ALL})
	private Profile profile;
	
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return userEmail;
	}
	public void setEmail(String email) {
		this.userEmail = email;
	}
	public String getImageUrl() {
		return pictureUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.pictureUrl = imageUrl;
	}
	
	public String getName() {
		return userName;
	}
	public void setName(String name) {
		this.userName = name;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + userEmail + ", imageUrl=" + pictureUrl + "]";
	}
}
