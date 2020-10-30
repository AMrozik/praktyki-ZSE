public class CezarsCode {
    public static void main(String[] args) {
        String zdanie = "I ty, Brutusie, przeciwko mnie?";

        System.out.println(zdanie);

        char[] zdanie_array = zdanie.toCharArray();

        for (int i=0; i<zdanie.length(); i++){
            if(zdanie_array[i] >= 65 && zdanie_array[i] <= 87 || zdanie_array[i] >= 97 && zdanie_array[i] <= 119 ){
                zdanie_array[i] += 3;
            }
            switch (zdanie_array[i]){
                case 88: zdanie_array[i] = 'A';
                case 89: zdanie_array[i] = 'B';
                case 90: zdanie_array[i] = 'C';
                case 120: zdanie_array[i] = 'a';
                case 121: zdanie_array[i] = 'b';
                case 122: zdanie_array[i] = 'c';
            }
        }
        System.out.println(zdanie_array);
    }

    int a = 20;
    int b = 9;
    int c = 1;

    
}
