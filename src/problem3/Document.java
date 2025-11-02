package problem3;

public class Document {
    protected int numRec;
    protected String title;
    public Document(int numRec, String title) {
        this.numRec = numRec;
        this.title = title;
    }
    public int getNumRec() {
        return numRec;
    }
    public void setNumRec(int numRec) {
        this.numRec = numRec;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numRec=" + numRec +
                ", title='" + title + '\'' +
                '}';
    }

}
