public class LibraryMain{

    public static void main(String[] args) {
        LibraryBook AkashVoraTara = new LibraryBook("Akash Vora Tara" ,"Humayun Ahmed");
        LibraryBook DBMS = new LibraryBook("Easy Mysql", "Abdul Bari");

        AkashVoraTara.borrowBook();
        AkashVoraTara.borrowBook();
        AkashVoraTara.returnBook();
        AkashVoraTara.getInfo();    
    }
    
}


class LibraryBook{
    private String title;
    private String Author;
    private boolean isAvailable;


    LibraryBook(String title, String Author){
        this.title = title;
        this.Author = Author;
        this.isAvailable = true;
    }

    void setTitle(String NewTitle){
        this.title = NewTitle;
    }

    void setAuthor(String NewAuthor){
        this.Author = NewAuthor;
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor(){
        return this.Author;
    }

    void getInfo(){
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.Author);
        System.out.print("Status : " );
        if(isAvailable == true){
            System.out.println("Available");
        }
        else{
            System.out.println("Not Available");

        }

    }

    void borrowBook(){
        if(isAvailable == true){
            isAvailable = false;
            System.out.println("Congrats! You just borrowed the Books");
        }
        else{
            System.out.println("You have already Borrowed that books");

        }
    }

    void returnBook(){
        if(isAvailable == false){
            isAvailable = true;
            System.out.println("Book Title : "+ this.title +" has been  successfully returned.");
        }
        else{
            System.out.println("You have not borrowed it yet");

        }
    }

}  