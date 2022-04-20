/*
 * 도형 삽입/종류별 삭제
 
============ Sample Run
[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 1
  [ 삽입할 도형 종류 : Line(1), Rect(2), Circle(3), 이전메뉴(0) ] >> 1
    [ SUCCESS : ㅡ 이 삽입되었습니다. ]


[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 1
  [ 삽입할 도형 종류 : Line(1), Rect(2), Circle(3), 이전메뉴(0) ] >> 2
    [ SUCCESS : ■ 이 삽입되었습니다. ]


[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 1
  [ 삽입할 도형 종류 : Line(1), Rect(2), Circle(3), 이전메뉴(0) ] >> 3
    [ SUCCESS : ● 이 삽입되었습니다. ]


[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 1
  [ 삽입할 도형 종류 : Line(1), Rect(2), Circle(3), 이전메뉴(0) ] >> 2
    [ SUCCESS : ■ 이 삽입되었습니다. ]


[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 1
  [ 삽입할 도형 종류 : Line(1), Rect(2), Circle(3), 이전메뉴(0) ] >> 2
    [ SUCCESS : ■ 이 삽입되었습니다. ]


[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 2
  [ Figure List :  ㅡ  ■  ●  ■  ■ ]

[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 2
  [ Figure List :  ㅡ  ■  ●  ■  ■ ]

[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 3
  [ 삭제할 도형 종류 : Line(1), Rect(2), Circle(3), 이전메뉴(0)] >> 3
    [ LIFO삭제 (1), FIFO삭제(2), 전체삭제(3), 이전메뉴(0) ] >> 1
      [ SUCCESS : 가장 마지막에 넣은 ● 도형을 삭제했습니다. ]


[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 2
  [ Figure List :  ㅡ  ■  ■  ■ ]

[ 삽입(1), 조회(2), 삭제(3), 종료(4) ] >> 4
  [ 프로그램이 종료됩니다. ]
 */
package edu_java_2017.question;

import java.util.Scanner;

interface printFigure
{
	void print_Figure();
}

class saveFigure implements printFigure
{
	String figureName;
	
	saveFigure()
	{
		figureName = "";
	}
	
	saveFigure(String name)
	{
		this.figureName = name; 
	}

	@Override
	public void print_Figure() 
	{
		System.out.print(" " + this.figureName + " ");
	}
}


public class hw06 
{
	static Scanner scan = new Scanner(System.in);
	
	static saveFigure[] save_figure = new saveFigure[100];
	
	static String[] figureSet = {"ㅡ", "■","●"};
	static int figureCnt = 0;
	
	public static void main(String[] args) 
	{
		
	}
		
//***************************************************** 삽입
	static void insert()
	{
		
	}
	
	
//***************************************************** 삭제 메뉴( 삭제 도형 및 삭제 유형 선택)
	static void deleteMenu()
	{
		
	}


//*****************************************************  삭제 도형 번호, 삭제 유형을 전달받고 해당하는 삭제 실행
	static void deleteFigureLIFO(int figSelect)
	{
		
	}

	static void deleteFigureFIFOALL(int figSelect, int delSelect)
	{

	}
	

//*****************************************************  조회
	static void search()
	{
		System.out.print("  [ Figure List : ");
		for(int i=0; i<figureCnt; i++)
			save_figure[i].print_Figure();
		System.out.print("]\n");
	}
}
