package programs.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUnionUsingSet {
	
	public static void main(String[] args) {
		int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6} ;
       
        Set<Integer> mySet1=Arrays.stream(arr1).boxed().collect(Collectors.toSet());

        Set<Integer> mySet2=Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        
        mySet1.addAll(mySet2);
        System.out.println(mySet1);
	}

}
