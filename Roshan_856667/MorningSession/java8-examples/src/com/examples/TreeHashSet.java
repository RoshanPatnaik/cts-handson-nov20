package com.examples;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;

public class TreeHashSet {
	public static void main(String[] args) {
		HashSet<Account> set = new HashSet<Account>();
		LocalTime before = LocalTime.now();
		LocalTime after = null;
		for(int i=1;i<=30000;i++) {
			Account account = new Account(i,"Test "+i);
			set.add(account);
			System.out.println("Item adding to the set : "+i);
			after = LocalTime.now();
		}
		System.out.println("Time Taken : "+Duration.between(before, after).toMillis());
	}
}
