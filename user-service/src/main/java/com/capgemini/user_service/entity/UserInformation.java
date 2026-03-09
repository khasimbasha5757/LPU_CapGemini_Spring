package com.capgemini.user_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserInformation {
	@Id	
	private String emailId;
		@Override
	public String toString() {
		return "UserInformation [emailId=" + emailId + ", password=" + password + ", fullname=" + fullname + "]";
	}


		private String password;
		private String fullname;
	
	
	public String getEmailId() {
			return emailId;
		}


		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getFullname() {
			return fullname;
		}


		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
	public UserInformation(String emailId, String password, String fullname) {
	super();
	this.emailId = emailId;
	this.password = password;
	this.fullname = fullname;
}


	public UserInformation() {
			
		}
		
}
