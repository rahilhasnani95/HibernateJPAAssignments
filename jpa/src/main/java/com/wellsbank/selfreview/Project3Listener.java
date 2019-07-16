package com.wellsbank.selfreview;

import javax.persistence.PostRemove;

public class Project3Listener {

	@PostRemove
	public void display(Project3 p)
	{
		System.out.println("Deleted");
	}
	
}


