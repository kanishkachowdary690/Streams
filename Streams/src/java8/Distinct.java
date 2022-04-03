package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 1, 5, 1, 6, 2, 8, 7, 9, 1, 3, 5 };
		// converting integer array to list using streams
		List<Integer> vals = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println("int array to list"+vals);
		List<Integer> diss = vals.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(diss);

		
		
		
		int[] b = { 1, 2, 5, 2, 6, 8, 2, 5, 2, 3, 6, 2, 6 };
		// converting integer array to list using enhanced for loop
		List<Integer> dummy = new ArrayList<>(b.length);
		for (int i : b) {
			dummy.add(i);
		}
		List<Integer> dums = dummy.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("dums" + dums);

		
		
		
		List<Integer> values = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 9, 2, 8);
		List<Integer> dis = values.stream().distinct().collect(Collectors.toList());
		System.out.println(dis);
		List<Integer> disss = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(disss);

		
		
		
		String ba = "sssaadfhshjhashaaadsfkdfjhjhewfjcd";
		System.out.println(Arrays.asList(ba.split("")).stream().distinct().sorted().collect(Collectors.joining()));
		System.out.println(Arrays.asList(ba.split("")).stream().distinct().sorted(Comparator.reverseOrder())
				.collect(Collectors.joining()));
		
		
		
		
		String[] bu={"abhimanyu","msoni","msssdnu","msoni"};
		//converting String array to list
		List<String> bi=Arrays.asList(bu);
		System.out.println(Arrays.asList(bu).stream().distinct().sorted().collect(Collectors.joining()));
		System.out.println(bi);
		List<String> bk=bi.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("bk"+bk);

	}

}
