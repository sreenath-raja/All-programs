package org.all;

import org.english.Tamil;

public class Language extends Tamil{

	public void allLanguage() {
		System.out.println("All Languages");
	}
	public static void main(String[] args) {
		Language S = new Language();
		S.allLanguage();
		S.tamilLanguage();
		S.englishLanguage();
		S.teluguLanguage();
	}
}
