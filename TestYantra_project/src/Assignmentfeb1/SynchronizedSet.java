package Assignmentfeb1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Set<String> sset = Collections.synchronizedSet(set);
		System.out.println("Synchronized set created..");

	}

}
