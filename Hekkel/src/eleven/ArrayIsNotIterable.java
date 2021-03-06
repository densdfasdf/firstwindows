package eleven;

import java.util.Arrays;
/*
 * 
 *  ������ �������� � foreach, �� �� �������� Iterable
 *	��� ���������� ���� ������������� � Iterable
 * 
 * */
public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib) {
		for (T t : ib)
			System.out.print(t + " ");
	}

	public static void main(String[] args) {
		test(Arrays.asList(1, 2, 3));
		String[] strings = { "A", "B", "C" };
		// ������ �������� � foreach, �� �� �������� Iterable
		// ��� ���������� ���� ������������� � Iterable
		test(Arrays.asList(strings));
	}
}
