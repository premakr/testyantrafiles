import java.util.ArrayList;
import java.util.Collections;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Emp>ls = new ArrayList<Emp>();
	    ls.add(new Emp("smith"));
	    ls.add(new Emp("Amith"));
	    ls.add(new Emp("Amith"));
	    Collections.sort(ls);
        for (Emp e:ls) {
        System.out.println(e.name);
        }
	}

}
