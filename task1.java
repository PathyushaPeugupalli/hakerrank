package practise;

import java.util.*;

public class task1 {
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
		// TODO Auto-generated method stub
        String[] arr = {"code","doce","ecod","framer","frame"};
		
		System.out.println("Before: "+Arrays.toString(arr));
		
		List<String> myList = new ArrayList<String>(Arrays.asList(arr));
		for(int i=0;i<arr.length;i++) {
		if(i==(arr.length-1))
			break;
			if(sortString(arr[i]).equals(sortString(arr[i+1]))) {
			myList.remove(arr[i+1]);
		}
	
	}
		System.out.println("After: "+myList);
	}

}
