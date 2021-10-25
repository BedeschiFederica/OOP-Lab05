package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	final Set<String> set = new TreeSet<>();
    	for (int i = 1; i <= 20; i++) {
    		set.add("" + i);
    	}
    	System.out.println(set);
    	for (int i = 1; i <= 20; i++) {
    		if (i % 3 == 0) {
    			set.remove("" + i);
    		}
    	}
    	for (String s: set) {
    		System.out.print(s + " ");
    	}
    	System.out.println("");
    	boolean allEven = true;
    	for (String s: set) {
    		if (Integer.parseInt(s) % 2 != 0) {
    			allEven = false;
    		}
    	}
    	System.out.println("even: " + allEven);
    	
    	Iterator i = set.iterator();
    	while (i.hasNext()) {
    		if (i.next().equals("5")) {
    			i.remove();
    		}
    	}
    	System.out.println(set);
    }
}
