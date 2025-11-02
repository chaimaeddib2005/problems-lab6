package problem3;

public class Novel extends Book{
    public double price;
    public Novel(int numRec, String title, String author, int nbrPages, double price){
        super(numRec,title,author,nbrPages);
        this.price = price;

    }
    @Override
    public String toString() {
        return "Novel{" +
                "numRec=" + numRec +
                ", title='" + title + '\'' +
                "author='" + author + '\'' +
                ", nbrPages=" + nbrPages +'\''+
                "price=" + price +
                '}';
    }


}
