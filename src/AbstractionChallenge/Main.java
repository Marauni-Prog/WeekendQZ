package AbstractionChallenge;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Triangle t = new Triangle(4, 3, 5);
		System.out.println(t.getArea());
		System.out.println(t);
		
		Triangle t1 = new Triangle(4, 3, 5);
		System.out.println(t.getArea());
		System.out.println(t);
		System.out.println(t.compareTo(t1));

		ArrayList<Integer> list = new ArrayList<>(10);
		populate(list);
		System.out.println(list + "\n\nSORTED");
		sort(list);
		System.out.println(list);
	}

	public static void sort(ArrayList<Integer> list) {
		boolean sorted;
		do {
			sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) < list.get(i - 1)) {
					int temp = list.get(i);
					list.set(i, list.get(i - 1));
					list.set(i - 1, temp);
					sorted = false;
				}
			}
		} while (!sorted);
	}

	public static void populate(ArrayList<Integer> list) {
		for (int i = 0; i < 15; i++) {
			list.add(i, (int) (Math.random() * 100));
		}
	}
}
