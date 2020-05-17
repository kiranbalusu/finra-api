package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GenerateSequence {
		
	private static final HashMap<Character, String> map = new HashMap<>();
	  static {
	    map.put('2', "ABC");
	    map.put('3', "DEF");
	    map.put('4', "GHI");
	    map.put('5', "JKL");
	    map.put('6', "MNO");
	    map.put('7', "PQRS");
	    map.put('8', "TUV");
	    map.put('9', "WXYZ");
	    map.put('0', "0");
	    map.put('1', "1");
	    map.put(' ', " ");
	  };

	  public static List<String> letterCombinations(String digits) {
	    LinkedList<String> results = new LinkedList<>();
	    LinkedList<String> newResults = new LinkedList();
	    results.add("");
	    newResults.add("");
	    for (int i = 0; i < digits.length(); i++) {
	      String letters = map.get(digits.charAt(i));
	      for (int j = results.size(); j > 0; j--) {
	        String intermediateResult = results.poll();
	        results.add(intermediateResult + digits.charAt(i));
	        for (int k = 0; k < letters.length(); k++) {
	          results.add(intermediateResult + letters.charAt(k));
	        }
	      }
	    }
	    
	    for (int i = 0; i < digits.length(); i++) {
		      String letters = map.get(digits.charAt(i));
		      for (int j = newResults.size(); j > 0; j--) {
		        String intermediateResult = newResults.poll();
		        for (int k = 0; k < letters.length(); k++) {
		          newResults.add(intermediateResult + letters.charAt(k));
		        }
		      }
	    }
	    results.remove(digits);
	    results.removeAll(newResults);
	    System.out.println("Total Count ::: " + results.size());
	    return results;
	  }

	  public static void main(String[] args) {
		//List<String> letterCombinations = letterCombinations("24");
		List<String> letterCombinations = letterCombinations("240 386 6106");
	    
	    System.out.println(letterCombinations);
	  }

}
