package com.polyglot.appsecurity.dto;

import java.io.Serializable;

public class AuthRequest implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
    private String password;

    public AuthRequest() {

    }

    public AuthRequest(String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}