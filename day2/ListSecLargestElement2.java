package week3.day2;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

public class ListSecLargestElement2 {
	public static int SecLarge(integer[] numbers,int length) {
		// TODO Auto-generated method stub
List list=Arrays.asList(numbers);

//int length=numbers.length;
Collections.sort((java.util.List<T>) list);
int element=list.get(length-2);
return element;
	}
public static void main(String args[]) {
	Integer numbers[]= {3,2,11,4,6,7};


	
System.out.println("second largest number is" + SecLarge(numbers,6));
	}
}



