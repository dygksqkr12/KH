package kh.java.io.byte_.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectIOTest {

	public static void main(String[] args) {
		ObjectIOTest o = new ObjectIOTest();
		o.test1();
		o.test2();
	}

	private void test2() {
		File f = new File("object/user.ser");
		
		try(
			ObjectInputStream ois =
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(f)
							)
						);
				
		){
//			User u = (User)ois.readObject();
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void test1() {
		
		File f = new File("object/user.ser");
		
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(f)));	
		){
			
//			User u = new User("honggd", "1234", "홍길동", Calendar.getInstance());
			User u1 = new User("honggd", "1234", "홍길동", Calendar.getInstance());
			User u2 = new User("sinsa", "1234", "신사임당", Calendar.getInstance());
			User u3 = new User("sejong", "1234", "세종", Calendar.getInstance());

//			oos.writeObject(u);
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(u3);
			System.out.println("객체 쓰기 완료 ! !");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
