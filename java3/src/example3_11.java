public class example3_11{

    public static void main(String args[]){

        int array[][] = new int[4][];

        for(int i = 0 ; i<4;i++){
            if(i%2==0){
                array[i] = new int[3];
            }
            else{
                array[i] = new int[2];
            }

            // for(int k = 0 ; k<array[i].length;k++){
            //     array[i][k] = (i+1)*10+k;
            // }
            if(i%2==0){
                for(int k = 0 ; k<3;k++){
                    array[i][k] = (i+1)*10+k;
                }
            }
            else{
                for(int k = 0 ; k<2;k++){
                    array[i][k] = (i+1)*10+k;
                }
            }
        }

        for(int i = 0 ; i<array.length;i++){
            for(int k = 0 ; k<array[i].length;k++){
                System.out.print(array[i][k]+" ");
            }
            System.out.println();
        }
    }
}