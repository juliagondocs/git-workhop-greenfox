package com.company;

public class Main {
	String valtozo;

    public static void main(String[] args) {
	// write your code here
        cheer();

        String group = "Whitelabel Error";
	String input2 = "secondparam";	

        cheer(group, input2);
    }

    public static void cheer (String one, String two) {
        System.out.println(one);
	System.out.println(two);
    }
}
