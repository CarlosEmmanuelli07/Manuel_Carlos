package unidad3;

import java.util.Arrays;
public class OrdenVector {
    public static void main(String[] args) {
        int[] num;
        num = new int[10];



        for (int i = 0; i < num.length; i++){
            num[i] = (int) (Math.random()* 10);
        }
        Arrays.sort(num);

        System.out.println(num.length);

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + "");
        }
    }
}
