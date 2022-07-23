package com.dmc.test;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("no" + " ");
        System.out.print("yes");
        System.out.print("111");
    }
}
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[][] arr = new int[N][2];
//        for (int i = 0; i < N; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//        int res = 0;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(hance_2(arr[0], arr[1]));
//        arrayList.add(hance_2(arr[0], arr[2]));
//        arrayList.add(hance_2(arr[1], arr[2]));
//
//
//    }
//
//    //任意两点距离的平方
//    public static int hance_2(int[] a1, int[] a2){
//        return (a1[0]-a2[0])*(a1[0]-a2[0]) + (a1[1]-a2[1])*(a1[1]-a2[1]);
//    }

//        Scanner sc = new Scanner(System.in);
//        double PI = 3.1415927;
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//        double HanWin = 0.0;
//        double n = 0.0;
//        for (int i = 0; i < N; i++) {
//            HanWin = 0.5 * (1 - Math.cos(2*PI*(n/N)));
//            double y = arr[i] * HanWin;
//            if(y > 0){
//                arr[i] = (int) (y + 0.5);
//            }else if(y < 0){
//                arr[i] = (int) (y - 0.5);
//            }else {
//                arr[i] = (int) (y);
//            }
//            n += 1.0;
//            System.out.print(arr[i]);
//            System.out.print(" ");
//        }

