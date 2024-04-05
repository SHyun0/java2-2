# 최성현 202130234

## 4월5일
배열리턴  
-배열의 래퍼런스만 리턴(배열 전체가 리턴이 되는것이 아니다)  

<자바의 예외처리>  
예외(exception)  
-실행 중 오작동이나 결과에 악 영향을 미치는 예상치 못한 상황 발생  
-실행 중 예외가 발생하면 자바 플랫폼은  응용프로그램이 예외를 처리하도록 호출  
(응용프로그램이 예외 처리를 하지 않으면 프로그램 강제종료 시킴)  
예외 발생하는 경우
-정수를 0으로 나누는 경우  
-배열의 크기보다 큰 인덱스로 배열의 원소에 접근하는 경우  
-정수를 읽는 코드가 실행되고 있을떄 사용자가 문자를 입력한 경우  
예외 처리
-발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것  
-try catch finally 문 사용  

<자바 객체 지향 특성>  
-캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것
-상속 : 상위 게체의 속성이 하위 개체에 물려짐 / 하위 게체가 상위 개체의 속성을 모두 가지는 관계  
자바 상속 : 상위 클래스의 멤버를 하위 클래스가 물려받음  
-다향성 : 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것  

클래스 : 객체의 설계도 혹은 틀 / 객체 : 클래스의 틀로 찍어낸실체  
생성자 : 객체가 생성될 때 초기화 목적으로 실행되는 메소드. 객체가 생성되는 순간에 자동 호출  

생성자의 특징
-생성자 이름은 클래스 이름과 동일  
-생성자는 여러 개 작성 가능  
-생성자는 객체 생성시 한 번만 호출
-생성자의 목적은 객체 생성 시 초기화  
-생성자는 리턴 타입을 지정할 수 없음  

<this 레퍼런스>  
this : 객체 자신에 대한 레퍼런스  
this()  
-같은 클래스의 다른 생성자 호출  
-생성자 내에서만 사용 가능  
-생성자 코드의 제일 처음에 있어야 함  

자바의 객체배열 만들기 3단계  
1. 배열 레퍼런스 변수 선언  
2. 레퍼런스 배열 생성
3. 배열의 각 원소객체 생성

<메소드>  
-메소드는 C/C++ 의 함수와 동일  
-자바의 모든 메소드는 반드시 클래스 안에 있어야 함 캡슐화 원칙  

오버로딩  
-한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성  

객체 소멸  
-new 에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위  


## 3월29일
< 리터럴 >  
프로그램에서 직접 표현한 값  
-정수 리터럴 : 10진수, 8진수, 16진수, 2진수 리터럴  
-실수 리터럴 : 소수점 형태나 지수 형태로 표현한 실수  
-문자 리터럴 : 단일 인용부호(' ')로 문자 표현  
-논리 타입 리터럴 : 논리값 표시 true or false  
-null 리터럴 : 레퍼런스에 대입 사용
-문자열 리터럴 : 문자열 리터럴은 String 객체로 자동 처리  

System.in
-키보드와 연결된 자바의 표준 입력 스트림  

< Scanner 클래스 >  
읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴 [java.util.Scanner]  
키보드에 연결된 System.in에게 키를 읽게 하고, 원하는 타입으로 변환하여 리턴  

< 연산 >
주어진 식울 계산하여 결과를 얻어내는 과정  
연산의 종류(증감 / 산술 / 시프트 / 비교 / 비트 / 논리 / 조건 / 대입)  
산술 연산자 : 더하기(+), 빼기(-), 곱하기(*), 나누기(/), 나머지(%)  
비교 연산자 : 두 개의 값을 비교하여 true/false 결과  
논리 연산자 : 두 개의 논리 값에 논리 연산. 논리 결과  
비트 논리 연산 : 피 연산자의각 비트들을 대상으로 하는 연산  
비트 시프트 연산 : 비트를 오른쪽이나 왼쪽으로 이동  

< 조건문 >
단순 if문 / if-else문 / 다중 if문 / switch문  
switch문 내 break문을 만나면 switch문 벗어남  

< 반복문 >
for 문, while 문, do-while 문  
중첩 반복  
countiue문  
break문  

< 자바 배열 >  
인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조  
배열 인덱스(0부터 시작)  

## 3월22일
ctrl + shift + p -> Creat Java Project -> No Bulid tools -> 폴더선택 -> 프로젝트/이름생성(Test)  
새로만든 폴더(Test)에서 파일 복사 후 기존 폴더(java2-2)에 붙여넣기 - src/App.java 실행 테스트  
<오류뜨면 VS code 재실행>  

< 프로그래밍언어 >  
-기계어 : 0.1의 이진수로 구성된 언어  
-어셈블러어 : 기계어 명령을 표현하기 쉬운 상징적인 단어로 일대일 대응시킨 언어  
-고급언어 : 사람이 이해하기 쉽고, 복잡한 작업, 알고리즘, 자료구를 표현하기 위한 언어  

자바 응용프로그램 실행  
-main() 메소드를 가진 클래스의 mamin()에서 실행시작  
JDK(Java Developement Kit)  
-자바 응용 개발 환경  
JRE(Java Runtime Environment)  
-자바 실행 환경  
자바 API(Application Programming Interface)
-JDK에 포함된 클래스 라이브러리  

< 자바의 특징 >  
플랫폼 독립성, 객체지향, 캡슐화, 실행코드배포  
패키지, 멀티스레드, 가비지 컬렉션  
프로그램 작성 쉬움  

식별자의 원칙  
-‘@’, ‘#’, ‘!’와 같은 특수 문자, 공백 또는 탭은 식별자로 사용할 수 없으나 ‘_’, ‘$’는 사용 가능  
-유니코드 문자, 한글 사용 가능  
-식별자의 첫 번쨰 문자로 숫자는 사용불가  

< 자바의 데이터 타입 >  
기본 타입 8개 (bloolean / char / byte / short / int / long / float / double)

## 3월15일
내용
