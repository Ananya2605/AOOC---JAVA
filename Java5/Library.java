

package LibraryManagement; 

user defined package


class Book {
    String title;
    String author;
    String isbn;

    
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBook() {
        System.out.println("--- Book Details ---");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + isbn);
    }
}
class Member {
    String name;
    int memberId;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void displayMember() {
        System.out.println("--- Member Details ---");
        System.out.println("Name      : " + name);
        System.out.println("Member ID : " + memberId);
    }
}


public class Library{
    public static void main(String[] args) {
    
        Book myBook = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Member myMember = new Member("Ananya", 1024);

        
        myBook.displayBook();
        System.out.println();
        myMember.displayMember();
    }
}