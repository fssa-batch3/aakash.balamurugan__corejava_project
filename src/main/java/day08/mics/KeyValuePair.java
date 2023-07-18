package day08.mics;
import java.util.*;

public class KeyValuePair {

	public static void main(String[] args) {
		String[] a = {"a"};
		Map <String , Integer> countmap = new HashMap <String , Integer> ();
		for(int i=0;i<a.length;i++) {
			if(countmap.containsKey(a[i])) {
				countmap.put(a[i],1);
			}else {
				int count = countmap.get(a[i]);
				count++;
				countmap.put(a[i],count);
			}
		}
		System.out.println(countmap);
		System.out.println(countmap.containsKey(countmap));
	}

}
