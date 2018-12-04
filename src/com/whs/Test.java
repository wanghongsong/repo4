package com.whs;

/*
*需求：统计字符串中每个字母：
 * 说明：编写程序，提示用户输入一个字符串，
 * 然后统计字符串中每个字母出现的个数，忽略字母的大小写。
 *
 * 原理：
 * 1.使用String类中的toLowerCase()方法，将字符串中的大写字母转换成小写形式。
 * 2.构造一个具有26个int值得数组ch ，每个元素记录一个字母出现的次数。
 *     即，ch[0]记录a的个数，ch[1]记录b的个数。
 * 3.对字符中的每一个字符，判断其是否小写字母，如果是，则数组中的相应计数器加1.
第一种风格的源代码：
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[26];//数组存放对应26个字母的出现次数比如a[0]的值对应字母a出现的次数，a[2]的值对应c出现的次数。。。
        System.out.println("请输入一串小写字符串");
        String str=sc.nextLine();
        str=str.trim().toLowerCase();//去掉前后空格并且全转为小写字母

        //此for循环求各个字母出现的次数
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);//依次取出每个字母
            int index=c-'a';//这样就可以得到每个字母对应的数组下标
            a[index]=a[index]+1;//对应字母出现则存储字母的数组加1
        }

        //此for循环打印每个字母出现的次数，没有出现则不打印输出
        for (int i = 0; i < a.length; i++)
        {
            if(a[i]!=0)//等于0相当于这个字母没出现就没必要打印
            {
                System.out.println("字母"+(char)(i+'a')+"出现:"+a[i]+"次");
            }
        }
    }

}