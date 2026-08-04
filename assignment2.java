public class assignment2 {

    String title;
    String author;
    double price;
    int quantity;
    // DEFAULT CONSTRUCTOR //
    public assignment2() {
        title = "Untitled";
        author= "Unknown";
        price= 0.0;
        quantity=0;
        System.out.println("Default Constructor Called");
    
    }

    //PARAMETERIZED CONSTRUCTOR//
    public assignment2(String bookTitle, String bookAuthor, double bookPrice , int bookQuantity){
        title=bookTitle;
        author=bookAuthor;
        price=bookPrice;
        quantity=bookQuantity;
        System.out.println("Parameterized Constructor Called");

    }

    // COPY CONSTRUCTOR//
    public assignment2(assignment2 existingBook) {
        title= existingBook.title;
        author= existingBook.author;
        price= existingBook.price;
        quantity= existingBook.quantity;
        System.out.println("Copy Constructor Called");

    }

    void displayDetails() {
        System.out.println("--------Book Details-------");
        System.out.println("Title    :"+title);
        System.out.println("Author   : " + author);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
    }
    void updateStock(int soldCopies) {
        if (soldCopies<= quantity) {
            quantity = quantity - soldCopies;
            System.out.println(soldCopies + "copies sold. Remaining stock: " + quantity);
        } else {
            System.out.println("Not enough stock Available ");
        }
    }
        void setPrice(double newPrice) {
            price = newPrice;
        }

        public static void main(String[] args)  {

            System.out.println(" Creating Book 1 (Default Constructor ");
            assignment2 book1= new assignment2();
            book1.displayDetails();
            System.out.println();


            System.out.println("Creating Book 2 (Parameterized Constructor");
            assignment2 book2= new assignment2( "Harry Potter","JK Rowling ",4999.00,23);
            book2.displayDetails();
            System.out.println();


            System.out.println(" Creating Book 3 ( Copy Constructor , copied from book 2)");
            assignment2 book3= new assignment2(book2);
            book3.displayDetails();
            System.out.println();

            System.out.println(" Modyfying Book3");
            book3.setPrice(5999.00);
            book3.updateStock(10);
            book3.displayDetails();
            System.out.println();
            System.out.println("Book2 Details:");
            book2.displayDetails();
            System.out.println();
            System.out.println("Changing book3 did not change book2 , hence they are independednt ");


        }
    
}
