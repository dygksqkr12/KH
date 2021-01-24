package com.kh.test.fruit.model.vo;

public class Fruit {
	public String name;
	public String flavor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public Fruit(String name, String flavor) {
		super();
		this.name = name;
		this.flavor = flavor;
	}
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", flavor=" + flavor + "]";
	}
}
