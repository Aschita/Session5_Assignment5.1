package assignment_5a;

public abstract class Parents {      //Abstract class declaration named Parents.
	
	  abstract int getSalary();
	}
	class Child_1 extends Parents{
		
	  private int salary;
	  public Child_1(int s){
	    salary = s;
	  }
	  int getSalary(){
	    return salary;
	  }
	}
	class Child_2 extends Parents{
	  private int salary;
	  public Child_2(int t){
	    salary = t;
	  }
	  int getSalary(){
	    return salary;
	  }
	}