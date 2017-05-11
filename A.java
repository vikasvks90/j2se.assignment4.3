/**
* <h1>A</h1>
* This program implements an application that
* simply demonstrates that grand parent can not be accessed directly from child class
* @author  Vikas
* @version 1.0
* @since   2017-05-05 
*/

/*Explanation : In general, code in any class can call its own version of a method, and the version of its 
immediate superclass, there's no way to call any others without the cooperation of the superclass.*/
package session3;

public class A extends B{

	public static void main(String[] args) {
		A a = new A();
		a.test();

	}
	public void test(){
		super.test();
		System.out.println("In Class A");

	}
}

class B extends C{

	public void test(){
		System.out.println("In Class B");

	}

}
class C {

	public void test() {
		System.out.println("In Class C");

	}

}

//Answer f. It is not possible to invoke test() method defined in C from a method in A.