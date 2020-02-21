package com.example.demo;

import java.io.File;
import java.util.Scanner;

public class test {


    public static void  main(String[] args){

        /*
        String[] a=new String[2];
        Object[] b=a;
        a[0]="hi";
        b[1]=Integer.valueOf(42);
        System.out.println(a[1]);
        */
        System.out.println(filetest());

        scanner();
    }
    public static String filetest(){
        File file=new File("d:\2.txt");
        String name=file.getName();
        return name;
    }

    public static void scanner(){

        Scanner scan=new Scanner(System.in);
        System.out.println("next方式接收：");
        if(scan.hasNext()){
            String str1=scan.next();
            if(str1.equals("hadoop fs")) {
                System.out.println("输入数据为1" + str1);
            }else{
                System.out.println("输入数据为2" + str1);
            }
            switch(str1){

                case "aa":
                    System.out.println("输入数据为" + str1);
                    break;
                case "b" :
                    System.out.println("输入数据为" + str1);
                    break;
                default :
                    System.out.println("不是要的数据");
            }
        }

        scan.close();
    }
}
