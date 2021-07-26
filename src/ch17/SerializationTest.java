package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


//class Person implements Serializable{
//	String name;
//	String job;
//	
//	public Person() {}
//	
//	public Person(String name, String job) {
//		this.name = name;
//		this.job = job;
//	}
//	public String toString() {
//		return name+ ","+job;
//	}
//
//}


class Person implements Externalizable{
	
	String name;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		//out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		//job = in.readUTF();
	}

	
}


public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("�̼���","��ǥ�̻�");
		Person personKim = new Person("������","���̻�");
		
		try (FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream ois = new ObjectOutputStream(fos)){
			
			ois.writeObject(personLee);
			ois.writeObject(personKim);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try (FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)){
			
			Person pLee = (Person) ois.readObject();
			Person pKim = (Person) ois.readObject();
			System.out.println(pLee);
			System.out.println(pKim);
			
		} catch (IOException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
