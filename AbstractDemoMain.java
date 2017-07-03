//Assignment5.1

//Create an abstract class Parent and define an abstract method in it and implement it in the child class

package assignment_5a; //This java file is inside package named assignment_5a inside src folder.


	class AbstractDemoMain{
		
		//Abstract Methods
	public static void main(String[] args){
	  Child_1 c1 = new Child_1(5000);
	  Child_2 c2 = new Child_2(3000);
	  int a, b;
	  a = c1.getSalary();
	  b = c2.getSalary();
	  System.out.println("Salary of First Child is : " + a);
	  System.out.println("Salary of Second Child is : " + b);
	}

}  //End of abstract class.
