/*
 * hangman
 */
package edu_java_2017.question;

import java.util.ArrayList;
import java.util.List;

class Answer
{
	StringBuffer underWord = new StringBuffer();
	StringBuffer fullWord = new StringBuffer();
	StringBuffer Qword = new StringBuffer();
	
}

public class question14 
{
	static Answer A = new Answer();
	
	public static void main(String[] args) 
	{
		List<String> wordList = new ArrayList<>();

		fileInput(wordList);

		writeWord(wordList);
		
		checkWord();
		
	}
	
	static void fileInput(List<String> List)
	{
	}

	static void writeWord(List<String> wordsList)
	{
	}

	static void checkWord()
	{
	}
}
