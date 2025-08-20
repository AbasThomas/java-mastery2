package thomasabas.com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. GeoDrill Company
        int[] Numbers = {300, 450, 120, 800, 540, 760, 310, 900, 500, 620};

        int maxValue = Numbers[0];
        int MaxIndex = 0;
        for (int i = 0; i < Numbers.length; i++) {
                if (Numbers[i] >maxValue){
                    maxValue= Numbers[i];
                    MaxIndex= i ;

                }

        }
        System.out.println("Highest discovery: " + maxValue + " barrels at position " + MaxIndex);
    }

}