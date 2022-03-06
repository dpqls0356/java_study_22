class Book{

    String title;
    String author;

    public Book(){
    }
    public Book(String bookName,String bookAuthor){
        title = bookName;
        author=bookAuthor;
    }
    public Book(String bookName){
        title=bookName;
        author="작가미상";
    }
}
public class example4_4 {
    public static void main(String args[]){
        Book littlePrince = new Book("어린왕자","생텍쥐페리");
        Book loveStory = new Book("춘향전");

        System.out.println(littlePrince.title+" "+littlePrince.author);
        System.out.println(loveStory.title+" "+loveStory.author);
    }
}
