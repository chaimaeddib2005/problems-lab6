package problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(int numREc,String title,String language){
        super(numREc,title);
        this.language = language;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "numRec=" + numRec +
                ", title='" + title + '\'' +
                "language='" + language + '\'' +
                '}';
    }
}
