import java.util.ArrayList;

public class AL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ls = new ArrayList();
ls.add(10);
ls.add(5);
ls.add(30);
ls.add(40);
System.out.println(ls);
ArrayList ls1 = new ArrayList();
ls1.add(30);
ls1.add(20);
ls1.add(15);
ls1.add(40);
System.out.println(ls1);
System.out.println(ls.retainAll(ls1));
System.out.println(ls);

	}

}
