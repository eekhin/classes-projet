/**
 * File Name: PersonTest.java<br>
 * KHIN, EI EI<br>
 * Created: Sep 2, 2017
 */
package com.sqa.eie;

import org.testng.annotations.*;

import com.sqa.eiei.*;

/**
 * PersonTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author KHIN, EI EI
 * @version 1.0.0
 * @since 1.0
 */
public class PersonTest {

	@Test
	public void testPerson() {
		Person[] people = new Person[7];
		people[0] = new Person("Vladimir Kononov", "Unemployed");
		people[1] = new Person("Delgado, Javier", "Unemployed");
		people[2] = new Person("Anne Hesemann", "QA Analyst");
		people[3] = new Person("Trung-Hieu Dam", "Unemployed", "91 FoxwellCt. San Jose CA 95138", 34);
		people[4] = new Person("EIEI", "Unemployed");
		people[5] = new Person("George Hanna", "Unemployed");
		people[6] = new Person("JF", "Instructor", "140 San Pedro", 34);
		for (int i = 0; i < people.length; i++) {
			System.out.println("Person Details: " + people[i]);
		}
	}
}
