package dto;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int profileId;
	private String contact;
	private String branch;
	private String section;
	private String skills;
	private String socialURLs;
	
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getProfileId() {
		return profileId;
	}


	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}


	
	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getSocialURLs() {
		return socialURLs;
	}
	public void setSocialURLs(String socialURLs) {
		this.socialURLs = socialURLs;
	}
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", contact=" + contact + ", branch=" + branch + ", section="
				+ section + ", skills=" + skills + ", socialURLs=" + socialURLs + "]";
	}
	
	
}
