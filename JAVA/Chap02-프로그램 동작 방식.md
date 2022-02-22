# Chapter 1. 코드를 실행시켰을 때 돌아가는 방식
Visual Code에서 프로그램 실행 명령어(Ctrl + F5)를 통해서 프로그램을 `실행`시켰다.\
프로그램이 `실행`되면 뒤에선 어떤 일련의 작업들이 있는지 간단하게 설명하려고 한다.

컴퓨터는 우리가 영문으로 적은 명령어 `System.out.println("Hello! World!");` 를 이해`(독해)`하지 못한다. 컴퓨터가 실제로 이해할 수 있는 명령어는 [0,1] 뿐이기 때문이다. 그렇다면 우리가 프로그램을 실행시켰을 때 무언가가 `영문으로 된 명령어를 [0,1]로 바꿔준다는 것`이다. 

즉, Compiler가 `고급언어(≓자연어)를 기계어로 바꿔`주고 `컴퓨터가 기계어를 실행`하는 것이다. 

우리가 프로그램을 실행시키면 Visual Code에 내장되어 있는 Compiler가 영어로 된 명령어를 컴퓨터가 이해할 수 있는 문자로 변환시켜주고 변환된 코드를 컴퓨터가 실행시키는 것이다.

# Capter 2. 프로그램이 동작하는 방식에 대한 설명
![image](https://user-images.githubusercontent.com/21374902/155046549-9457fb58-b2d9-4c52-9fa4-d2a2a596f6b0.png)
- ### 컴퓨터 구매
  - 먼저 우리가 컴퓨터만 구매하고 전원을 키면 아무것도 실행되지 않는다.
  - Hardware만 갖고 있는 상태이고 아무것도 하지 않은채 전원을 키면 아무것도 실행되지 않는다.
  - 컴퓨터는 CPU, 메인보드, RAM, 그래픽카드, 저장장치 등으로 구성되어 있다.
- ### O/S 설치
  - 따라서 우린 기본적으로 O/S를 설치해줘야 한다. 대표적인 O/S로는 Windows, macOS, Linux 등이 있다.
  - .exe 파일 같은 경우엔 Windows에 종속되는 실행파일이고 각 운영체제마다 사용할 수 있는 파일, 명령어 등이 다르다.

- ### Java 설치
  - 우린 Intro에서 `JDK`를 설치했었다. JDK는 `Java Development Kit`의 약어인데 Java Code를 구동할 수 있는 환경을 구성해주는 파일이다. JDK를 설치하면 `JVM이 설치`된다고 보면 된다.
  - 위에서 .exe 파일은 Windows에 `종속적`이라고 했었다. 즉, Windows O/S가 .exe 파일을 실행한다고 볼 수 있다.
  - 하지만 Java는 `JVM 위에서 실행`된다. 따라서 O/S가 Windows건 macOS건 Linux건 `상관없이 JVM만 설치되어 있다면` 우린 동일한 코드(프로그램)을 실행할 수 있다는게 Java의 장점 중 하나이다.
  - 대표적으로 C언어로 짠 Code는 `.exe` 파일이 되고 Java는 `.class` 파일이 된다.

- ### Visual Code 설치
  - Java Code를 실행시킬 수 있는 환경은 모두 마련이 됐다. 하지만 우리는 기계어로 Coding을 할 수 없기 때문에 일반적으로 `IDE`(Integration Development Environment : 통합 개발 환경)이 필요하고 Visual Code는 대중적으로 쓰는 IDE 이다.

- ### Source Code 작성
  - 우린 고급언어로 Visual Code에 Coding을 하고 프로그램을 실행시키면 Visual Code의 Compiler가 `.java` 파일을 `.class` 파일로 변경해주고 `.class 파일은 JVM 위에서 실행`된다.
  - 우리가 짠 Code(고급언어)는 

- ### 부록 : Compiler와 Interpreter
  Complier | Interpreter
  ---|:---
  전체 소스코드를 보고 명령어를 수집하고 재구성 | 소스코드의 각 행을 연속적으로 분석하며 실행
  고레벨 언어를 바로 기계어로 변환 | 고레벨 언어를 바로 기계어로 번역하지 않고 중간 형태로 변환시킨 후 실행
  Compiler는 고급 언어로 작성된 프로그램을 목적 프로그램으로 번역 후 Linking 작업을 통해 실행 프로그램을 생성 | 고급 언어로 작성된 프로그램`을 한줄씩 번역해서 OS에서 인식하는 기계어로 변역`하는 역할
  실행속도가 빠르다. | 번역속도는 빠르지만 실행속도는 느리다.
  코드를 수정하고 실행하려면 Compile을 다시 해야한다. | 코드를 수정하고 바로 실행할 수 있다.
  프로그램의 코드가 유출되지 않는다. | 프로그램의 코드가 유출될 수 있다.
  프로그램 실행 파일 전체를 전달해야해서 용량이 크다. | 프로그램의 코드만 전송하면 되서 용량이 적다.
  C, C++처럼 Low Level Language | Python, Ruby처럼 High Level Language
  - Java
    - Java는 `javac`로 `Java 프로그램`을 중간 형태인 `중간언어(.class, 바이트 코드)`로 compile 하고 이를 Java Interpreter가 한 줄 씩 해석하면서 `기계어로 번역`을 한다.
    - Java는 `Compile Language` 이면서 `Interpreter Language` 이다.
    - Compiler는 JVM을 위한 기계어를 만든다.
    - Interpreter는 Compiler에 의해 변환된 .class 파일 내의 바이트 코드를 특정 환경의 기계에서 실행될 수 있도록 변환한다.
    ![image](https://user-images.githubusercontent.com/21374902/155063883-24f7df0b-5b70-4a7d-ae98-12dbe0a33d29.png)