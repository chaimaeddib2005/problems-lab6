package problem3;

public class TextBook extends Book{
    public String level;
    public TextBook(int numRec,String title,String author,int nbrPages, String level){
        super(numRec,title,author,nbrPages);
        this.level = level;

    }

    @Override
    public String toString() {
        return "TextBook{" +
                "numRec=" + numRec +
                ", title='" + title + '\'' +
                "author='" + author + '\'' +
                ", nbrPages=" + nbrPages +'\''+
                "level='" + level + '\'' +
                '}';
    }
}
