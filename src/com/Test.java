package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="java";
		String str1="test";
		String str2="javatest";
		String str3=str.concat(str1);
		
		if (str2.equals(str3)) {
			System.out.println("i'm here");
		}else {
			System.out.println("i'm here else");
		}
		
		String s = "";
		System.out.println( s.toString() );
		
		try
        {
            System.out.println(1);

            int i = 100 / 0;

            System.out.println(2);
        }
        catch (Exception e) 
        {
            System.out.println("Hi i am incatch block");	
        }finally{
        	System.out.println(3);
        }

		
		List<String> names = new ArrayList<>();
		names.add("naveen");
		names.add("naveen1");
		names.add("naveen2");
		names.add("naveen3");
		
		Optional<String> name = names.stream().filter(a -> a.equals("naveen")).findAny();
		
		if (name.isPresent()) {
			System.out.println("Naveen is available");
		} else {
			System.out.println("Naveen is not available");
		}
		
		HashMap<String,Integer> map =new HashMap<>();
		map.put("s",12);
		map.put("b",14);
		map.put("a",15);
		
		
		
		Map<Object, Object> aa = map.entrySet().stream()
				.sorted(Collections.reverseOrder((o1, o2) -> o1.getValue().compareTo(o2.getValue())))
				.collect(Collectors.toMap(Map.Entry:: getKey,Map.Entry:: getValue, (e1,e2) -> e2,LinkedHashMap:: new));
		
		//Collections.sort(map.values());
		
		System.out.println(aa);
	}

}
