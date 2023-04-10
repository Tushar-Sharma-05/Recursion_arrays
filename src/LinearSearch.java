public class LinearSearch {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6};
        System.out.println(findIndex(arr,3,0));


    }

    static boolean find(int[] arr,int target , int index){
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || find(arr,target,index+1);

    }

    static int findIndex(int[] arr,int target , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {

            return findIndex(arr, target, index + 1);
        }

    }



}
