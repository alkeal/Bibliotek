public class Book {
    //variabler
    String name;
    String writer;
    int year;
    String edition;
    boolean inStore;

    public Book(){
        this.name = "--";
        this.writer = "--";
        this.year = 0;
        this.edition = "--";
        this.inStore = false;

    }

    public Book(String name, String writer, int year, String edition, boolean inStore){
        this.name = name;
        this.writer = writer;
        this.year = year;
        this.edition = edition;
        this.inStore = inStore;
    }

    public void loan(){ //metod
        System.out.println(this.name + " . Den finns att låna ");
    }

    public void returnBook(){
        System.out.println(" Du har nu lämnat tillbaka boken " + this.name);

    }

    public String toString(){
        return " Name: " + this.name +
                " Writer: " + this.writer +
                " Year: " + this.year +
                " Edition: " + this.edition;

    }
}
