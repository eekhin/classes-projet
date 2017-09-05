package com.sqa.eiei;

/**
 * File Name: Person.java<br>
 * KHIN, EI EI<br>
 * Created: Sep 2, 2017
 */
/**
 * Person //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author KHIN, EI EI
 * @version 1.0.0
 * @since 1.0
 */
public class Person {

	private String Name;

	private int age;

	private String address;

	private String jobtitle;

	public Person() {
		super();
		this.Name = "John Doe";
		this.jobtitle = "Unemployeed";
		this.address = "Homeless";
		this.age = 18;
	}

	public Person(String Name, String jobtitle) {
		this();
		this.Name = Name;
		this.jobtitle = jobtitle;
	}

	public Person(String Name, String jobtitle, String address, int age) {
		super();
		this.Name = Name;
		this.jobtitle = jobtitle;
		this.address = address;
		this.age = age;
	}

	public String getaddrss() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	public String getjobtitle() {
		return this.jobtitle;
	}

	public String getName(String pName) {
		return this.Name;
	}

	public String setaddrss(String pAddress) {
		return this.address = pAddress;
	}

	public int setgetAge(int pAge) {
		return this.age = pAge;
	}

	public String setjobtitle(String pJobtitle) {
		return this.jobtitle = pJobtitle;
	}

	public String setName(String pName) {
		return this.Name = pName;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[Name=" + this.Name + ", age=" + this.age + ", address="
				+ this.address + ", jobtitle=" + this.jobtitle + "]";
	}

	private void doWork() {
		System.out.println(this.Name + " is working for NGO");
	}

	private void move() {
		System.out.println("The age " + this.age + "move to 30");
	}

	private void sleep() {
		System.out.println(this.jobtitle + " is sleeping");
	}
}
