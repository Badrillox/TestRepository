import java.util.List;

public class RepositoryArticlesDB implements RepositoryArticles{

    //implementiert eine Klasse ein Interface, so verpflichtet sie sich dazu, dass sie alle Methoden ausprogrammiert
    // Wichtig: es können beliebig viele weitere Members (Felder, Methoden) vorhanden sind

    @Override
    public boolean Insert(Article article) {
        System.out.println("Artikel wurde in DB abgespeichert");
        return false;
    }

    @Override
    public boolean Remove(int primaryKey)
    {
        System.out.println("Artikel wurde in DB gelöscht");
        return false;
    }

    @Override
    public boolean Update(int primaryKey, Article newArticleData) {
        System.out.println("Artikel wurde in DB geändert");
        return false;
    }

    @Override
    public List<Article> SearchByName(String name) {
        System.out.println("Artikelliste aus DB - Name");
        return null;
    }

    @Override
    public List<Article> SearchByCategory(String category) {
        System.out.println("Artikelliste aus DB - Kategorie");
        return null;
    }

    @Override
    public Article SearchByID(int primaryKey) {
        return null;
    }
}
