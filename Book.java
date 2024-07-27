
import java.time.LocalDateTime;

public class Book{
    int bookId;
    String title;
    String author;
    String publisher;
    LocalDateTime year;
    boolean isAvailable;

    public Book(int bookId,String title,String author,String publisher,LocalDateTime year,boolean isAvailable){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isAvailable = true;

    }

    public void getDetails(){
        System.out.println("Book Id: "+ bookId);
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Publisher: "+ publisher);
        System.out.println("Year: "+ year);
        if(isAvailable){
            System.out.println("Avaliable: Yes");
        }else{
            System.out.println("Avaliable: No");
        }
        
    }

    public void issueBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title+" has been issued");
        }else{
            System.out.println(title+" is not avaliable currently");
        }

    }

    public void returnBook(){
        isAvailable= true;
        System.out.println(title+" has been returned.");
    }

}