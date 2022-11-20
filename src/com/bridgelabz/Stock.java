package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        int flag = 0;
        Scanner sc = new Scanner(System.in);
        StockPortfolio p = new StockPortfolio();

        while (flag == 0) {
            System.out.println("Enter the details of Stock ");
            StockPortfolio.Stock s = new StockPortfolio.Stock();
            System.out.println("Enter Company Name: ");
            s.company = sc.nextLine();
            System.out.println("Enter number of share: ");
            s.NoOfShare = sc.nextInt();
            System.out.println("Enter Price of share: ");
            s.price = sc.nextDouble();

            p.portf.add(s);
            System.out.println("Do you want to add more Stocks? enter 0 for YES or 1 for NO!");
            flag = sc.nextInt();
        }

        for (int i = 0; i < p.portf.size(); i++) {
            System.out.println(p.totalValue());

        }
    }
}

class StockPortfolio {

    ArrayList<Stock> portf = new ArrayList<>();
    double totalValue = 0;

    static class Stock {
        int NoOfShare;
        String company;
        double price;
    }

    public double totalValue() {

        for (Stock stock : portf) {
            totalValue += stock.price * stock.NoOfShare;
        }
        return totalValue;
    }
}