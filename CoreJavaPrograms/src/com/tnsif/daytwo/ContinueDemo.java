package com.tnsif.daytwo;

public class ContinueDemo {

	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            if (i == 5) {
                continue;
            }
            
            System.out.println("Number: " + i);
        }
	}

}
