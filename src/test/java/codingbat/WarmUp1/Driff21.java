//package codingbat.WarmUp1;
//
//public class Driff21 {
//    //    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
////
////
////    diff21(19) → 2
////    diff21(10) → 11
////    diff21(21) → 0
//    public int diff21(int n) {
//        if (n <= 21) {
//            return 21 - n;
//        } else {
//            return (21 - n) * 2;
//        }
//    }
//
////  We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
////  We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
////
////
////parrotTrouble(true, 6) → true
////parrotTrouble(true, 7) → false
////parrotTrouble(false, 6) → false
////
//
//    public boolean parrotTrouble(boolean talking, int hour) {
//        if (talking && (hour < 7 || hour > 20)) {
//            return true;
//
//        } else {
//            return false;
//        }
//
//
////        Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
////
////
////                makes10(9, 10) → true
////        makes10(9, 9) → false
////        makes10(1, 9) → true
//
////        public boolean make10 ( int a, int b){
////            return (a == 10 || b == 10 || a + b == 10);
////        }
//
////        Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
////
////
////                nearHundred(93) → true
////        nearHundred(90) → true
////        nearHundred(89) → false
////--------------------------------------------------------------
//
////        Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
////
////
////                posNeg(1, -1, false) → true
////        posNeg(-1, 1, false) → true
////        posNeg(-4, -5, true) → true
//
////        public boolean posNeg ( int a, int b, boolean negative){
////            if (negative) {
////                return (a < 0 && b < 0);
////            } else {
////                return (a < 0 && b > 0 || a > 0 && b < 0);
////            }
////        }
////    }
//
//
////    Given a string, return a new string where "not " has been added to the front.
////    However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
////
////
////            notString("candy") → "not candy"
////    notString("x") → "not x"
////    notString("not bad") → "not bad"
//
////    String notString(String str) {
////if (str.length()==x && str.substring(0,x).equals("not")){
////return str;
////}else {
////    return "not"+str;
////}
////    }
//
////    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
////    The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
////
////
////    missingChar("kitten", 1) → "ktten"
////    missingChar("kitten", 0) → "itten"
////    missingChar("kitten", 4) → "kittn"
////
////
////    String missingChar(String str, int n) {
////String front=str.substring(0,n);
////String back=(n+1 ,str.length())
////        return front+back;
////}
