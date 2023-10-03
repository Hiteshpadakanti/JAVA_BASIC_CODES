package com.removeWhitespace;
public class Whitespace {
public static void main(String[]args){
	String str1="a ra tek solu tions";
	str1=str1.replaceAll("\\s+","");
	System.out.println("String after removing Whitespaces:" +str1);
}
}
