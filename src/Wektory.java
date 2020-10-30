public class Wektory {

    public static void main(String[] args) {

        int[] w1 = {1,2,3};
        int[] w2 = {1,2,3};

        int skalar_product = 0;

        for(int i=0; i<w1.length; i++){
            skalar_product += w1[i] * w2[i];
        }
        System.out.println(skalar_product);
    }
}
