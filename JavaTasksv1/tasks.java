package com.company;

import java.util.*;

public class tasks {

    public static String hiddenAnagram(String str1, String str2){

        List<Character> chars = new ArrayList<>();
        String endstr = "";
        int i = 0;

        str1 = str1.toLowerCase().replaceAll("[^a-z]","");
        str2 = str2.toLowerCase().replaceAll("[^a-z]","");

        for(int x = 0; x < str2.length(); x++){
            chars.add(str2.charAt(x));
        }

        while (chars.size() >0){
            if(chars.contains(str1.charAt(i))){
                endstr += str1.charAt(i);
                chars.remove(chars.indexOf(str1.charAt(i)));
            }
            i++;
        }
        return endstr;
    }

    public static List<String> collect(String str1, int int1){

        int i = 0;
        List<String> str = new ArrayList<>();

        while (i <= str1.length()-int1){
            String s = str1.substring(i,i+int1);
            i = i+int1;
            str.add(s);
        }

        Collections.sort(str);
        return str;
    }

    public static String nicoCipher(String x, String y){
        int len = x.length();
        int ylen = y.length();
        int r = (len-len%ylen)/ylen;
        if (len%ylen != 0) {
            r++;
        }
        for (int i = len; i < r*ylen; i++) {
            x += " ";
        }
        char[][][] v = new char[r][ylen][2];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < ylen; j++) {
                v[i][j][0] = x.charAt(i*ylen+j);
                v[i][j][1] = y.charAt(j);
            }
            Arrays.sort(v[i], (a,b) ->(int) a[1] - (int) b[1]);
        }
        String s = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < ylen; j++) {
                s += v[i][j][0];
            }
        }
        return s;
    }

    public static int[] twoProduct(int[] x2, int y2) {
        int[] res = new int[2];
        for (int i = 1; i < x2.length; i++) {
            for (int j = 0; i < i; i++) {
                if (x2[i] * x2[j] == y2) {
                    res[0] = x2[i];
                    res[1] = x2[i];
                    return res;
                }
            }
        }
        return res;
    }

    public static int[] isExact(int x1){
        int i = 0;
        int res = calculateFactorial (i);
        int[] resses = new int[2];
        while (x1 > res) {
            i++;
            res = calculateFactorial(i);
            if(x1 == res){
                resses [0] = res;
                resses[1] = i;
                return resses;
            }
        }
        return resses;
    }
    static int calculateFactorial(int i){
        int result = 1;
        for (int n = 1; n <=i; n ++){
            result = result*n;
        }
        return result;
    }

}
