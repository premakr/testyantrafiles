package Assignmentfeb1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetMaxElementInList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hashcode");
		list.add("equals");
		list.add("tostring");
		list.add("wait");
		list.add("notify");
		list.add("clone");
		System.out.println("maximum element in the given list: "+Collections.max(list));
	}
}
