import java.util.*;
import java.io.*;

/*// HW6
class Elevator{
	//field
	
	int floor;
	boolean door;
	
	void open(){
		System.out.println("문열림");
		door = true;
	}
	
	void close(){
		System.out.println("문닫힘");
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
			System.out.println("유효한 층수를 입력하시오");
		}
	}
	
	void report(int floor) {
		try{
			if(floor==0) System.out.println("로비");
			else if (floor<0) System.out.println("B"+(-floor));
			else System.out.println(floor+"층");
			
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("예외발생...");
		}
			
	}
}

class ElevatorTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		Elevator a = new Elevator();

		
		System.out.println("몇 층?");
		a.move(s.nextInt());
		System.out.println("몇 층?");
		a.move(s.nextInt());
		System.out.println("몇 층?");
		a.move(s.nextInt());
		System.out.println("몇 층?");
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
	
	//생성자
	Student(){
		name = "홍길동";
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
		return String.format("이름 : %s, 학점 : %.2f , 나이 : %d", name, grade, age);
	}
}

class StudentTest{
	public static void main(String[] args){
		Student a = new Student();
		Student b = new Student("류준열",31,4.0);
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
		return String.format("이름 : %s, 나이 :%d\n",name,age);
	}
}

class MemberTest{
	public static void main(String [] args){
		
		Member a = new Member();
		Member b = new Member("김",12);
		
		Scanner s =  new Scanner(System.in);
		System.out.println("이름?");
		String name = s.nextLine();
		System.out.println("나이");
		int age = s.nextInt();
		
		Member c = new Member(name,age);
		
		System.out.println(""+a+b+c+"총 회원 수: "+a.getNumber());
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
		return String.format("이 도형은 %s이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n",this.getClass().getName(),circum,area);
	}
}

class Circle extends Figure{
	double r;
	
	Circle(double r){
		super(Math.PI*r*2,Math.PI*r*r);
		this.r = r;
	}
	
	public String toString(){
		return super.toString()+"또, 반지름은 " +r + "입니다.\n";
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
		return super.toString()+"또 이 삼각형의 한변의 길이는 "+l+"이고, 높이는 "+Math.sqrt(3)/2*l+"입니다\n";
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
		System.out.println("동물생성 성공");
	}
	void move(){
		System.out.printf("나는 %s이고, ",this.getClass().getName());
	}
}

class Cat extends Animal{
	
	Cat (){
		System.out.println("고양이 생성 성공");
	}
	@Override
	void move(){
		super.move();
		System.out.println("달립니다.");
	}
}


class Dolphin extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("수영합니다.");
	}
}

class Dove extends Animal{
	@Override
	void move(){
		super.move();
		System.out.println("날아다닙니다.");
	}
}

class Kitten extends Cat{
	Kitten(){
		System.out.println("아기고양이 생성 성공!");
	}
	@Override
	void move(){
		super.move();
		System.out.println("나도 달립니다.");
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
			
			System.out.printf("%s 과목의 점수: %d",sub.getClass().getName(),sub.getScore());
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
			System.out.println("사용법: java CircleTest 결과가 저장될 파일");
			return;
		}
		File f1 = new File("원의 반지름과 넓이.java");
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
						pw.println(i+"번째 원의 넓이는 제대로 구해졌습니다: 반지름("+r+"), 넓이("+area+")");
					}else{
						pw.println(i+"번째 원의 넓이는 잘못 구해졌습니다: 반지름("+r+") 일경우 넓이는 ("+area+") 가 아니라 "+3.14*r*r+"입니다.");

					}
				}
				pw.close();
			}else{
				System.out.println(args[0]+"파일이 이미 존재합니다. 새로운 파일명을 입력해주세요.");
			}
			s.close();
		}else{
			System.out.println("원의 반지름과 넓이.java 파일이 존재하지 않습니다. 확인해주세오.");
		}
		
	}
}

class StudentTest{
	public static void main(String[] args){
		File f = new File("학생정보.java");
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
			System.out.println("오류발생");
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
		name = "웅냥";
		grade = 3;
		score = 4.3;
	}
	
	Student(String name, int grade, double score){
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	
	public String toString(){
		return String.format("이름: %s, 학년: %d, 학점: %.1f",name,grade,score);
	}
}
*/

/*//HW12

class HW12_1{
	public static void main(String[] args){
		
		String [] intArr = {"12","101","백일"};
		try{
			transInt(intArr);
			
		}catch(NumberFormatException ne){
			System.out.println("배열에서 정수로 변환할 수 없는 성분이 존재합니다.");
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
		
		System.out.println("총 업무 개수: ");
		
		try{
			int duty=s.nextInt();
			
			if(duty<0) throw new NegativeWorkException();
			
			System.out.println("한 사원의 최대 업무 수: "+ (int)Math.ceil(duty/10.0));
			
		}catch(InputMismatchException ime){
			System.out.println("업무수는 정수로 입력하세요.");
		}catch(NegativeWorkException nwe){
			System.out.println("업무수는 음수일 수 없습니다.");
		}finally{
			System.out.println("프로그램 종료 ");
		}
		
	}
}

class NegativeWorkException extends Exception{
	NegativeWorkException(){
		super("음수");
	}
}
*/

/*
class Practice{
	public static void main(String[] args) throws Exception{
		File f = new File("전화번호부.txt");
		Store [] stores = new Store[5];
		if(!f.exists()){
			System.out.println("파일없음");
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

		if(direction%4==0){//위
			if(height<40){
				System.out.println(distance+"m 직진했습니다.");
				height+=distance;
			}else{
				System.out.printf("길의 끝까지 다 왔습니다. %d만큼만 직진하였습니다.",40-height);
				height = 40;
			}
			
		}else if(direction%4==1){
			//왼
			if(width<50){
				System.out.println(distance+"m 직진했습니다.");
				width+=distance;
			}else{
				System.out.printf("길의 끝까지 다 왔습니다. %d만큼만 직진하였습니다.",50-width);
				width = 50;
			}

		}else if(direction%4==2){
			//밑
			
				System.out.println(distance+"m 직진했습니다.");
				height-=distance;

		}else if(direction%4==3){
			//오른
			
				System.out.println(distance+"m 직진했습니다.");
				width-=distance;

		}
		
		mileage+=distance;
		
	}
	
	void turnLeft(){
		System.out.println("좌회전 합니다");
		direction +=1;
	}
	
	void turnRight(){
		System.out.println("우회전 합니다.");
		direction -=1;
		
	}
	
	void getMileage(){
		System.out.println("총 주행거리는 "+mileage+"입니다.");
	}
	
	
}

class Driver{
	public static void main(String[] args){
		Car c = new Car();
		while(c.height!=40||c.width!=50){
			System.out.println("0.직진 1.좌회전 2.우회전");
			Scanner s = new Scanner(System.in);
			int number = s.nextInt();
			switch(number){
				case 0 : 
					System.out.println("몇 미터?");
					c.goStraight(s.nextInt());
					break;
				case 1 : 
					c.turnLeft();
					break;
				case 2:
					c.turnRight();
					break;
				default:
					System.out.println("다른 수를 입력하시오");
			}
			
		}
		System.out.println("목적지에 도착하였습니다.");
		c.getMileage();
		
	}
}