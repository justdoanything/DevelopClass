/*
 * 단어 뜻 맞추기
 */
package edu_java_2017.question;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Word
{
	HashMap<String, String> hashWord = new HashMap<>(); 
	
	String ENG;
	String KOR;
	
	Word(String Eng, String Kor)
	{
		this.ENG = Eng;
		this.KOR = Kor;
		hashWord.put(Eng, Kor);
	}
}


public class question11 
{
	static Vector<Word> word =new Vector<Word>();
	static Random ran = new Random();
	static Scanner scan  = new Scanner(System.in);
	
	static int Qrand;
	static int Aran1;
	static int Aran2;
	static int Aran3;
	
	public static void main(String[] args) 
	{
		word.add(new Word("eyes","눈"));
		word.add(new Word("nose","코"));
		word.add(new Word("mouse","입"));
		word.add(new Word("legs","다리"));
		word.add(new Word("hands","손"));
		word.add(new Word("heap","엉덩이"));
		word.add(new Word("ears","귀"));
		word.add(new Word("head","머리"));
		
		System.out.println("사전의 등록된 단어 수 : "+word.size());
		
		System.out.println(word.get(Qrand).ENG + "??");
		System.out.print("1."+word.get(Aran1).KOR + "   ");
		System.out.print("2."+word.get(Aran2).KOR + "   ");
		System.out.print("3."+word.get(Aran3).KOR + "   ");
		System.out.println("4. 답이없다.");
		
		System.out.print("정답은 ?? ");
		int result = scan.nextInt();
		
	}

	static void ranNum()
	{
	}
}
