package AssLocaldates;

import java.time.LocalDate;

public class AddAndSub {

	public static void main(String[] args) {
		LocalDate plus = LocalDate.now().plusDays(20);
        System.out.println(plus);
        System.out.println(LocalDate.now().minusDays(20));
       System.out.println(LocalDate.now().plusMonths(1));
        System.out.println(LocalDate.now().plusYears(1));
        System.out.println(LocalDate.now().minusYears(1));
        System.out.println(LocalDate.now().minusMonths(1));
        System.out.println(LocalDate.now().minusDays(20));

	}

}
