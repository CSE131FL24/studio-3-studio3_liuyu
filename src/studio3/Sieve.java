package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter the maximum number n: ");
        int n = in.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        
        // first loop, make all numbers prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        // second loop: rule out 
        for (int i = 2; i<=n; i++ ) {
        	if (isPrime[i]) {
        		for(int j = i * i; j<=n; j= j+i){
                    isPrime[j] = false;
                }
        
        }
	}
        
        // print out result: the third loop
        System.out.println("Prime numbers from 2 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }

	}
}
