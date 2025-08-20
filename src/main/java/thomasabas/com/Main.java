package thomasabas.com;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        // 1. GeoDrill Company
//        int[] Numbers = {300, 450, 120, 800, 540, 760, 310, 900, 500, 620};
//
//        int maxValue = Numbers[0];
//        int MaxIndex = 0;
//        for (int i = 0; i < Numbers.length; i++) {
//                if (Numbers[i] >maxValue){
//                    maxValue= Numbers[i];
//                    MaxIndex= i ;
//
//                }
//
//        }
//        System.out.println("Highest discovery: " + maxValue + " barrels at position " + MaxIndex);
//    }

//    public static void main(String[] args) {
//        // (CoastalRefine Ltd
//        int[] litres = {200, 800, 1500, 2000, 1750, 1400, 1650};
//        int total = 0;
//        for (int i = 0; i < litres.length; i++) {
//            total += litres[i];
//
//        }
//        if (total > 1000){
//            System.out.println("ALERT: Capacity Exceeded!");
//        }
//    }


    public static void main(String[] args) {
//        Defective parts report
        int[] defects = {2, 8, 1, 0, 6, 7, 3, 9, 5};
        ArrayList<Integer> filtered = new ArrayList<>();
        for (int i = 0; i < defects.length; i++) {
            if (defects[i] > 5) {
                filtered.add(defects[i]);
            }
        }
        System.out.println(filtered);
    }

}