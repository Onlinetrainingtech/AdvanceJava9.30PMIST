package com.xyz;

public class TextEditor {
	
	  private String name;
	  
	  
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	private SpellChecker spellChecker;
	   
	  
	   public void spellCheck()
	   {
		   spellChecker.checkSpelling();
	   }
}
