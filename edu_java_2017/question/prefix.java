package edu_java_2017.question;

import java.util.ArrayList;
import java.util.List;

public class prefix 
{
	private List<Integer> cardCode2 = new ArrayList<Integer>();	//2자리
	private List<Integer> cardCode6 = new ArrayList<Integer>();	//6자리
	 
	prefix()	
	{
		/********************************************
		* 생성자 안에서 파일 입력을 받는 메소드 prefixFileLoca() 호출
		*********************************************/
		prefixFileLoad();
	}
	
	private void prefixFileLoad()		//*** 파일 경로 입력 필수
	{
		/************************************************************************
		* 기능 : 2자리,6자리(12,123456)로 구성된 숫자를 가지고 있는 파일을 입력받아 
		* 		   쉼표(,)를 구분자로 나눠 2자리는 cardCode2에, 6자리는 cardCode6에 따로 저장한다.
		*  		   입력받은 파일은 검증이 된 상태라고 가정하고 따로 검증 과정을 넣지 않았다.
		* 
		* 범위 : private
		* 
		* 조건 : 입력할 파일 경로를 입력해줘야한다.
		*         메모리를 줄이기 위해 int형으로 변환하여 저장한다.
		*  
		* 위치 : prefix() 생성자 안에서 실행된다.
		* 
		* 예외처리 1 : 입력받은 파일의 오류가 생겼을 경우
		* 
		*************************************************************************/
		
	}
	
	public String getCardCode(int sixNum)
	{		
		/************************************************************************
		* 기능 : 6자리의 임의의 숫자(int)를 입력받아 그에 대응하는 2자리 카드코드(string)를 반환
		* 
		* 범위 : public 
		* 
		* 전제조건 : 입력받은 파일은 정렬되어 있어야 한다. (이진탐색 API를 사용하기 위한 전제조건) 
		* 
		* int index : 입력받은 6자리 숫자에 해당하는 2자리 카드코드를 찾기 위해 사용  
		* String stringResult : 0 이하의 수릐 0을 생략하는 것을 막기 위해 결과를 String으로 저장/출력 
		* 
		* 예외처리 1 : 입력한 6자리 숫자에 대응하는 카드코드가 없다. (오류 넘버 -100)
		* 예외처리 2 : 파일이 정렬되지 않았거나 검증되지 않았다. 그리고 index의 범위 한정(오류 넘버 -200)
		* 
		***************************************************************************/
		
		return "";
	}
}

/*	public void main(String[] args) 
	{
		new prefix();
		
		System.out.print("6자리를 입력하세요 >> ");
		Scanner testScan = new Scanner(System.in);
		int testInput = testScan.nextInt();
		
		String result = getCardCode(testInput);

		System.out.println(result);
		testScan.close();
	}
}
*/

