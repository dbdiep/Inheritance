package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Person[] persons = new Person[10];
		input(persons);
		print(persons);
		findTeacher(persons);
		findStudent(persons);
	}
	
	public static void input(Person[] persons) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap 4 giao vien ");
		for (int i = 0; i < 4; i++) {
			Teacher teacher = new Teacher();
			System.out.format("Nhap giao vien thu %d", i).println();
			System.out.println("Nhap ten ");
			teacher.setName(sc.nextLine());
			
			System.out.println("Nhap tuoi ");
			teacher.setAge(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Nhap dia chi ");
			teacher.setAddress(sc.nextLine());
			
			System.out.println("Nhap ma giao vien ");
			teacher.setTeacherID(sc.nextLine());
			
			System.out.println("Nhap luong ");
			teacher.setSalary(sc.nextDouble());
			sc.nextLine();
			
			persons[i] = teacher;
		}
		
		System.out.println("Nhap 6 hoc sinh ");
		for (int i = 4; i < persons.length; i++) {
			Student student = new Student();
			System.out.format("Nhap hoc sinh thu %d", i).println();
			System.out.println("Nhap ten ");
			student.setName(sc.nextLine());
			
			System.out.println("Nhap tuoi ");
			student.setAge(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Nhap dia chi ");
			student.setAddress(sc.nextLine());
			
			System.out.println("Nhap diem toan ");
			student.setMarkMath(sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Nhap diem ly ");
			student.setMarkPhysical(sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Nhap diem hoa ");
			student.setMarkChemistry(sc.nextDouble());
			sc.nextLine();
			
			System.out.println("Nhap ma hoc sinh ");
			student.setStudentID(sc.nextLine());
			
			System.out.println("Nhap className ");
			student.setClassName(sc.nextLine());
			sc.nextLine();
			
			persons[i] = student;
		}
		
	}
	public static void print(Person[] persons) {
		for (int i = 0; i < persons.length; i++) {
			System.out.format("Ten: %s - Tuoi: %d - Dia chi: %s", persons[i].getName(), persons[i].getAge(), persons[i].getAddress()).println();
		}
	}
	
	public static void findTeacher(Person[] persons) {
		Person teacherWithMaxSalary = persons[0];
		for (Person person: persons) {
			if (((Teacher) person).getTeacherID() != null) {
				if (((Teacher) person).getSalary() >= ((Teacher) teacherWithMaxSalary).getSalary()) {
					teacherWithMaxSalary = person;
				}
			}
		}
		System.out.format("Ten: %s - Tuoi: %d - Dia chi: %s", teacherWithMaxSalary.getName(), teacherWithMaxSalary.getAge(), teacherWithMaxSalary.getAddress()).println();
	}
	
	public static void findStudent(Person[] persons) {
		Person student = persons[0];
		for (Person person: persons) {
			if (((Student) person).getStudentID() != null) {
				if (((Student) person).calculateMark() >= ((Student) student).calculateMark()) {
					student = person;
				}
			}
		}
		System.out.format("Ten: %s - Tuoi: %d - Dia chi: %s", student.getName(), student.getAge(), student.getAddress()).println();
	}
}
