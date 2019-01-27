import java.util.*;
import java.io.*;

/*// HW6
class Elevator{
	//field
	
	int floor;
	boolean door;
	
	void open(){
		System.out.println("������");
		door = true;
	}
	
	void close(){
		System.out.println("������");
		door = false;
		
	}
	
	void move(int floor){
		if(floor>=-2&&floor<=10){
			close();
			if(floor>this.floor){
				for(int i=this.floor ; i<floor ; i++){
					report(i+1);
				}
				this.floor = floor;
			}else if(floor<this.floor){
				for(int i=this.floor ; i>floor ; i--){
					report(i-1);
				}
				this.floor = floor;
			}else;
			open();
		}else{
			System.out.println("��ȿ�� ������ �Է��Ͻÿ�");
		}
	}
	
	void report(int floor) {
		try{
			if(floor==0) System.out.println("�κ�");
			else if (floor<0) System.out.println("B"+(-floor));
			else System.out.println(floor+"��");
			
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("���ܹ߻�...");
		}
			
	}
}

class ElevatorTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		Elevator a = new Elevator();

		
		System.out.println("�� ��?");
		a.move(s.nextInt());
		System.out.println("�� ��?");
		a.move(s.nextInt());
		System.out.println("�� ��?");
		a.move(s.nextInt());
		System.out.println("�� ��?");
		a.move(s.nextInt());
		
		
	}
}*/

/*//HW7
class Student{
	//field
	private String name;
	private double grade;
	private int age;
	
	int getAge(){
		return age;
	}
	
	double getGrade(){
		return grade;
	}
	
	void setAge(int age){
		
		if(age>=0&&age<200)	this.age =age;
		else return;
	}
	
	void setGrade(double grade){
		if(grade>=0&&grade<=4.3) this.grade = grade;
		else return;
	}
	
	//������
	Student(){
		name = "ȫ�浿";
		grade = 4.3;
		age = 10;
	}
	
	Student(double grade){
		setGrade(grade);
	}
	
	Student(String name, int age, double grade){
		this.name = name;
		setAge(age);
		setGrade(grade);
	}
	
	public String toString(){
		return String.format("�̸� : %s, ���� : %.2f , ���� : %d", name, grade, age);
	}
}

class StudentTest{
	public static void main(String[] args){
		Student a = new Student();
		Student b = new Student("���ؿ�",31,4.0);
		Student c = new Student(4.3);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// System.out.println( a.getGrade() + a.getAge());
	}
}*/

/*//HW8

class Member{
	private String name;
	private int age;
	private static int number;
	
	int getNumber(){
		return number;
	}
	Member(){
		number++;
	}
	
	Member(String name, int age){
		this();
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return String.format("�̸� : %s, ���� :%d\n",name,age);
	}
}

class MemberTest{
	public static void main(String [] args){
		
		Member a = new Member();
		Member b = new Member("��",12);
		
		Scanner s =  new Scanner(System.in);
		System.out.println("�̸�?");
		String name = s.nextLine();
		System.out.println("����");
		int age = s.nextInt();
		
		Member c = new Member(name,age);
		
		System.out.println(""+a+b+c+"�� ȸ�� ��: "+a.getNumber());
	}
}

*/

//array

/*//HW9
//HW9_1
class Figure{
	double circum;
	double area;
	
	Figure(double circum, double area){
		this.circum = circum;
		this.area = area;
	}
	
	public String toString(){
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n",this.getClass().getName(),circum,area);
	}
}

class Circle extends Figure{
	double r;
	
	Circle(double r){
		super(Math.PI*r*2,Math.PI*r*r);
		this.r = r;
	}
	
	public String toString(){
		return super.toString()+"��, �������� " +r + "�Դϴ�.\n";
	}
	
	public boolean equals(Object o){
		if(o instanceof Circle){
			return ((Circle)o).r == this.r;
		}else return false;
	}
}

class EquilateralTriange extends Figure{
	
	double l;
	EquilateralTriange(double l){
		super(3*l,l*Math.sqrt(3)/4*l);
		this.l = l;
	}
	
	public String toString(){
		return super.toString()+"�� �� �ﰢ���� �Ѻ��� ���̴� "+l+"�̰�, ���̴� "+Math.sqrt(3)/2*l+"�Դϴ�\n";
	}
}

class FigureTest{
	public static void main(String[] args){
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(1.0);
		EquilateralTriange e = new EquilateralTriange(3.0);
		
		System.out.println("" +c1 + c2 + e);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(e));
		
	}
}*/


