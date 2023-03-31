class ManageLibrary{
    private int totalBooks;
    private int[] availableBook = new int[100];
    private int[] issueBook = new int[100];
    private int n=-1;
    ManageLibrary(){
        totalBooks=0;
    }
    public void addBook(int newBook){
        ++n;
        availableBook[n]=newBook;
        this.totalBooks+=newBook;

    }
    public void returnBook(int retBook){
        ++n;
        availableBook[n]=-retBook;
        this.totalBooks-=retBook;

    }
    public void showAvailableBook(){
        for (int i=0;i<=n;i++) {
            System.out.println(availableBook[i]+" ");

        }
        System.out.println("Total Books :"+this.totalBooks);
    }
    int nw = -1;
    public void issueBooks(int book){
        ++nw;
        this.issueBook[nw]=book;
    }
    public void showIssueBooks(){
        for(int i=0;i<=nw;i++){
            System.out.println(issueBook[i]+" ");
        }
    }
}

public class Library {
    public static void main(String [] args){
        //Implement a library using Java Class Library
        //Methods : addBook , issueBook , returnBook , showAvailableBooks
        //Properties : Array to store the available books.
        // Array to store Issue book
        ManageLibrary lib= new ManageLibrary();
        lib.addBook(20);

        lib.showAvailableBook();

        lib.returnBook(7);

        lib.showAvailableBook();

        lib.issueBooks(2);

        lib.showIssueBooks();

    }
}
