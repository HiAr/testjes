package hfdst4.vraag7.my.city;

import hfdst4.vraag7.my.school.AccessTest;

public class AccessTester extends AccessTest {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = null;
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }
        System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
    }
}
