package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of documents:");
        n = sc.nextInt();
        sc.nextLine();
        Library library = new Library(n);
        library.addDoc(new Novel(50,"Brothers Karamazov","Dostoevsky",354,200));
        library.addDoc(new Novel(25,"The idiot","Dostoevsky",254,76));
        int ops = 4;
        while(ops != 0){
            if(ops == 1) {
                char DocType;
                System.out.println("Enter the document type:\n " +
                        "b for Book \n " +
                        "d for Dictionary \n " +
                        "m for Magazine \n " +
                        "n for Novel \n " +
                        "t for Text Book");
                DocType = sc.next().charAt(0);
                sc.nextLine();
                System.out.println("Enter the number of records of the document");
                int numRec = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the title of the document");
                String title = sc.nextLine();

                if (DocType == 'b') {
                    System.out.println("Enter the name of the author");
                    String author = sc.nextLine();
                    System.out.println("Enter the number of pages");
                    int numPages = sc.nextInt();
                    sc.nextLine();
                    Book book = new Book(numRec, title, author, numPages);
                    library.addDoc(book);

                }
                if (DocType == 'n') {
                    System.out.println("Enter the name of the author");
                    String author = sc.nextLine();
                    System.out.println("Enter the number of pages");
                    int numPages = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entre the price of the novel");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    Novel novel = new Novel(numRec, title, author, numPages, price);
                    library.addDoc(novel);

                }
                if (DocType == 't') {
                    System.out.println("Enter the name of the author");
                    String author = sc.nextLine();
                    System.out.println("Enter the number of pages");
                    int numPages = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entre the level of the text Book");
                    String level = sc.nextLine();
                    TextBook textBook = new TextBook(numRec, title, author, numPages, level);
                    library.addDoc(textBook);

                }
                if (DocType == 'm') {
                    System.out.println("Enter the month of the Magazine");
                    String month = sc.nextLine();
                    System.out.println("Enter the year of the Magazine");
                    int year = sc.nextInt();
                    sc.nextLine();
                    Magazine magazine = new Magazine(numRec, title, month, year);
                    library.addDoc(magazine);
                }
                if (DocType == 'd') {
                    System.out.println("Enter the language of the dictionary");
                    String language = sc.nextLine();
                    Dictionary dictionary = new Dictionary(numRec, title, language);
                    library.addDoc(dictionary);
                }
            }
            if(ops == 2){
                library.displayDocuments();
            }
            if(ops == 3){
                System.out.println("Enter the title of the document to delete");
                String title = sc.nextLine();
                library.removeDoc(title);
            }
            System.out.println("Enter one number to proceed:\n" +
                    "1 to add new document \n" +
                    "2 to display the documents of the Library\n" +
                    "3 to delete a document from the Library\n" +
                    "0 to exit");
            ops = sc.nextInt();
            sc.nextLine();


        }


    }
}