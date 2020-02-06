public class DB_App {
    static RepositoryArticles dbArticles = new RepositoryArticlesDB();
    // Interface als Instanztyp verwenden, hinter new wird die benötigte Klasse verwendet
    public static void main(String[] args) {

        dbArticles.Insert(new Article());
        dbArticles.SearchByCategory("Laptop");
        // usw. beliebig viele Methoden im HP verwenden
    }

}
