package com.SpringDemoHello;

import java.util.*;

public class HelloWorld 
	{
		private String message;
		private String Name;
		private List<String>mobile;
		private Set<String>address;
		private Map<String, String> role;
		
		public void setMessage(String message)
		{
			this.message = message;	
		}
		public String getMessage()
		{
			return message;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public List<String> getMobile() {
			return mobile;
		}
		public void setMobile(List<String> mobile) {
			this.mobile = mobile;
		}
		public Set<String> getAddress() {
			return address;
		}
		public void setAddress(Set<String> address) {
			this.address = address;
		}
		public Map<String, String> getRole() {
			return role;
		}
		public void setRole(Map<String, String> role) {
			this.role = role;
		}
	}

