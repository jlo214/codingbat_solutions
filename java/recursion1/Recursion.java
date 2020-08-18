/*
8-14-2020
problems 1-9

8-16-2020
problems 10 - 19

8-17-2020
problems 20 - 29

8-18-2020
problem 30

recursion practice problems from https://codingbat.com/java/Recursion-1
Problem Descriptions in READ_ME.txt
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Recursion {

    public static void main(String []args){
        //1
        int N = 2;
        int factorialRes = factorial(N);
        System.out.println("1) ");
        System.out.println("input: "+N);
        System.out.println("factorialRes: "+factorialRes+"\n");
        
        //2
        int bunnies = 3;
        int bunnyEarsRes = bunnyEars(bunnies);
        System.out.println("2) ");
        System.out.println("input: "+bunnies);
        System.out.println("bunnyEarsRes: "+bunnyEarsRes+"\n");
        
        //3
        int fib = 8;
        int fibRes = fibonacci(fib);
        System.out.println("3) ");
        System.out.println("input: "+fib);
        System.out.println("fibRes: "+fibRes+"\n");
        
        //4
        int bun2 = 2;
        int bun2Res = bunnyEars2(bun2);
        System.out.println("4) ");
        System.out.println("input: "+bun2);
        System.out.println("bun2Res: "+bun2Res+"\n");
        
        //5
        int rows = 4;
        int triangleRes = triangle(rows);
        System.out.println("5) ");
        System.out.println("input: "+rows);
        System.out.println("triangleRes: "+triangleRes+"\n");

        //6
        int sDig = 126;
        int sumDigRes = sumDigits(sDig);
        System.out.println("6) ");
        System.out.println("input: "+sDig);
        System.out.println("sumDigRes: "+sumDigRes+"\n");

        //7
        int cnt7 = 717;
        int cnt7Res = count7(cnt7);
        System.out.println("7) ");
        System.out.println("input: "+cnt7);
        System.out.println("cnt7Res: "+cnt7Res+"\n");

        //8
        int cnt8 = 8818;
        int cnt8Res = count8(cnt8);
        System.out.println("8) ");
        System.out.println("input: "+cnt8);
        System.out.println("cnt8Res: "+cnt8Res+"\n");

        //9
        int pBase = 3;
        int pNum = 4;
        int pRes = powerN(pBase, pNum);
        System.out.println("9) ");
        System.out.println("input: "+pBase+" "+pNum);
        System.out.println("pRes: "+pRes+"\n");

        //10
        String s = "xxhixx";
        int countXRes = countX(s);
        System.out.println("10) ");        
        System.out.println("input: "+s);
        System.out.println("countXRes: " + countXRes+"\n");

        //11
        String st = "hihih";
        int countHiRes = countHi(st);
        System.out.println("11) ");      
        System.out.println("input: "+st);  
        System.out.println("countHiRes: " + countHiRes+"\n");

        //12
        String chXY = "codex";
        String changeXYRes = changeXY(chXY);
        System.out.println("12) ");
        System.out.println("input: "+chXY);
        System.out.println("changeXYRes: " + changeXYRes+"\n");

        //13
        String piS = "xpix";
        String changePiRes = changePi(piS);
        System.out.println("13) ");       
        System.out.println("input: "+piS); 
        System.out.println("changePiRes: "+changePiRes+"\n");

        //14
        String noXStr = "xaxb";
        String noXRes = noX(noXStr);
        System.out.println("14) ");        
        System.out.println("input: "+noXStr);
        System.out.println("noXRes: "+noXRes+"\n");

        //15
        int[] arr6 = {1,4};
        int arrIndex = 0;
        boolean array6Res = array6(arr6, arrIndex);
        System.out.println("15) ");        
        System.out.println("input index: "+arrIndex);
        System.out.print("input arr: ");
        Arrays.stream(arr6).forEach((e) -> System.out.print(e+" "));
        System.out.println("");
        System.out.println("array6Res: "+array6Res+"\n");

        //16
        int[] arr11 = {1,2,3,4};
        int arr11Index = 0;
        int array11Res = array11(arr11, arr11Index);
        System.out.println("16) ");  
        System.out.println("input index: "+arr11Index);      
        Arrays.stream(arr11).forEach((e) -> System.out.print(e+" "));
        System.out.println("");
        System.out.println("array11Res: "+array11Res+"\n");        

        //17
        int[] array220Arr = {20,2,21};
        int arr220Index = 0;
        boolean array220Res = array220(array220Arr, arr220Index);
        System.out.println("17) ");        
        System.out.println("input index: "+arr220Index);
        Arrays.stream(array220Arr).forEach((e) -> System.out.print(e+" "));
        System.out.println("array220Res: "+array220Res+"\n");  

        //18
        String allStarStr = "hello";
        String allStarRes = allStar(allStarStr);
        System.out.println("18) ");        
        System.out.println("input: "+allStarStr);
        System.out.println("allStarRes: "+allStarRes+"\n");        

        //19
        String pairStarStr = "xxyy";
        String pairStarRes = pairStar(pairStarStr);
        System.out.println("19) ");        
        System.out.println("input: "+pairStarStr);
        System.out.println("pairStarRes: "+pairStarRes+"\n");

		//20
		String endXStr = "xxre";
		String endXRes = endX(endXStr);
        System.out.println("20) ");		
        System.out.println("input: "+endXStr);
		System.out.println("endXRes: "+endXRes+"\n");

       	//21
        String countPairsStr = "ihihhh";
        int countPairsRes = countPairs(countPairsStr);
        System.out.println("21) ");        
        System.out.println("input: "+countPairsStr);
        System.out.println("countPairsRes: "+countPairsRes+"\n");   

        //22
        String countAbcStr = "ababc";
        int countAbcRes = countAbc(countAbcStr);
        System.out.println("22) ");        
        System.out.println("input: "+countAbcStr);
        System.out.println("countAbcRes: "+countAbcRes+"\n");

        //23
        String count11Str = "111";
        int count11Res = count11(count11Str);
        System.out.println("23) ");        
        System.out.println("input: "+count11Str);
        System.out.println("count11Res: "+count11Res+"\n");

        //24
        String sCleanStr = "yyzzza";
        String sCleanRes = stringClean(sCleanStr);
        System.out.println("24) ");        
        System.out.println("input: "+sCleanStr);
        System.out.println("sCleanRes: "+sCleanRes+"\n"); 

        //25
        String countHi2Str = "ahixhi";
        int countHi2Res = countHi2(countHi2Str);
        System.out.println("25) ");        
        System.out.println("input: "+countHi2Str);
        System.out.println("countHi2Res: "+countHi2Res+"\n");

        //26
        String pBitStr = "(xy)1";
        String pBitRes = parenBit(pBitStr);
        System.out.println("26) ");        
        System.out.println("input: "+pBitStr);
        System.out.println("pBitRes: "+pBitRes+"\n");

        //27
        String nParStr = "";
        boolean nParRes = nestParen(nParStr);
        System.out.println("27) ");        
        System.out.println("input: "+nParStr);
        System.out.println("nParRes: "+nParRes+"\n");

        //28
        String sCountStr = "catcowcat";
        String sCountSub = "cow";
        int strCountRes = strCount(sCountStr, sCountSub);
        System.out.println("28) ");        
        System.out.println("input str: "+sCountStr+" input substring: "+sCountSub);
        System.out.println("strCountRes: "+strCountRes+"\n");

        //29
        String sCopyStr = "catcowcat";
        String sCopySub = "cow";
        int sCopyN = 2;
        boolean sCopyRes = strCopies(sCopyStr, sCopySub, sCopyN);
        System.out.println("29) ");    
        System.out.println("input str: "+sCopyStr+" input substring: "+sCopySub+" input count: "+sCopyN);    
        System.out.println("sCopyRes: "+sCopyRes+"\n");

        //30
        String sDistStr = "catcowcat";
        String sDistSub = "cat";
        int sDistRes = strDist(sDistStr, sDistSub);
        System.out.println("30) ");        
        System.out.println("input str: "+sDistStr+" input substring: "+sDistSub);
        System.out.println("sDistRes: "+sDistRes+"\n");
    }
    
    //1.
    //looked up bc i had n+fact(n-1) instead of +
    public static int factorial(int n) {      
      if(n == 1)
        return 1;
      else
        return n * factorial(n-1);        
    }

    //2.
    //looked up i had 2nd base case where b == 1 return 2 and in the return i had b + (b-1)
    public static int bunnyEars(int bunnies) {
        if(bunnies == 0)
            return 0;
        else
            return 2 + bunnyEars(bunnies-1);        
    }
    
    //3.
    //solo, only bc i've seen it in every ex
    public static int fibonacci(int n) {        
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    
    //4.
    //solo
    public static int bunnyEars2(int bunnies) {        
        if(bunnies == 0)
            return 0;        
        return (bunnies%2 == 1) ? 2 + bunnyEars2(bunnies-1) : 3 + bunnyEars2(bunnies-1);                
    }

    //5.
    //solo
    public static int triangle(int rows){
        
        if(rows == 0)
            return 0;
        else
            return rows + triangle(rows-1);
        
    }

    //6.
    //solo
    public static int sumDigits(int n){
        
        if(n==0)
            return 0;        
        else{
            int temp = n%10;
            int num = n/10;
            return temp + sumDigits(num);
        }
        
    }
    
    //7
    //solo
    public static int count7(int n) {
        
        if(n==0)
            return 0;
        else{
            int temp = n%10;
            int num = n/10;
            return (temp==7) ? 1+count7(num) : count7(num);
        }
        
    }

    //8
    //had right idea but didn't figure out nested if condition (did get return condition)
    public static int count8(int n){
        //System.out.println(n);
        if(n==0)
            return 0;
        else{
            int temp = n%10;
            int num = n/10;
            
            if(temp == 8){
                if(num%10 == 8)
                    return 2+count8(num);    
                
                return 1+count8(num);
            }
            else
                return count8(num);
        }       
    }


    //9
    //solo, but not sure how i solved it, was a gut feeling
    public static int powerN(int base, int n) {
        
        if(n==1)
            return base;
        else
            return base * powerN(base, n-1);
        
    }

    //10
    //solo, first tried by adding a int i param to method and solved, 
    //then removed i and only passed str
    public static int countX(String str) {
        //System.out.println("str: "+str);
        if( str.length() == 0 )
            return 0;        
        else{
            char s = str.charAt(0);
            //System.out.println("s: "+s);
            String temp = str.substring(1);
            //System.out.println("temp: "+temp);
            
            if(s == 'x')
                return 1 + countX(temp);
            else
                return countX(temp);
        }
    }

    //11
    //solo
    public static int countHi(String str) {
        if(str.length() == 0)
            return 0;
        else{
            char c = str.charAt(0);
            String temp = str.substring(1);
            
            if(c == 'h'){
                if(str.length() > 1 && str.charAt(1) == 'i'){
                    temp = str.substring(2);
                    return 1 + countHi(temp);
                }
                return countHi(temp);
            }
            else
                return countHi(temp);
        }
    }

    //12
    //mostly solo, but looked up else condition to add c to return 
    //(my return wasn't returning the whole string)
    public static String changeXY(String str) {
  		//System.out.println("str: " + str);
  
        if(str.length() == 0)
            return str;        
        else{
            char c = str.charAt(0);
            if(c == 'x')
                return changeXY("y" + str.substring(1));
            else
                return c + changeXY(str.substring(1));            
        }                       
        /*
        //non recursive way
        if(str.contains("x")) {
            str = str.replaceAll("x","y");
            return str;
        }
        return str;
        */
    }

    //13
    //solo, but very similar to changeXY
    public static String changePi(String str) {
        //System.out.println("str: "+str);
        if(str.length() == 0)
            return str;        
        else{
            char c = str.charAt(0);
            if(c == 'p'){
                if(str.length() > 1 && str.charAt(1) == 'i')
                    return changePi( "3.14"+str.substring(2) );                
                return c + changePi( str.substring(1) );
            }
            else
                return c + changePi( str.substring(1) );            
        }        
        /*
        //non-recursive way
        if(str.contains("pi"))
            str = str.replaceAll("pi","3.14");
        
        return str;  
        */
    }

    //14
    //solo
    public static String noX(String str) {  
        if(str.length() == 0)
            return str;        
        else{
            char c = str.charAt(0);
            if(c == 'x') 
                return noX(str.substring(1));            
            else
                return c+noX(str.substring(1));            
        }  
        /*
        //non-recursive method
        if(str.contains("x")) {
            str = str.replaceAll("x","");
        }
        return str;
        */    
    }

    //15
    //solo
    public static boolean array6(int[] nums, int index) {
        if(index >= nums.length)
            return false;        
        else{
            if(nums[index] == 6)
                return true;            
            else
                return array6(nums, index+1);            
        } 
    }

    //16
    //solo, sim to above, just adding a count on the return
    public static int array11(int[] nums, int index) {  
        if(index >= nums.length)
            return 0;
        else{
            if(nums[index] == 11)
                return 1 + array11(nums, index+1);
            else
                return array11(nums, index+1);
        }
    }    

    //17
    //solo
    public static boolean array220(int[] nums, int index) {  
        if(index >= nums.length)
            return false;        
        else{
            int temp = nums[index];
            int num = nums[index] * 10;
            //problem doesn't want to look at whole arr only vals to 
            //the right of temp
            for(int i=index; i<nums.length; i++){
            //for(int i=0; i<nums.length; i++){
                if(nums[i] == num)
                    return true;                
            }
            return array220(nums, index+1);
        }  
    }    

    //18
    //solo
    public static String allStar(String str) {
        //System.out.println("str: "+str);
        if(str.length() <= 1)
            return str;
        else{
            char c = str.charAt(0);
            return c+"*"+allStar(str.substring(1));
        }
    }

    //19
    //solo
    //fyi for most of these you don't need the if/elses - the returns take care of that
    public static String pairStar(String str) {  
		if(str.length() <= 1)
            return str;        

        char c = str.charAt(0);
        if(str.charAt(1) == c)
            return c+"*"+pairStar(str.substring(1));            
        return c+pairStar(str.substring(1));                      
    }

    //20
    //solo
    public static String endX(String str) {        
        if( str.length() <= 0 ) 
            return str;

        char c = str.charAt(0);
        if(c == 'x')
            return endX( str.substring(1) ) + c;
        return c + endX( str.substring(1) );
    }

    //21
    //solo
    public static int countPairs(String str) {
        //System.out.println("str: "+str);
        if(str.length() <= 1) 
            return 0;

        char c = str.charAt(0);
        String temp = str.substring(1);
        //System.out.println("b4 temp: "+temp);
        
        if(temp.length()>1 && temp.charAt(1) == c)
            return 1 + countPairs(temp);
        
        return countPairs(temp);
    }

    //22    
    //solo
    public static int countAbc(String str) {
        //System.out.println("str: "+str);
        if(str.length() <= 2) 
            return 0;        

        String s = str.substring(0,3);
        //System.out.println("s: "+s);
        if(s.equals("abc") || s.equals("aba"))
            return 1 + countAbc(str.substring(1));            

        return countAbc(str.substring(1));                    
    }   

    //23
    //solo
    public static int count11(String str) {  
        if(str.length()<=1)
            return 0;

        String s = str.substring(0,2);
        String temp = str.substring(2);
        
        if(s.equals("11"))
            return 1 + count11(temp);
        else{
            temp = str.substring(1);
            return count11(temp);
        }
    }

    //24
    //solo
    public static String stringClean(String str) {
        //System.out.println("str: "+str);
        if(str.length() <= 1) 
            return str;

        char c = str.charAt(0);
        String tmp = str.substring(1);
        
        if(c == tmp.charAt(0))
            return stringClean(tmp);
        else
            return c + stringClean(tmp);
    }

    //25
    //looked up last else statement, if string[0] == x and string.substring(1,3) == hi, send str.substring 3 else send str.substring(1)
    public static int countHi2(String str) {
        //System.out.println("str: "+str);
        if(str.length() <= 1)
            return 0;
        else{
            char c = str.charAt(0);
            
            if(str.substring(0,2).equals("hi")) 
                return 1 + countHi2(str.substring(2));            
            else if(c != 'x'){
                
                if(str.charAt(1) == 'h'){
                    if(str.length() > 1 && str.charAt(2) == 'i')
                        return 1 + countHi2(str.substring(3));                    
                    return countHi2( str.substring(1) );
                }
                else
                    return countHi2( str.substring(1) );
            }
            //else if(str.charAt(0) == 'x'){
            else {
                if(str.length() >= 3 && str.substring(1,3).equals("hi"))
                    return countHi2(str.substring(3));                
                return countHi2(str.substring(1));
            }
        }
    }

    //26
    //solo
    public static String parenBit(String str) {
        if(str.length() <= 1)
            return str;
            
        if(str.charAt(0) == '(')
            return str.substring(0,str.indexOf(")")+1);
            
        return parenBit(str.substring(1)); 
    }

    //27
    //solo, except for last return false after last if
    public static boolean nestParen(String str) {
        if(str.length() == 0)
            return true;
        
        if(str.length() % 2 != 0 || str.length() <= 1)
            return false;
        
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
            return nestParen(str.substring(1,str.length()-1));
        return false;
    }    

    //28
    //solo
    public static int strCount(String str, String sub) {
        if(str.length() < sub.length() || str.length() == 0 || sub.length() == 0)
            return 0;
        
        if(str.substring(0,sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);

        return strCount(str.substring(1), sub);
    }

    //29
    //solo
    public static boolean strCopies(String str, String sub, int n) {  
        if(n == 0)
            return true;
        
        if(str.length() < sub.length() || str.length() == 0)
            return false;

        if(str.substring(0,sub.length()).equals(sub)) 
            return strCopies(str.substring(1), sub, n-1); 

        return strCopies(str.substring(1), sub, n);
    }

    //30
    public static int strDist(String str, String sub) {
        if(str.length() < sub.length() || str.length() == 0)
            return 0;
        else{
            if( str.substring(0,sub.length()).equals(sub) ){
                if(str.substring(str.length()-sub.length(), str.length()).equals(sub))
                    return str.length();                
                return strDist(str.substring(0,str.length()-1), sub);
            }
            return strDist(str.substring(1), sub);            
        }
    }    
    
}