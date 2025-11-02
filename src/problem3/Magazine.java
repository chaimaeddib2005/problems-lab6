package problem3;

public class Magazine extends Document{
    private String month;
    private int year;
    public Magazine(int numRec,String title,String month,int year){
        super(numRec,title);
        this.month=month;
        this.year=year;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "numRec=" + numRec +
                ", title='" + title + '\'' +
                "month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}
