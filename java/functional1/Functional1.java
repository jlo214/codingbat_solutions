/*
Functional-1
Very basic lambda practice

8-21-2020
#1-9
*/
import java.util.*;
import java.util.stream.Collectors;

public class Functional1 {

    public static void main(String []args){
		System.out.println("");
    	
    	//1
    	List<Integer> doublingList = new ArrayList<>(Arrays.asList(1,2,3));
    	List<Integer> doublingRes = doubling(doublingList);
    	System.out.print("1) Given a list of integers, return a list where each integer is multiplied by 2.\nInput: ");
    	doublingList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	doublingRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//2
    	List<Integer> squareList = new ArrayList<>(Arrays.asList(6,8,-6,-8,1));
    	List<Integer> squareRes = square(squareList);
    	System.out.print("2) Given a list of integers, return a list where each integer is multiplied with itself.\nInput: ");
    	squareList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	squareRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//3
    	List<String> addStarList = new ArrayList<>(Arrays.asList("a","bb","ccc"));
    	List<String> addStarRes = addStar(addStarList);
    	System.out.print("3) Given a list of strings, return a list where each string has * added at its end.\nInput: ");
    	addStarList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	addStarRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//4
    	List<String> copies3List = new ArrayList<>(Arrays.asList("a","bb","ccc"));
    	List<String> copies3Res = copies3(copies3List);
    	System.out.print("4) Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.\nInput: ");
    	copies3List.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	copies3Res.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//5
    	List<String> moreYList = new ArrayList<>(Arrays.asList("hello","there","world"));
    	List<String> moreYRes = copies3(moreYList);
    	System.out.print("5) Given a list of strings, return a list where each string has y added at its start and end.\nInput: ");
    	moreYList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	moreYRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//6
    	List<Integer> math1List = new ArrayList<>(Arrays.asList(1,2,3));
    	List<Integer> math1Res = math1(math1List);
    	System.out.print("6) Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.\nInput: ");
    	math1List.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	math1Res.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//7
    	List<Integer> rightDigitList = new ArrayList<>(Arrays.asList(1,22,93));
    	List<Integer> rightDigitRes = rightDigit(rightDigitList);
    	System.out.print("7) Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)\nInput: ");
    	rightDigitList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	rightDigitRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//8
    	List<String> lowerList = new ArrayList<>(Arrays.asList("Hello","Hi"));
    	List<String> lowerRes = copies3(lowerList);
    	System.out.print("8) Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).\nInput: ");
    	lowerList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	lowerRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");

    	//9
    	List<String> noXList = new ArrayList<>(Arrays.asList("xxax","xbxbx","xxcx"));
    	List<String> noXRes = noX(noXList);
    	System.out.print("9) Given a list of strings, return a list where each string has all its x's removed.\nInput: ");
    	noXList.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.print("\nRes: ");
    	noXRes.stream().forEach((i) -> System.out.print(i+" "));
    	System.out.println("\n");
    }

    //1
	public static List<Integer> doubling(List<Integer> nums) {	  
	  return nums.stream().
	          map((e) -> e*2)
	          .collect(Collectors.toList());
	}

	//2
	public static List<Integer> square(List<Integer> nums) {
	  return nums.stream()
	        .map((i) -> i*i)
	        .collect(Collectors.toList());
	}

	//3
	public static List<String> addStar(List<String> strings) {
	  return strings.stream()
	                .map((i) -> i+"*")
	                .collect(Collectors.toList());
	}

	//4
	public static List<String> copies3(List<String> strings) {
	  return strings.stream()
	                .map((s) -> s+s+s)
	                .collect(Collectors.toList());
	}

	//5
	public static List<String> moreY(List<String> strings) {
	  return strings.stream()
	                .map((s) -> "y"+s+"y")
	                .collect(Collectors.toList());
	}

	//6
	public static List<Integer> math1(List<Integer> nums) {
	  return nums.stream()
	            .map((n) -> (n+1)*10)
	            .collect(Collectors.toList());
	}

	//7
	public static List<Integer> rightDigit(List<Integer> nums) {
	  return nums.stream()
	              .map((r) -> r%10)
	              .collect(Collectors.toList());
	}

	//8
	public List<String> lower(List<String> strings) {
	  return strings.stream()
	                .map((s) -> s.toLowerCase())
	                .collect(Collectors.toList());
	}

	//9
	public static List<String> noX(List<String> strings) {
	  return strings.stream()
	                .map((s) -> s.replaceAll("x",""))
	                .collect(Collectors.toList());
	}
	
}