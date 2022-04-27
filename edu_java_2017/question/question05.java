/*

일정한 포맷의 입력을 받아서 '평균 연령', '성별 비율', '지역 비율' 등을 출력하는 프로그램

########## Sample Run

- 입력값
AAA/111/용우/남자/21/서울
BBB/222/준일/여자/22/경기
CCC/333/동균/남자/23/서울
DDD/444/우주/여자/24/서울
EEE/555/동혁/남자/25/서울
FFF/666/도연/여자/26/경기
GGG/777/요한/남자/27/서울
 
- 출력값
가입자 연령 평균은 24.0세 입니다.

남자 비율 : 57%
여자 비율 : 43%

경기지역의 비율 : 28%
서울지역의 비율 : 71%

가장 많이 사는 동네(서울)에 사는 여자 중 가장 나이 많은 사람의 정보 : DDD  우주  여자  서울

서울 사는 남자 중 가장 어린 사람의 정보 : AAA  용우  남자  서울
*/
package edu_java_2017.question;

import java.util.Scanner;

class person
{

}

public class question05 
{
	static Scanner scan = new Scanner(System.in);
	
	//사람 정보 등록
	static void insertPeople(person saram, int cnt)
	{

	}
	
	//평균 나이 계산 및 출력
	static void age_Avg(person obj[], int saramNum)
	{

	}
		
	//가입자 남,여 비율
	static void sex_per(person obj[], int saramNum)
	{

	}
	
	//가입자 지역 분포 비율 && 가장 많이 사는 지역의 가장 나이 많은 여자의 신상정보
	static void location_per(person obj[], int saramNum)
	{

	}
		
	//서울 거주자 중 가장 어린 남자의 신상정보
	static void seoul_man(person obj[], int saramNum)
	{

	}
	
	
	public static void main(String[] args) 
	{
		person saram[] = new person[500];
		int personCnt = 0;
		
		//입력 받기
		System.out.println("사람의 ID, 비밀번호, 이름, 성별, 나이, 주소 순서로 입력하세요 : (구문자는 / 입니다.)");
		
		//평균 나이
		age_Avg(saram, personCnt);
		System.out.println();
		
		//가입자 남,여 비율
		sex_per(saram, personCnt);
		System.out.println();
		
		//가입자 지역 분포 비율 && 가입자가 가장 많은 지역 거주자 중 가장 나이 많은 여자의 신상 명세
		location_per(saram, personCnt);
		System.out.println();
		
		//서울 거주자 중 가장 어린 남자의 신상 명세
		seoul_man(saram, personCnt);
	}
}