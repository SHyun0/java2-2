# 최성현 202130234

## 5월24일
< 이벤트 기반 프로그래밍 >  
- 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식  
- 반대되는 개념: 배치실행(batch programming)  
- 이벤트종류  
    ㄴ사용자의입력: 마우스드래그, 마우스클릭, 키보드누름등  
    ㄴ센서로부터의입력, 네트워크로부터데이터송수신  
    ㄴ다른응용프로그램이나다른스레드로부터의메시지  
-  GUI 응용프로그램은 이벤트 기반 프로그래밍으로 작성됨  

-- 이벤트가 처리되는 과정 --  
1. 이벤트 발생  
2. 이벤트 객체 생성  
3. 응용프로그램에 작성된 리스너 찾기  
4. 이벤트 리스너 실행  

< 이벤트 객체 >
-  발생한 이벤트에 관한 정보를 가진객체, 이벤트리스너에 전달됨  

▼ 이벤트객체가 포함하는 정보 ▼  
- 이벤트 종류와 이벤트 소스  
- 이벤트가 발생한 화면좌표 및 컴포넌트 내 좌표  
- 이벤트가 발생한버튼이나 메뉴아이템의 문자열  
- 클릭된 마우스버튼번호 및 마우스의 클릭횟수  
- 키의코드값과문자값  
- 체크박스, 라디오버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크상태  

※ 이벤트소스를 알아내는 메소드 :  Object getSource()  

< 리스너인터페이스 >  
- 이벤트 리스너  
    ㄴ 이벤트를 처리하는 자바 프로그램 코드, 클래스로 작성  
- 자바는 다양한 리스너 인터페이스 제공  
- 사용자의 이벤트리스너 작성  
    ㄴ자바의 리스너인터페이스(interface)를 상속받아 구현  
    ㄴ리스너인터페이스의 모든 추상메소드 구현  

▣ 이벤트 리스너 작성 방법  
1. 독립클래스로작성  
    ㄴ이벤트리스너를 완전한 클래스로 작성  
    ㄴ이벤트리스너를 여러곳에서 사용할 때 적합  
2. 내부클래스(inner class)로 작성   
    ㄴ클래스안에 멤버처럼클래스작성  
    ㄴ이벤트리스너를 특정클래스에서만 사용할 때 적합  
3. 익명클래스(anonymous class)로 작성  
    ㄴ클래스의이름없이간단히리스너작성  
    ㄴ클래스조차 만들 필요없이 리스너코드가 간단한 경우에 적합  

< 어댑터 클래스 >  
- 이벤트 리스너 구현에 따른 부담 (리스너의추상메소드를모두구현해야하는부담)  

< Key 이벤트와 포커스 >  
- 키입력시, 다음세경우각각Key 이벤트발생  
    ㄴ키를 누르는 순간  
    ㄴ누른 키를 떼는 순간  
    ㄴ누른 키를 떼는 순간(Unicode 키의 경우에만)  
- 키이벤트를 받을 수 있는 조건  
    ㄴ모든 컴포넌트  
    ㄴ현재포커스(focus)를 가진 컴포넌트가 키이벤트독점  
- 포커스(focus)  
    ㄴ컴포넌트나 응용프로그램이 키이벤트를 독점하는 권한  
    ㄴ컴포넌트에포커스설정방법: 다음2 라인코드필요  

< KeyListener >  
- 응용프로그램에서KeyListener를 상속받아 키 리스너구현  
- KeyListener의 3개 메소드( keyPressed / keyReleased / keyTyped )  

< 유니코드(Unicode) 키 >  
- 특징  
    ㄴ국제산업표준  
    ㄴ전세계의 문자를 컴퓨터에서 일관되게 표현하기 위한 코드체계  
    ㄴ문자들에 대해서만 키코드값 정의  
    ㄴ문자가아닌키경우에는표준화된키코드값없음  
- 유니코드키가 입력 되는 경우 : keyPressed(), keyTyped(), keyReleased() 가 순서대로 호출  
- 유니코드키가 아닌 경우 : keyPressed(), keyReleased() 만 호출됨  

