package com.itchina.prototype;

public class Pig implements Cloneable{

	private String name;
	
	private String age;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
      
		Pig pig = (Pig)super.clone();
		
		return pig;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
