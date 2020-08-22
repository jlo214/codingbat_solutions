/*
Functional-2
Basic lambda practice

8-22-2020
#1-9
*/
import java.util.*;
import java.util.stream.Collectors;

public class Functional2 {

    public static void main(String []args){
		System.out.println("");
		//1
		List<Integer> noNegList = new ArrayList<>(Arrays.asList(-3,-3,3,3));
    	List<Integer> noNegRes = noNeg(noNegList);
    	System.out.print("1) Given a list of integers, return a list of the integers, omitting any that are less than 0.\nInput: ");
    	noNegList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	noNegRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//2
		List<Integer> no9List = new ArrayList<>(Arrays.asList(9,19,29,3));
    	List<Integer> no9Res = no9(no9List);
    	System.out.print("2) Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)\nInput: ");
    	no9List.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	no9Res.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//3
		List<Integer> noTeenList = new ArrayList<>(Arrays.asList(12,13,19,20));
    	List<Integer> noTeenRes = noTeen(noTeenList);
    	System.out.print("3) Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.\nInput: ");
    	noTeenList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	noTeenRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//4
		List<String> noZList = new ArrayList<>(Arrays.asList("hziz","hzello","hi"));
    	List<String> noZRes = noZ(noZList);
    	System.out.print("4) Given a list of strings, return a list of the strings, omitting any string that contains a z. (Note: the str.contains(x) method returns a boolean)\nInput: ");
    	noZList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	noZRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");  

    	//5
		List<String> noLongList = new ArrayList<>(Arrays.asList("this", "not", "too", "long"));
    	List<String> noLongRes = noLong(noLongList);
    	System.out.print("5) Given a list of strings, return a list of the strings, omitting any string length 4 or more.\nInput: ");
    	noLongList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	noLongRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");  

    	//6
		List<String> no34List = new ArrayList<>(Arrays.asList("ccc", "dddd", "apple"));
    	List<String> no34Res = no34(no34List);
    	System.out.print("6) Given a list of strings, return a list of the strings, omitting any string length 3 or 4.\nInput: ");
    	no34List.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	no34Res.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n"); 

    	//7
		List<String> noYYList = new ArrayList<>(Arrays.asList("xx", "ya", "zz"));
    	List<String> noYYRes = noYY(noYYList);
    	System.out.print("7) Given a list of strings, return a list where each string has y added at its end, omitting any resulting strings that contain yy as a substring anywhere.\nInput: ");
    	noYYList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	noYYRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n"); 

    	//8
		List<Integer> two2List = new ArrayList<>(Arrays.asList(2, 6, 11));
    	List<Integer> two2Res = two2(two2List);
    	System.out.print("8) Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.\nInput: ");
    	two2List.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	two2Res.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");  

    	//9
		List<Integer> square56List = new ArrayList<>(Arrays.asList(3, 1, 4));
    	List<Integer> square56Res = square56(square56List);
    	System.out.print("9) Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.\nInput: ");
    	square56List.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	square56Res.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n"); 

	}

	//1
	public static List<Integer> noNeg(List<Integer> nums) {
	  return nums.stream()
	            .filter((n) -> n >= 0 )
	            .collect(Collectors.toList());
	}

	//2
	public static List<Integer> no9(List<Integer> nums) {
	  return nums.stream()
	              .filter((e) -> e%10 != 9)
	              .collect(Collectors.toList());
	}

	//3
	public static List<Integer> noTeen(List<Integer> nums) {
	  return nums.stream()
	              .filter((n) -> n < 13 || n > 19)
	              .collect(Collectors.toList());
	}

	//4
	public static List<String> noZ(List<String> strings) {
	  return strings.stream()
	                .filter( (s) -> !s.contains("z"))
	                .collect(Collectors.toList());
	}

	//5
	public static List<String> noLong(List<String> strings) {
	  return strings.stream()
	                .filter((s) -> s.length() < 4)
	                .collect(Collectors.toList());
	}

	//6
	public static List<String> no34(List<String> strings) {
	  return strings.stream()
	                .filter((s) -> s.length() != 3 && s.length() != 4)
	                .collect(Collectors.toList());
	}

	//7
	public static List<String> noYY(List<String> strings) {
	  return strings.stream()
	          .map((s) -> s+"y")
	          .filter( (s) -> !s.contains("yy"))
	          .collect(Collectors.toList());
	}

	//8
	public static List<Integer> two2(List<Integer> nums) {
	  return nums.stream()
	              .map((n) -> n*2)
	              .filter((n) -> n%10 != 2)
	              .collect(Collectors.toList());
	}

	//9
	public static List<Integer> square56(List<Integer> nums) {
	  return nums.stream()
	              .map((n) -> (n*n)+10)
	              .filter((n) -> n%10 != 5 && n%10 != 6)
	              .collect(Collectors.toList());
	}

}