< 가상키와 입력된 키판별 >  
- KeyEvent 객체  
    ㄴ입력된키정보를가진이벤트객체  
    ㄴKeyEvent 객체의 메소드로 입력된키판별  
-  KeyEvent 객체의 메소드로 입력된 키판별  
    char KeyEvent.getKeyChar()  
        ㄴ키의유니코드문자값리턴  
        ㄴUnicode 문자 키인경우에만의미있음  
        ㄴ입력된키를판별하기위해문자값과비교하면됨  
    int KeyEvent.getKeyCode()  
        ㄴ유니코드키포함  
        ㄴ모든키에 대한 정수형 키코드 리턴  
        ㄴ입력된키를 판별하기 위해 가상키(Virtual Key) 값과 비교하여야 함  
        ㄴ가상키값은 KeyEvent클래스에 상수로 선언  
- 가상 키는 KeyEvent 클래스에 상수로 선언  

◆ Mouse 이벤트 : 사용자의 마우스조작에 따라 발생하는 이벤트  
        ㄴmouseClicked() : 마우스가 눌러진 위치에서 그대로 떼어질때 호출  
      ㄴmouseReleased() : 마우스가 눌러진 위치에서 그대로 떼어지든 아니든항상호출  
      ㄴmouseDragged(): 마우스가 드래그되는 동안 계속 여러번호출  

## 5월17일
< FlowLayout >  
- 배치방법 : 컴포넌트를컨테이너내에왼쪽에서오른쪽으로배치  
- 생성자 : FlowLayout() / FlowLayout(int align, int hGap, int vGap)   
< BorderLayout >  
- 배치방법 : 컨테이너공간을5 구역으로분할, 배치  
- 생성자 : BorderLayout() / BorderLayout(int hGap, int vGap)  
- add 메소드 -  void add(Component comp, int index)  
< GridLayout >  
- 배치방법 : 컨테이너공간을 동일한 사각형격자(그리드)로 분할하고 각 셀에컴포넌트 하나씩 배치  
- 생성자 : GridLayout() /  GridLayout(int rows, int cols) / GridLayout(int rows, int cols, int hGap, int vGap)  

< 배치관리자가없는컨테이너가필요한경우 >  
-응용프로그램에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우  
1. 컴포넌트의 크기나 위치를 개발자임의로 결정하고자 하는 경우  
2. 게임 프로그램과 같이 시간이나 마우스/키보드의 입력에 따라 컴포넌트들의 위치와 크기가 수시로 변하는 경우  
3. 여러 컴포넌트들이 서로겹쳐출력하고자 하는 경우  

< 배치관리자가없는컨테이너에컴포넌트를삽입할때 >
- 프로그램에서 컴포넌트의 절대크기와 위치설정  
- 컴포넌트들이 서로겹치게 할 수 있음  


## 5월3일
<컬렉션>  
- 요소(element)라고 불리는 가변 개수의 객체들의저장소  
컬렉션은 제네릭(generics) 기법으로 구현  
- 제네릭 : 특정타입만다루지않고,여러종류의타입으로변신할수있도록클래스나 메소드를 일반화시키는기법 

<벡터Vector< E >의 특성>  
- < E >에 사용할요소의특정타입으로구체화  
- 배열을가변크기로다룰수있게하는컨테이너  
- Vector에 삽입 가능한 것 : 객체, null / 기본타입의값은Wrapper 객체로만들어저장  
ArrayList< E >  
- 가변크기배열을구현한클래스  
- 벡터와거의동일  
Iterator < E> 인터페이스  
- 리스트구조의컬렉션에서요소의순차검색을위한인터페이스  

< HashMap (K,V) >  
- 키(key)와 값(value)의 쌍으로 구성되는 요소를 다루는 컬렉션  
- 삽입및검색이빠른특징 ( 요소삽입: put() 메소드, 요소검색: get() 메소드 )  

< GUI(Graphical User Interface) >  
- 사용자가편리하게입출력할수있도록그래픽으로화면을구성하고, 마우스나키보드로입력 받을수있도록지원하는사용자인터페이스  
AWT와Swing 패키지  
- AWT 컴포넌트의 그리기는 운영체제에 의해 이루어지며, 운영체제에 의 자원을 많이 소모하고 부담을 줌  
- 운영체제가 직접그리기 때문에 속도는 빠름  
- Swing 패키지는 AWT 기술을기반으로작성된자바라이브러리(모든AWT 기능+ 추가된풍부하고화려한고급컴포넌트)  

