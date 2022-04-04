package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("msd","dhoni","kani","binnu",null,"  ");
		//Anymatch
		boolean anyMatch=names.stream().anyMatch(values->values==null);
		System.out.println(anyMatch);
		boolean anyMatches=names.stream().anyMatch(Objects::isNull);
		System.out.println(anyMatches);
		System.out.println(names.stream().anyMatch(Objects::isNull));
		
		//AllMatch
		boolean allMatch=names.stream().allMatch(vals->vals==null);
		System.out.println(allMatch);
		boolean allMatches=names.stream().allMatch(Objects::isNull);
		System.out.println(allMatches);
		
		//NoneMatch
		List<String> name=Arrays.asList("msd","dhoni","kani","binnu");
		boolean noneMatch=name.stream().noneMatch(Objects::isNull);
		boolean noneMatches=name.stream().noneMatch(Objects::nonNull);
		System.out.println(noneMatch);
		System.out.println(noneMatches);
		
		//imp
		List<String> langs=Arrays.asList("telugu","hindi","english","marati","tamil","kannada");
		boolean hello=langs.stream().anyMatch(values->values.equalsIgnoreCase("telugu")&& values.equals("Hindi"));
		System.out.println(hello);
		List<String> hellos=langs.stream().filter(values->values.equalsIgnoreCase("hindi")||values.equalsIgnoreCase("telugu")).collect(Collectors.toList());
		System.out.println(hellos);

	}

}
