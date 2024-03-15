package P00_Assignment.A03_Conditionals_loops_and_methods;

// 02. Calculate electricity bill, batting average, discount of product, depreciation of value.

import java.util.Scanner;

public class Q02_Conditionals_loops_methods {
    public static void main(String[] args) {
        calcElectricityBill();
//        calcBattingAvg();
//        calcDiscountOfProduct();
//        calcDepreciationOfValue();
    }

    static void calcElectricityBill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed in prevMonths, currentMonth and perUnitPrice : ");
        float previousMonthUnits = sc.nextFloat();
        float currentMonthUnits = sc.nextFloat();
        float perUnitPrice = sc.nextFloat();
        System.out.print("Electricity bill : " + (currentMonthUnits - previousMonthUnits) * perUnitPrice);
        sc.close();
    }

    static void calcBattingAvg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of runs and number of times they are out : ");
        float numRunsScored = sc.nextFloat();
        float numOfTimesOut = sc.nextFloat();
        System.out.println("Batting avg : " + (numRunsScored / numOfTimesOut));
        sc.close();
    }

    static void calcDiscountOfProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of product and discount % : ");
        float price = sc.nextFloat();
        float discount = sc.nextFloat();
        System.out.println("Discount amount : " + price * (discount / 100));
        System.out.println("Final amount : " + (price - (price * (discount / 100))));
        sc.close();
    }

    static void calcDepreciationOfValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the asset cost, salvage value and useful life (yrs) : ");
        float assetCost = sc.nextFloat();
        float salvageVal = sc.nextFloat();
        int usefulLife = sc.nextInt();
        System.out.println("Depreciation value : " + (assetCost - salvageVal) / usefulLife);
        sc.close();
    }
}
