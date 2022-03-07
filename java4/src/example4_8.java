public class example4_8{

    public static void printCharArray(char c[]){
        System.out.println(c);
    }
    public static void replaceSpace(char c[]){
        // for(int i =0;i<c.length;i++){
        //     if(c[i]==' '){
        //         System.out.print(".");
        //     }
        //     else{
        //         System.out.print(c[i]);
        //     }
        // }
           for(int i =0;i<c.length;i++){
            if(c[i]==' '){
                c[i]=',';
            }
        }
    }
    public static void main(String args[]){
        String s = "This is a pencil.";
        char c [] = new char[s.length()];
        for(int i = 0 ; i<s.length();i++){
            c[i] = s.charAt(i);
        }
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}