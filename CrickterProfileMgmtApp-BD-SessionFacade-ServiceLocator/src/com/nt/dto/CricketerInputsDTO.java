package com.nt.dto;

import java.io.Serializable;

public class CricketerInputsDTO  implements Serializable {
	private String nickname;
	private String country;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
