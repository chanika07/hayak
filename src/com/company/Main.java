package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    double t =0;
    double l =0;
    for (int i=1; i<=x ;i++){

        while(true){
            int n = sc.nextInt();
            if (n==0)break;
            else if (n>0){
                t++;

            }
            else {
                l++;
            }

        }
        System.out.printf("%.0f ",t);

        System.out.printf("%.0f ",l);

        double p=0;
        p=(t/(t+l))*100;
        System.out.printf("%.2f %% ",(float)p);
        System.out.println();
        t=0;
        l=0;
    }


    }
}
