Problem Descriptions

Functional/lambdas practice problems from 
https://codingbat.com/java/Functional-2

8-22-2020
#1-9

1: https://codingbat.com/prob/p103456

Functional-2 > noNeg
Given a list of integers, return a list of the integers, omitting any that are less than 0.


noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
-------------------------------------------------------------------------------------------------------------------

2: https://codingbat.com/prob/p124510

Functional-2 > no9
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)


no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
-------------------------------------------------------------------------------------------------------------------

3: https://codingbat.com/prob/p137274

Functional-2 > noTeen
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
-------------------------------------------------------------------------------------------------------------------

4: https://codingbat.com/prob/p105671

Functional-2 > noZ
Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)


noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
-------------------------------------------------------------------------------------------------------------------

5: https://codingbat.com/prob/p194496

Functional-2 > noLong
Given a list of strings, return a list of the strings, omitting any string length 4 or more.


noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
-------------------------------------------------------------------------------------------------------------------

6: https://codingbat.com/prob/p184496

Functional-2 > no34
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.


no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
-------------------------------------------------------------------------------------------------------------------

7: https://codingbat.com/prob/p115967

Functional-2 > noYY
prev  |  next  |  chance
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.


noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
-------------------------------------------------------------------------------------------------------------------

8: https://codingbat.com/prob/p148198

Functional-2 > two2
Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.


two2([1, 2, 3]) → [4, 6]
two2([2, 6, 11]) → [4]
two2([0]) → [0]
-------------------------------------------------------------------------------------------------------------------

9: https://codingbat.com/prob/p132748

Functional-2 > square56
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.


square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
