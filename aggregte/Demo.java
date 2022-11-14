package aggregte;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		s.setRollno(sc.nextInt());
		s.setName(sc.next());
		
		Address add=new Address();
		add.setCity(sc.next());
		add.setState(sc.next());
		
		s.setAddress(add);
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddress().getCity());
		System.out.println(s.getAddress().getState());
	}

}
