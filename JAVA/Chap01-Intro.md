# 사전준비

###### 1. Visual Code 설치

- https://code.visualstudio.com/download
- 운영체제에 맞는 프로그램으로 설치

###### 2. OpenJDK 설치

- https://github.com/ojdkbuild/ojdkbuild
- 운영체제에 맞는 프로그램으로 설치
- Windows : java-11-openjdk-11.0.14.9-1.windows.ojdkbuild.x86_64.msi

###### 3. VS Code에 Java Extension 설치

- 왼쪽 메뉴에 `Extensions` 메뉴 혹은 `Ctrl+Shift+X`
- `java` 검색 후 `Extension Pack for Java` 설치

###### 4. 프로젝트 생성

- 원하는 경로에 빈 폴더를 생성
- `File → Open Folder`로 빈 폴더 열기
- `New File` 하고 파일 이름을 `main.java` 으로 생성
- 아래 Code 붙여넣기
  ```java
  import java.util.Scanner;
  public class main {
    public static void main(String[] args){
      System.out.println("문자를 입력하세요 : ");
  		Scanner scan = new Scanner(System.in);
  		String test = scan.nextLine();
  		System.out.println(test);
  	}
  }
  ```

###### 5. VS Code에서 추가로 확인해야할 설정

- `ctrl + ,` → `Terminal` 검색 → Java Debug → Cosole : integratedTerminal 확인
- 유용한 Extensions
  - Prettier : 코드 정렬을 자동으로 해준다.
    - `ctrl + ,` → `default formatter` 검색 → Prettier로 설정
    - `ctrl + ,` → `format on save` 검색 → 체크

###### 부록. Github (https://github.com/)

- 회원가입 및 Repository 생성
- Git 명령어
  - Git 초기 설정
    - `git config --global user.email={github email}`
    - `git config --global user.name={github name}`
  - Git Repository를 Local로 내려받기
    - `git clone {repository url}` : Git에 있는 Code를 Local에 내려 받기
    - `git fetch` : Git Repository를 최신화
    - `git pull` : 현재 선택 된 Branch의 Git Repository의 Code를 Local로 내려 받기
  - Local에 있는 Code를 Git Repository로 올리기
    - `git add . 또는 git add {file}`
    - `git commit -m {comment}`
    - `git push`