<컨테이너>  
- 다른컴포넌트를 포함할수있는 GUI 컴포넌트, 다른컨테이너에포함될수있음  
<컴포넌트>  
- 컨테이너에 포함되어야 화면에 출력될 수 있는 GUI 객체  
- 다른컴포넌트를 포함할 수 없는 순수컴포넌트  
- 모든GUI 컴포넌트가상속받는클래스: java.awt.Component  
- 스윙컴포넌트가 상속받는 클래스: javax.swing.JComponent  
<최상위컨테이너>  
-  다른컨테이너에 포함되지않고도 화면에 출력되며 독립적으로 존재 가능한 컨테이너  

<스윙GUI 프로그램을만드는과정>  
1. 스윙 프레임만들기  
2. main() 메소드 작성  
3. 스윙 프레임에스윙컴포넌트붙이기  

<스윙프레임>  
- 모든스윙컴포넌트를담는최상위컨테이너 (JFrame을상속받아구현 컴포넌트들은화면에보이려면스윙프레임에부착되어야함)  
- 기본구성 : 프레임–스윙프로그램의기본틀, 메뉴바–메뉴들이부착되는공간, 컨텐트팬–GUI 컴포넌트들이부착되는공간  
-- 스윙응용프로그램에서main()의 기능최소화바람직 --  


## 4월19일
<메소드 오버라이딩(Method Overriding)>
- 서브클래스에서 슈퍼클래스의 메소드 중복 작성  
- 슈퍼클래스의 메소드무력화, 항상서브클래스에 오버라이딩한 메소드가 실행되도록 보장됨  
오버라이딩조건  
- 슈퍼클래스메소드의 원형(메소드이름, 인자타입및개수, 리턴타입) 동일하게 작성  
오버라이딩으로 다형성실현  
- 하나의 인터페이스(같은이름)에 서로다른구현 

메소드 오버로딩 : 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성 (정적 바인딩)  
메소드 오버라이딩 : 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 매소드 재작성 (동적 바인딩)  

추상 메소드 (abstract method)    
- abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언  
추상 클래스  
- 추상메소드를가지며,abstract로 선언된 클래스  
- 추상메소드없이, abstract로 선언한 클래스
상속  
- 추상 클래스를 상속받으면 추상 클래스가 됨  
- 서브 클래스도 abstract로 선언해야함  
구현  
- 서브클래스에서슈퍼클래스의추상메소드구현(오버라이딩)  
- 추상클래스를구현한서브클래스는추상클래스아님  
목적  
- 상속을위한슈퍼클래스로활용하는것, 서브클래스에서추상메소드구현, 다형성실현  

<자바의 인터페이스>  
클래스가구현해야할메소드들이선언되는추상형  
interface 키워드로 선언  
여전히인터페이스에는필드(멤버변수)선언불가  
구성 요소  
- 상수, 추상 메소드, default메소드, private메소드, static메소드  
인터페이스 간에 상속 가능  
- 인터페이스를 상속하여 확장된 인터페이스 작성가능  
- extends 키워드로 상속 선언  
인터페이스의 추상메소드를 모두구현한 클래스작성  
- implements 키워드 사용  
- 여러개의인터페이스동시구현가능  

패키지  
- 서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묶어 놓은 디렉터리  
- 하나의 응용프로그램은 한 개 이상의 패키지로 작성  
- 패키지는 jar 파일로 압축할 수 있음  
모듈   
- 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너  
- 하나의 모듈을 하나의 jmod 파일에 저장  
모듈의 현실  
- Java 9 부터 전면적으로 도입  
- 복잡한 개념  
- 큰 자바 응용프로그램에는 개발 , 유지보수 등에 적합  
- 현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요 없음  
자바 모듈화의 목적  
- 자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함  
- 컴퓨터 시스템의 불필요한 부담 감소  

