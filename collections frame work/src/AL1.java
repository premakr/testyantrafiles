import java.util.ArrayList;
public class AL1 {
	

	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add("shreyu");
		ls.add('a');
		ls.add(10);
		ls.add(23.65);
		ls.add(true);
		System.out.println(ls);
		ArrayList ls1 = new ArrayList();
		ls1.add("prema");
		ls1.add(30);
		ls1.add(false);
		ls.add(ls1);
		System.out.println(ls);
		ls.addAll(ls1);
		System.out.println(ls);
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		ArrayList <Emp> ls2=new ArrayList<>();
		ls2.add(new Emp());
		
		System.out.println(ls2);
		System.out.println(ls2.get(0));
		ls.add(2, "james");
		System.out.println(ls);
		ls.remove(1);
		System.out.println(ls);
		ls.remove("james");
		System.out.println(ls);
		ls.removeAll(ls1);
		System.out.println(ls);
		ls.remove(4);
		System.out.println(ls);
		
	}

}
