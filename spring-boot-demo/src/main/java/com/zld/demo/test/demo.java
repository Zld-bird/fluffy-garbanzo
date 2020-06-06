package com.zld.demo.test;

public class demo {
    public static void main(String[] args) {

        /*Integer a=12345;
        int sort = new demo().sort(a);
        System.out.println(sort);*/

        String s[]={"121","113"};

        /*String a="12";
        String b="13";*/
        for (int i=0;i<s.length-1;i++) {
            if (s[i].compareTo(s[i+1]) > 0) {
                System.out.println(s[i]+ "大于" + s[i+1]);
            } else {
                System.out.println(s[i] + "小于" + s[i+1]);
            }
        }

      /*  String str="12,231,43,2,4,-3,23,2345,6543";
        new demo().sort1(str);*/
    }

    public int sort(Integer number){
        int i = number.intValue();
        return i;
    }

    public void sort1(String string){
        String temp=null;
        String[] split = string.split(",");
        for (int i=0;i<split.length;i++){
            for(int j=0;j<split.length-i-1;j++){
                if(split[j].compareTo(split[j+1])>0){
                    temp=split[j+1];
                    split[j+1]=split[j];
                    split[j]=temp;
                }
            }
        }
        for(int a=0;a<split.length;a++) {
            System.out.println(split[a]);
        }
    }
}