<Object 클래스>  
특징  
- 모든 자바 클래스는 반드시 Object 를 상속받도록 자동 컴파일  
 ㄴ 모든 클래스의 수퍼 클래스, 모든 클래스가 상속받는 공통 메소드 포함  

Wrapper 클래스  
- 자바의 기본 타입을 클래스화한 8 개 클래스를 통칭  
- 객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해 --> Wrapper 객체로 만들어 사용  

박싱  
- 기본 타입의 값을 Wrapper 객체로 변환하는 것  
언박싱  
- Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것, 박싱의 반대  

스트링 리터럴  
- 자바 가상 기계 내부에서 리터럴 테이블에 저장되고 관리됨  
- 응용프로그램에서 공유됨  
new String() 으로 생성된 스트링  
- 스트링 객체는 힙에 생성  
- 스트링은 공유되지 않음  

## 4월12일
<패키지>  
상호 관련 있는 클래스 파일 (컴파일된 .class) 을 저장하여 관리하는 디렉터리  
자바 응용프로그램은 하나 이상의 패키지로 구성  

자바의 접근 지정자 (4가지)  
- private, protected, public, 디폴트  

<static 맴버>  
static 맴버는 클래스당 하나만 생성  
객체들에 의해 공유됨  

< final >  
final 클래스 - 더이상 클래스 상속 불가능  
final 메소드 - 더이상 오버라이딩 불가능  
final 필드 - 상수를 선언 할 떄 사용  

<상속>  
상속 선언  
- extends 키워드로 선언  
- 부모 클래스 -> 슈퍼 클래스  
- 자식 클래스 -> 서브 클래스  

상속의 특징  
- 클래스 다중 상속 불허 (C++은 다중 상속 가능, 자바는 인터페이스의 다중 상속 허용)  
- 모든 자바 클래스는 묵시적으로 Object클래스 상속받음  

슈퍼 클래스의 private 멤버  
- 서브 클래스에서 접근할 수 없음  

슈퍼 클래스의 디폴트 멤버  
- 서브 클래스가 동일한 패키지에 있을 때 , 접근 가능  

슈퍼 클래스의 public 멤버  
- 서브 클래스는 항상 접근 가능  

슈퍼 클래스의 protected 멤버  
- 같은 패키지 내의 모든 클래스 접근 허용  
- 패키지 여부와 상관없이 서브 클래스는 접근 가능  

서브 클래스의 객체가 생성될 때  
- 슈퍼클래스 생성자와 서브 클래스 생성자 모두 실행  
- 슈퍼 클래스 생성자 1 개와 서브 클래스 생성자 1 개가 실행  
- 호출 순서 (서브 클래스의 생성자 먼저 호출,서브 클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출)  
- 실행 순서 (슈퍼 클래스의 생성자가 먼저 실행된 후 서브 클래스의 생성자 실행)  

슈퍼 클래스와 서브 클래스는 각각 여러 개의 생성자 작성 가능  

super()  
- 서브 클래스에서 명시적으로 슈퍼 클래스의 생성자 선택 호출  

업캐스팅 (upcasting)  
- 서브 클래스의 레퍼런스 를 슈퍼 클래스 레퍼런스에 대입  
- 슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가리키게 되는 현상  

다운캐스팅 (downcasting)  
- 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입  
- 업캐스팅된 것을 다시 원래대로 되돌리는 것  
- 반드시 명시적 타입 변환 지정


## 4월5일
배열리턴  
- 배열의 래퍼런스만 리턴(배열 전체가 리턴이 되는것이 아니다)  

<자바의 예외처리>  
예외(exception)  
- 실행 중 오작동이나 결과에 악 영향을 미치는 예상치 못한 상황 발생  
- 실행 중 예외가 발생하면 자바 플랫폼은  응용프로그램이 예외를 처리하도록 호출  
(응용프로그램이 예외 처리를 하지 않으면 프로그램 강제종료 시킴)  
예외 발생하는 경우
- 정수를 0으로 나누는 경우  
- 배열의 크기보다 큰 인덱스로 배열의 원소에 접근하는 경우  
- 정수를 읽는 코드가 실행되고 있을떄 사용자가 문자를 입력한 경우  
예외 처리
- 발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것  
- try catch finally 문 사용  

