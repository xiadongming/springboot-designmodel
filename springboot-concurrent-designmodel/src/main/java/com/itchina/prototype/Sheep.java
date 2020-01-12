package com.itchina.prototype;

public class Sheep implements Cloneable {
	private String name;
	private String age;
	private String color;
	private Pig pig;
	public Sheep(String name, String age, String color,Pig pig) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.pig = pig;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep sheep = null;
		//clone()方法是native方法，会将当前对象属性sheep（转型的sheep）一一对应
		sheep = (Sheep)super.clone();
		//Pig clonePig = (Pig)sheep.getPig().clone();
		//sheep.setPig(clonePig);
		return sheep;
	}
	public Pig getPig() {
		return pig;
	}
	public void setPig(Pig pig) {
		this.pig = pig;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", pig=" + pig + "]";
	}


}
