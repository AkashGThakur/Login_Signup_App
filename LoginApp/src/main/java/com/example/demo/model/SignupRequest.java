package com.example.demo.model;

public class SignupRequest {
    private String username;
    private String password;
    private String email;
    
    
    public SignupRequest() {
    	super();
    	// TODO Auto-generated constructor stub
    }

    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SignupRequest(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

    
}