<자바 객체 지향 특성>  
- 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것
- 상속 : 상위 게체의 속성이 하위 개체에 물려짐 / 하위 게체가 상위 개체의 속성을 모두 가지는 관계  
자바 상속 : 상위 클래스의 멤버를 하위 클래스가 물려받음  
- 다향성 : 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것  

클래스 : 객체의 설계도 혹은 틀 / 객체 : 클래스의 틀로 찍어낸실체  
생성자 : 객체가 생성될 때 초기화 목적으로 실행되는 메소드. 객체가 생성되는 순간에 자동 호출  

생성자의 특징
- 생성자 이름은 클래스 이름과 동일  
- 생성자는 여러 개 작성 가능  
- 생성자는 객체 생성시 한 번만 호출
- 생성자의 목적은 객체 생성 시 초기화  
- 생성자는 리턴 타입을 지정할 수 없음  

<this 레퍼런스>  
this : 객체 자신에 대한 레퍼런스  
this()  
- 같은 클래스의 다른 생성자 호출  
- 생성자 내에서만 사용 가능  
- 생성자 코드의 제일 처음에 있어야 함  

자바의 객체배열 만들기 3단계  
1. 배열 레퍼런스 변수 선언  
2. 레퍼런스 배열 생성
3. 배열의 각 원소객체 생성

<메소드>  
- 메소드는 C/C++ 의 함수와 동일  
- 자바의 모든 메소드는 반드시 클래스 안에 있어야 함 캡슐화 원칙  

오버로딩  
- 한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성  

객체 소멸  
- new 에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위  

가비지  
- 가리키는 레퍼런스가 하나도 없는 객체  


## 3월29일
< 리터럴 >  
프로그램에서 직접 표현한 값  
- 정수 리터럴 : 10진수, 8진수, 16진수, 2진수 리터럴  
- 실수 리터럴 : 소수점 형태나 지수 형태로 표현한 실수  
- 문자 리터럴 : 단일 인용부호(' ')로 문자 표현  
- 논리 타입 리터럴 : 논리값 표시 true or false  
- null 리터럴 : 레퍼런스에 대입 사용
- 문자열 리터럴 : 문자열 리터럴은 String 객체로 자동 처리  

System.in
- 키보드와 연결된 자바의 표준 입력 스트림  

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
<Project 생성하기>  
ctrl + shift + p -> Creat Java Project -> No Bulid tools -> 폴더선택 -> 프로젝트/이름생성(Test)  
새로만든 폴더(Test)에서 파일 복사 후 기존 폴더(java2-2)에 붙여넣기 - src/App.java 실행 테스트  
(오류뜨면 VS code 재실행)  

< 프로그래밍언어 >  
- 기계어 : 0.1의 이진수로 구성된 언어  
- 어셈블러어 : 기계어 명령을 표현하기 쉬운 상징적인 단어로 일대일 대응시킨 언어  
- 고급언어 : 사람이 이해하기 쉽고, 복잡한 작업, 알고리즘, 자료구를 표현하기 위한 언어  

자바 응용프로그램 실행  
- main() 메소드를 가진 클래스의 mamin()에서 실행시작  
JDK(Java Developement Kit)  
- 자바 응용 개발 환경  
JRE(Java Runtime Environment)  
- 자바 실행 환경  
자바 API(Application Programming Interface)
- JDK에 포함된 클래스 라이브러리  

< 자바의 특징 >  
플랫폼 독립성, 객체지향, 캡슐화, 실행코드배포  
패키지, 멀티스레드, 가비지 컬렉션  
프로그램 작성 쉬움  

식별자의 원칙  
- ‘@’, ‘#’, ‘!’와 같은 특수 문자, 공백 또는 탭은 식별자로 사용할 수 없으나 ‘_’, ‘$’는 사용 가능  
- 유니코드 문자, 한글 사용 가능  
- 식별자의 첫 번쨰 문자로 숫자는 사용불가  

< 자바의 데이터 타입 >  
기본 타입 8개 (bloolean / char / byte / short / int / long / float / double)

## 3월15일
내용
