

//ArrayIndexOutOfBoundsException 오류
public class example3_16 {
    
    public static void main(String args[]){

        int intArray[]= new int[3];

        for(int i = 0 ; i<intArray.length;i++){
           
            if(i>0){
                intArray[i] = i+intArray[i-i];
            }
           else{ intArray[i] = i+intArray[i];}
        }
        try{
       
            for(int i =0 ; i<intArray.length+1;i++){
                   System.out.println("intArray["+i+"] = "+intArray[i]);
                 }
          }
          catch(ArrayIndexOutOfBoundsException e){
              System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
          }
    }
}
