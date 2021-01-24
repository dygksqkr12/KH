package kh.model.vo;

import java.io.ObjectOutputStream;

public class Food implements java.io.Serializable {
	private String name; 
	private int kcal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}
	public Food() {
		super();
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}  
	public void fileSave(String fileName) { 
	try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputString(fileName));){ 
	objOut.writeObject(new Food("사과", 20)); 
	}catch(Exception e){
	e.printStackTrace();
	}
	} 

		}




	


