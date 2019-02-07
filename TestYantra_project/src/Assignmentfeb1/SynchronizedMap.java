package Assignmentfeb1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map<String, String> smap =Collections.synchronizedMap(map);
		System.out.println("Synchronized map created..");

	}

}
