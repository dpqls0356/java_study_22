class BookVersion2 extends Book{

    public BookVersion2 (){
        this("","");
        System.out.println("생성자함수 호출되었습니다.");
    }
    public BookVersion2(String bookName){
        this(bookName,"작가미상");
    }
    public BookVersion2(String bookName,String bookAuthor){
        title = bookName;
        author=bookAuthor;
    }
    public void show(){
        System.out.println(title+" "+author);
    }
    
}

public class example4_5 {

    public static void main(String args[]){
        BookVersion2 littlePrince = new BookVersion2("어린왕자","생텍쥐페리");
        BookVersion2 loveStory = new BookVersion2("춘향전");
        BookVersion2 emptyBook = new BookVersion2();
        littlePrince.show();
        loveStory.show();
        emptyBook.show();
 
    
    }
}