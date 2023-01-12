package date_0930;

public class DefineClass {
	// 객체지향 프로그램: OOP(Object Oriented Programing)
	//1.상속
	//2.다형성
	//3.캡슐화(정보은닉)
	
//	*속성(멤버변수: 자동초기화) : 자동 초기화 - 명시적 초기화 - 초기화 블록 -생성자
//	             인스터스 변수
//	            -객체 생성을 통해 사용 가능하다.
//	            -생성자에 의해 초기화된다.(값을 집어 넣는다)
//	             클래스 변수
//	             -객체 생성 유무와 상관없이 사용 가능하다.
//	             -필요헤 따라서 직접 초기화 한다.
//	             -객체에서 공유한다.
//	
// *초기화 블록
//	     인스턴스 초기화 블록
//	     -인스턴스 변수를 초기화 한다.
//    클래스(static) 초기화 블록
//       -클래스 변수를 초기화 한다.
//         
//	*셍성자
//	   -기본 생성자가 모든 클래스에 존재한다.(생략 가능)
//	   -멤버변수(인스턴스 변수)를 초기화 한다.
//	   -클래스 이름과 동일하다.
//	   -매개변수를 정의 할 수 있다.
//	   -오버로딩이 가능하다.
//	   -객체 생성 시 호출(사용)되어진다.
//	   -생성자간 호출이 가능하다.(this() 사용)
//	   -멤버변수와 매개변수를 구분하기 위해 this 속성을 사용한다.
//
//	*기능(메소드)
//	   인스턴스 메소드
//	   -객체를 생성해야 사용 가능하다.
//	   -인스턴스 와 클래스 멤버 모두 사용 할 수 있다.
//	   클래스(static)메소드
//	   -객체 생성 유무와 상관없이 사용 가능하다.
//	   -클래스 멤버만 사용 할 수 있다.
//	   공통 - 오버로딩이 가능하다(oop의 다형성을 구현)

	
	int iv; //인스턴스 변수
	static int cv; // 클래스 (static) 변수
	
	{ // 인스턴스  초기화 블록
		iv = 10;
	}
	
	static { //클래스(static) 초기화 블록
		cv =20;
	}
	
//	DefineClass0930(){ //기본생성자
//		
//	}
	
	DefineClass(){ //생성자의 오버로딩
		this.iv = 30;
	}
	
	void instanceMethod() { //인스턴스 메소드
		iv = 50;
		cv = 60;
	}
	
	void instanceMethod(int x) { //메소드 오버로딩
		iv = 100;
		cv = 200;
	}
	
	static void staticMethod() { //클래스 메소드
		cv = 70;
		//iv = 80; // 인스턴스 멤버 사용 시 오류 발생.
	}
	
}
