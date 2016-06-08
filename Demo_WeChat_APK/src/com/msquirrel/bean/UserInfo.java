package com.msquirrel.bean;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {

	private String name;
	private List<UserImgs> ui = new ArrayList<UserImgs>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserImgs> getUi() {
		return ui;
	}

	public void setUi(List<UserImgs> ui) {
		this.ui = ui;
	}

}
