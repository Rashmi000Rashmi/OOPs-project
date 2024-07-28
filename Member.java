import java.util.ArrayList;

public class Member {

    private int memberId;
    private String name;
    private String address;
    private int phone;
    private String email;
    private ArrayList<Book> borrowedBook;


    public void getDetails(int memberId, String name, String address, int phone, String email, ArrayList<Book> borrowedBook){
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.borrowedBook = new ArrayList<>();
    }

    public void borrowBook(Book book){
        if(book.isAvailable){
            book.issueBook();
            borrowedBook.add(book);
        }else{
            System.out.println(book.title+" is not avaliable now");
        }
    }

    public void returnBook(Book book){
        if(borrowedBook.contains(book)){
            book.returnBook();
        }else{
            System.out.println("Book is not in issued by you.");
        }
       
    }

    public void getDetails(){
        System.out.println("MemberId: "+ memberId);
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println("Email: "+email);
        System.out.println("Phone: "+phone);

        for(Book book: borrowedBook){
            System.out.println(book);
        }
    }
    

    
}
