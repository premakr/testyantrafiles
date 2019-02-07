import java.util.NavigableSet;
import java.util.TreeSet;
class ts10
{
	public static void main(String[] args) 
	{
		TreeSet s1 = new TreeSet();
		s1.add(10);
		s1.add(20);
		s1.add(50);//sorted in ascending order
		s1.add(40);//duplicate will not been added
		s1.add(30);
		System.out.println(s1.size());
		System.out.println(s1);
		System.out.println(s1.ceiling(31));
		System.out.println(s1.floor(29));
		System.out.println(s1.headSet(30));
		System.out.println(s1.higher(30));
		System.out.println(s1.isEmpty());
		System.out.println(s1.remove(10));
		//System.out.println(s1.descendingSet());
		NavigableSet s2 = s1.descendingSet();
        System.out.println(s2);
		System.out.println(s1.pollFirst());
		System.out.println(s1.pollLast());
		System.out.println(s1);
		System.out.println(s1.first());
		System.out.println(s1.last());
	}
}
	