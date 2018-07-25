package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //QUESTION 1
//        int T = sc.nextInt();
//        for (int i = 0; i < T; i++) {
//            int N = sc.nextInt();
//            sc.nextLine();
//            String s = sc.nextLine();
//            String[] splited = s.split(" ");
//            boolean flag = true;
//            for (int j = 0; j < N - 1; j++) {
//                if (splited[j].equals("cookie") && !splited[j + 1].equals("milk")) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (splited[splited.length - 1].equals("cookie")) {
//                flag = false;
//            }
//            if (flag) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }

        //QUESTION 2
//        int T=sc.nextInt();
//        for (int i =0; i<T;i++){
//            int N=sc.nextInt();
//            int count = 0;
//            while (N>=100){
//                N -= 100;
//                count++;
//            }
//            while (N>=50){
//                N -= 50;
//                count++;
//            }
//            while (N>=10){
//                N -= 10;
//                count++;
//            }
//            while (N>=5){
//                N -= 5;
//                count++;
//            }
//            while (N>=2){
//                N -= 2;
//                count++;
//            }
//            while (N>=1){
//                N -= 1;
//                count++;
//            }
//            System.out.println(count);
//        }
        //Question 3
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] a = new int[N];
//        for (int i = 0; i < N; i++) {
//            a[i] = i;
//        }
//        int i = 0;
//        while (true) {
//            a[i] = -1;
//            System.out.print(((i + 1) % N) + " ");
//            boolean flag = true;
//            for (int j = 0; j < N; j++) {
//                if (a[j] != -1) {
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//            int count = 0;
//            while (count < M) {
//                i = (i + 1) % N;
//                if (a[i] != -1) {
//                    count++;
//                }
//            }
//        }
        //question 4
//        int N = sc.nextInt();
//        int D = sc.nextInt();
//        int[] L = new int[N];
//        for (int i = 0; i < N; i++) {
//            L[i] = sc.nextInt();
//        }
//        boolean[] paired = new boolean[N];
//        for (int i = 0; i < N; i++) {
//            paired[i] = false;
//        }
//        Arrays.sort(L);
//        int count = 0;
//        for (int i = 0; i < N - 1; i++) {
//            for (int j = i + 1; j < N; j++) {
//                if (L[j] - L[i] <= D) {
//                    if (!paired[j] && !paired[i]) {
//                        paired[i] = true;
//                        paired[j] = true;
//                        count++;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
        //question 5
//        int t = sc.nextInt();
//        for (int i = 0;i<t; i++) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int max = 0;
//            for (int j = 0; j < k; j++) {
//                if (n % k > max) {
//                    max = n % k;
//                }
//            }
//            System.out.println(max);
//        }
        //question 6
//        int N = sc.nextInt();
//        int[][] map = new int[N][N];
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                if (j == 0) {
//                    map[i][j] = 1;
//                } else if (j == i) {
//                    map[i][j] = 1;
//                } else {
//                    map[i][j] = map[i - 1][j - 1] + map[i - 1][j];
//                }
//            }
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
        //question 7
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++) {
//            int n = sc.nextInt();
//            int max = 0;
//            for (int j = 1; j < n; j++) {
//                if (n % j > max) {
//                    max = n % j;
//                }
//            }
//            System.out.println(n - max);
//        }

        //question 8
//        int T = sc.nextInt();
//        for (int i = 0; i < T; i++) {
//            int N = sc.nextInt();
//            int D = sc.nextInt();
//            int count = 0;
//            for (int j = 1; j <= N; j++) {
//                for (int k = j; k <= N; k++) {
//                    ArrayList<Integer> f1 = new ArrayList<Integer>();
//                    for (int l = 1; l <= j; l++) {
//                        if (j % l == 0) {
//                            f1.add(j / l);
//                        }
//                    }
//                    ArrayList<Integer> f2 = new ArrayList<Integer>();
//                    for (int l = 1; l <= k; l++) {
//                        if (k % l == 0) {
//                            f2.add(k / l);
//                        }
//                    }
//                    int max = 0;
//                    for (int l = 1; l < N; l++) {
//                        if (f1.contains(l) && f2.contains(l) && l > max) {
//                            max = l;
//                        }
//                    }
//                    if (max == D) {
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);
//        }
        //question 9
        int W = sc.nextInt();
        sc.nextLine();
        String[] s = new String[W];
        for (int i = 0; i < W; i++) {
            s[i] = sc.nextLine();
        }
        int N = sc.nextInt();
        sc.nextLine();
        String[][] l = new String[N][];
        for (int i = 0; i < N; i++) {
            l[i] = sc.nextLine().split("-");
        }
        for (int i = 0; i < W; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < l[j].length; k++) {

                    if (l[j][k].contains(s[i])) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
