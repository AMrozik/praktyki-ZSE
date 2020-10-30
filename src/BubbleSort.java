public class BubbleSort {
        public static void main(String []args){

            int[] arr = {1000,6,9,34,78,234,89,34,2,3,5,0};

            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for(int i: arr){
                System.out.print(i + ", ");
            }
        }
}
