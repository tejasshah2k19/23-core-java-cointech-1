package collectiond;

import java.util.TreeSet;

public class SortingDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(10);
		ts.add(110);
		ts.add(100);
		ts.add(50);
		ts.add(20);

		System.out.println(ts); // 10 110 100 50 20 , 10 20 50 100 110 , anyOrder

		System.out.println("-----------------------------");
		Employee e1 = new Employee("rock", 10000, 45, "Goa");// allocate some memory

		System.out.println(e1.name); // ?
		System.out.println(e1.salary);
		System.out.println(e1.age);
		System.out.println(e1);// collectiond.Employee@23AC5DF

		// hashcode

		System.out.println(e1.toString());

		System.out.println("-----------------------------");
		TreeSet<Employee> te = new TreeSet<>();
		Employee e2 = new Employee("john", 20000, 35, "Pune");
		Employee e3 = new Employee("sam", 10000, 25, "Diu");
		Employee e4 = new Employee("philip", 40000, 55, "Daman");
		Employee e5 = new Employee("kathy", 30000, 65, "Patana");

		te.add(e1);
		te.add(e2);
		te.add(e3);
		te.add(e4);
		te.add(e5);

		System.out.println(te);
		// java.lang.ClassCastException: class collectiond.Employee cannot be cast to
		// class java.lang.Comparable

	}

}
//___Object_ class______ is the parent of all class in java? 
//if parent has X() method and that same method X() created by child ? : overriding 

//extends 
class Employee implements Comparable<Employee> {
	String name;
	Integer salary;
	Integer age;
	String city;

	Employee() {
	}

	Employee(String name, Integer salary, Integer age, String city) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Employee e) {
		if (this.age > e.age) {
			return 1;//+ first object is big  
		} else if (this.age < e.age) {
			return -1;//- second object is big 
		} else {
			return 0;//both are equal
		}
	}
}
