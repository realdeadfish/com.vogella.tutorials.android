package com.vogella.java.dagger2;

import javax.inject.Inject;

public class BackendService {
	private User user;
	
	public BackendService(User user) {
		this.user = user;
	}
	
	public boolean callServer() {
		if (user !=null) {
			return true;
		}
		return false;
	}
}
