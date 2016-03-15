package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String s = System.getProperty("java.version");
        s = s.substring(0,3);
        return Double.parseDouble(s);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
      System.out.println(getVersion());
    }
}
