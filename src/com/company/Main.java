package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd,vnd;
        int change;
        System.out.println("Thay đổi 1 để convert từ VND sang USD");
        System.out.println("Thay đổi 2 để convert từ USD sang VND");
        change = scanner.nextInt();
        if (change == 1) {
            System.out.println("Nhập số tiền VND cần chuyển sang USD");
            vnd = scanner.nextDouble();
            System.out.println("Số tiền cần convert là " + vnd/23000 + "USD");
        } else  if (change == 2) {
            System.out.println("Nhập số tiền USD cần chuyển sang VND");
            usd = scanner.nextDouble();
            System.out.println("Số tiền cần convert là " + usd*23000 + "VND");
        } else {
            System.out.println("Error");
        }
    }
}