/*//HW10
class HW10{
	public static void main(String[] args){
		Animal [] animal = {new Cat(), new Dolphin(), new Dove(),new Kitten()};
		for(Animal a: animal) a.move();
	}
}

class Animal{
	
	Animal(){
		System.out.println("�������� ����");
	}
	void move(){
		System.out.printf("���� %s�̰�, ",this.getClass().getName());
	}
}

class Cat extends Animal{
	
	Cat (){
		System.out.println("����� ���� ����");
	}
	@Override
	void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
}


class Dolphin extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
}

class Dove extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("���ƴٴմϴ�.");
	}
}

class Kitten extends Cat{
	Kitten(){
		System.out.println("�Ʊ����� ���� ����!");
	}
	@Override
	void move(){
		super.move();
		System.out.println("���� �޸��ϴ�.");
	}
}

class Subject{
	private int score;
	
	int getScore(){
		return score;
	}
	
	Subject(){
		score = (int)(Math.random()*101);
	}
}

class Korean extends Subject{
	
}

class English extends Subject{
	
}

class Science extends Subject{
	
}

class Mathematics extends Subject{
	
}

class Student{
	
	static void report(Subject [] s){
		for(Subject sub : s){
			
			System.out.printf("%s ������ ����: %d",sub.getClass().getName(),sub.getScore());
		}
	}
	
	public static void main(String[] args){
		Student student = new Student();
		Subject [] sub = new Subject[4];
		sub[0] = new Korean();
		sub[1] = new Mathematics();
		sub[2] = new Science();
		sub[3] = new English();
		
		student.report(sub);
	}
}
*/


/* HW11
class CircleTest{
	public static void main(String[] args) throws FileNotFoundException{
		
		if(args.length<1){
			System.out.println("����: java CircleTest ����� ����� ����");
			return;
		}
		File f1 = new File("���� �������� ����.java");
		File f2 = new File(args[0]);
		
		if(f1.exists()){
			Scanner s = new Scanner(f1);
			int i = 0;
			if(!f2.exists()){
				PrintWriter pw = new PrintWriter(f2);
				while(s.hasNext()){
					i+=1;
					int r = s.nextInt();
					double area = s.nextDouble();
					
					if(3.14*r*r==area){
						pw.println(i+"��° ���� ���̴� ����� ���������ϴ�: ������("+r+"), ����("+area+")");
					}else{
						pw.println(i+"��° ���� ���̴� �߸� ���������ϴ�: ������("+r+") �ϰ�� ���̴� ("+area+") �� �ƴ϶� "+3.14*r*r+"�Դϴ�.");

					}
				}
				pw.close();
			}else{
				System.out.println(args[0]+"������ �̹� �����մϴ�. ���ο� ���ϸ��� �Է����ּ���.");
			}
			s.close();
		}else{
			System.out.println("���� �������� ����.java ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
		}
		
	}
}

class StudentTest{
	public static void main(String[] args){
		File f = new File("�л�����.java");
		Student [] students = new Student[3];
		try{
			
			Scanner s = new Scanner(f);
			
			while(s.hasNext()){
				for(int i=0 ; i<students.length ; i++){
					students[i] = new Student(s.next(), s.nextInt(), s.nextDouble());
				}
			}
			s.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("�����߻�");
		}
		for(Student student: students){
			System.out.println(student);
		}
		
		
	}
}

class Student{
	private String name;
	private int grade;
	private double score;
	
	Student(){
		name = "����";
		grade = 3;
		score = 4.3;
	}
	
	Student(String name, int grade, double score){
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	
	public String toString(){
		return String.format("�̸�: %s, �г�: %d, ����: %.1f",name,grade,score);
	}
}
*/

