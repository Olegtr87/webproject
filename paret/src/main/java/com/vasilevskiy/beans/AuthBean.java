package com.vasilevskiy.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "Main") // определение managed bean и его наименования
@SessionScoped // определение времени жизни - сессия
public class AuthBean {

	private String login;
	private String password;
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String checkLogin() {
		if ((login.equals("login")) && (password.equals("pass")))
		{
			return "pages\\login_ok?faces-redirect=true";
		} else {
			return "pages\\error?faces-redirect=true";
		}
	}
}
