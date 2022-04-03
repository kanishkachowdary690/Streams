package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("msd","dhoni","binnu","kani",null,"   ");
		List<String> maps=names.stream().filter(Objects::nonNull).filter(vals->!vals.isBlank()).map(values->values.toUpperCase()).collect(Collectors.toList());
		System.out.println(maps);
		List<String> mapp=names.stream().filter(Objects::nonNull).filter(vals->!vals.isBlank()).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(mapp);
		List<String> mappp=names.stream().filter(Objects::nonNull).filter(vals->!vals.isBlank()).map(values->values.toUpperCase()+"s").collect(Collectors.toList());
		System.out.println(mappp);

	}

}
