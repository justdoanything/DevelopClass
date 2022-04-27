/*
 * 알파벳 히스토그램
 * 
 * 
 * 
 * ==================Sample RUn
 * 영어 문장을 입력하세요
영어 문장을 입력하세요
apple
a - 
b
c
d
e - 
f
g
h
i
j
k
l - 
m
n
o
p -  - 
q
r
s
t
u
v
w
x
y
 */
package edu_java_2017.solution;

import java.util.Scanner;

public class solution02 
{
	static Scanner scan = new Scanner(System.in);
	
	static String[] Alpha = new String[26];
	
	static void initAlpha()
	{
		char cr = 'a';
		for(int i=0; i<26; i++)
		{
			Alpha[i] = String.valueOf(cr);
			cr++;
		}
	}
	
	public static void main(String[] args) 
	{
		initAlpha();
		
		System.out.println("영어 문장을 입력하세요");
		
		String inputStr = scan.nextLine();
		String littleStr = inputStr.toLowerCase();
		
		for(int i=0; i<littleStr.length(); i++)
		{	
			if(littleStr.charAt(i)==';' && (littleStr.length()-1) == i)
				break;
			
			for(int j=0; j<26; j++)
				if(littleStr.charAt(i) == Alpha[j].charAt(0))
					Alpha[j] = Alpha[j].concat(" - ");
		}
		
		for(int i=0; i<25; i++)
			System.out.println(Alpha[i]);
	}
}