/*//HW12

class HW12_1{
	public static void main(String[] args){
		
		String [] intArr = {"12","101","����"};
		try{
			transInt(intArr);
			
		}catch(NumberFormatException ne){
			System.out.println("�迭���� ������ ��ȯ�� �� ���� ������ �����մϴ�.");
		}
		
	}
	
	static void transInt(String [] arr) throws NumberFormatException{
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(Integer.parseInt(arr[i]));
		}
		
	}
}


class WorkTest{
	public static void main(String[] args){
		int numberOfEmployee = 10;
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� ���� ����: ");
		
		try{
			int duty=s.nextInt();
			
			if(duty<0) throw new NegativeWorkException();
			
			System.out.println("�� ����� �ִ� ���� ��: "+ (int)Math.ceil(duty/10.0));
			
		}catch(InputMismatchException ime){
			System.out.println("�������� ������ �Է��ϼ���.");
		}catch(NegativeWorkException nwe){
			System.out.println("�������� ������ �� �����ϴ�.");
		}finally{
			System.out.println("���α׷� ���� ");
		}
		
	}
}

class NegativeWorkException extends Exception{
	NegativeWorkException(){
		super("����");
	}
}
*/

/*
class Practice{
	public static void main(String[] args) throws Exception{
		File f = new File("��ȭ��ȣ��.txt");
		Store [] stores = new Store[5];
		if(!f.exists()){
			System.out.println("���Ͼ���");
			return;
		}
		
		Scanner s = new Scanner(f);
		int i = 0;
		while(s.hasNext()){
			stores[i] = new Store(s.next(),s.nextLine());	
			i+=1;
		}
		
		for(i=0; i<stores.length-1 ; i++){
			for(int j=i+1; j<stores.length ; j++){
				if(stores[i].name.compareTo(stores[j].name)>0){
					Store tmp = stores[i];
					stores[i] = stores[j];
					stores[j] = tmp;
				}else;
			}
		}
		for(Store store:stores){
			
			System.out.println(store);
		}
		
	}
}

class Store{
	//field
	String name;
	String number;
	
	Store(String name, String number){
		this.name = name;
		this.number = number;
		
	}
	
	public String toString(){
		return String.format("%s\t %s\n",name,number);
	}
}*/


//HW6
class Car{
	int mileage;
	int width;
	 int height;
	int direction;

	int getWidth(){
		return width;
	}

	int getHeight(){
		return height;
	}
	
	
	void goStraight(int distance){

		if(direction%4==0){//��
			if(height<40){
				System.out.println(distance+"m �����߽��ϴ�.");
				height+=distance;
			}else{
				System.out.printf("���� ������ �� �Խ��ϴ�. %d��ŭ�� �����Ͽ����ϴ�.",40-height);
				height = 40;
			}
			
		}else if(direction%4==1){
			//��
			if(width<50){
				System.out.println(distance+"m �����߽��ϴ�.");
				width+=distance;
			}else{
				System.out.printf("���� ������ �� �Խ��ϴ�. %d��ŭ�� �����Ͽ����ϴ�.",50-width);
				width = 50;
			}

		}else if(direction%4==2){
			//��
			
				System.out.println(distance+"m �����߽��ϴ�.");
				height-=distance;

		}else if(direction%4==3){
			//����
			
				System.out.println(distance+"m �����߽��ϴ�.");
				width-=distance;

		}
		
		mileage+=distance;
		
	}
	
	void turnLeft(){
		System.out.println("��ȸ�� �մϴ�");
		direction +=1;
	}
	
	void turnRight(){
		System.out.println("��ȸ�� �մϴ�.");
		direction -=1;
		
	}
	
	void getMileage(){
		System.out.println("�� ����Ÿ��� "+mileage+"�Դϴ�.");
	}
	
	
}

class Driver{
	public static void main(String[] args){
		Car c = new Car();
		while(c.height!=40||c.width!=50){
			System.out.println("0.���� 1.��ȸ�� 2.��ȸ��");
			Scanner s = new Scanner(System.in);
			int number = s.nextInt();
			switch(number){
				case 0 : 
					System.out.println("�� ����?");
					c.goStraight(s.nextInt());
					break;
				case 1 : 
					c.turnLeft();
					break;
				case 2:
					c.turnRight();
					break;
				default:
					System.out.println("�ٸ� ���� �Է��Ͻÿ�");
			}
			
		}
		System.out.println("�������� �����Ͽ����ϴ�.");
		c.getMileage();
		
	}
}