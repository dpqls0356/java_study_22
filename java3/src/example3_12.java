public class example3_12 {
    
    public static int[] getArray(){
        int temp[] = {1,2,3,4};
        return temp;
    }
    public static void main(String args[]){

        int array[] = getArray();
        for(int i = 0 ; i <array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
