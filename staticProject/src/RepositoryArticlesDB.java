import java.util.List;

public class RepositoryArticlesDB implements RepositoryArticles{

    //implementiert eine Klasse ein Interface, so verpflichtet sie sich dazu, dass sie alle Methoden ausprogrammiert
    // Wichtig: es können beliebig viele weitere Members (Felder, Methoden) vorhanden sind

    @Override
    public boolean Save() {
        return false;
    }

    @Override
    public boolean Insert(Article article) {
        return false;
    }

    @Override
    public boolean Remove(int primaryKey) {
        return false;
    }

    @Override
    public boolean Update(int primaryKey, Article newArticleData) {
        return false;
    }

    @Override
    public List<Article> SearchByName(String name) {
        return null;
    }

    @Override
    public List<Article> SearchByCategory(String category) {
        return null;
    }

    @Override
    public Article SearchByID(int primaryKey) {
        return null;
    }
}
