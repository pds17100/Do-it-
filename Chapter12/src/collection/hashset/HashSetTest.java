package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		
		System.out.println(b1);
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		
		boolean b = set.add("aaa");//중복을허용하지않는다.
		System.out.println(b);
		System.out.println(set);
		
	}

}
