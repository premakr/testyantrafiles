package Assignmentfeb1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SychronizedList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> slist = Collections.synchronizedList(list);
		System.out.println("Sychronized list created..");
	}
}
