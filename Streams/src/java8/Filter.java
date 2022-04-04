package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> values=Arrays.asList(1,2,3,4,5,6,7);
        Iterator<Integer> i=values.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
        
        List<String> names=Arrays.asList("msd","dhoni","kani","binnu",null," " );
        List<String> noNull=names.stream().filter(value->value!=null).collect(Collectors.toList());
        System.out.println(noNull);
        List<String> NoNull=names.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(NoNull);
        List<String> noBlank=names.stream().filter(Objects::nonNull).filter(val->!val.isBlank()).collect(Collectors.toList());
        System.out.println(noBlank);
        System.out.println(noBlank);
	}

}
