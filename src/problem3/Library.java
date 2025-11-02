package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }
    public void displayDocuments() {
        for (Document document : documents) {
            System.out.println(document.toString());
        }
    }
    public boolean addDoc(Document doc){
        if(documents.size() < capacity){
            documents.add(doc);
            return true;

        }
        return false;
    }
    public boolean removeDoc(String title){
        for(Document doc : documents){
            if(doc.getTitle().equals(title)){
                this.documents.remove(doc);
                return true;
            }
        }
        return false;
    }
    public Document getDocument(int numRec){
    for(Document doc : documents){
        if(numRec == doc.getNumRec()){
            return doc;
        }
    }
    return null;
    }

    public void displayAuthors() {
        System.out.println("Authors:");
        for (Document doc : documents) {
            if (doc instanceof Book) {
                    System.out.println(((Book) doc).getAuthor());
            }
        }
    }
}
