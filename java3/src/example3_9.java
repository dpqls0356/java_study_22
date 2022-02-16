//for each문에 대한 예시

public class example3_9 {

    public static void main(String args[]){

        int n[] = {1,2,3,4,5};
        String names[] ={"사과","배","바나나","체리","딸기","포도"};
        enum Week {월,화,수,목,금,토,일};
        int sum = 0;

        for (int num : n) {

            System.out.print(num+" ");
            sum +=num;
            
        }
        System.out.println("합은 "+sum);

        for (String fruit : names){
            System.out.print(fruit+" ");
        }
        System.out.println();
        for(Week week : Week.values()){
            System.out.print(week);
        }
        System.out.println();

    }
    
}
