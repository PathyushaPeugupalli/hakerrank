package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
	public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 
	public static void main(String[] args) {
		
		//String[] a = {"tea", "tea", "act"};
		String[] a = {"tea", "tea", "cftsa","kkgh"};
		String[] b = {"ate", "toe", "actfs","kgh"};
		//String[] b = {"ate", "toe", "cftsa"};
		ArrayList arr = new ArrayList<>();
		int count=0;
	for(int i=0;i<a.length;i++) {
		if(sortString(a[i]).equals(sortString(b[i]))) {
			arr.add(0);
		}
		else {
			if(a[i].length() == b[i].length()) {
			//	arr.add(1);
				
				char[] ch = new char[a[i].length()]; 
				 char[] ch2 = new char[b[i].length()]; 
				 for(int k=0;k<ch.length;k++) {
				
					 if(a[i].charAt(k) == b[i].charAt(k))
					 {
					 }
					 else
					 { count++;
				 }
			}
				 arr.add(count);
			}
			else {
				arr.add(-1);
                                   }
		
	}
	System.out.println(arr);
	}
}

	
}
