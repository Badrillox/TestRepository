import java.util.List;

public class RepositoryArticlesFile implements RepositoryArticles{

    @Override
    public boolean Insert(Article article) {
        System.out.println("Artikel hinzugefügt - File");
        return false;
    }

    @Override
    public boolean Remove(int primaryKey) {
        System.out.println("Artikel gelöscht - File");
        return false;
    }

    @Override
    public boolean Update(int primaryKey, Article newArticleData) {
        System.out.println("Artikel geändert -File");
        return false;
    }

    @Override
    public List<Article> SearchByName(String name) {
        System.out.println("Artikel - Name - File");
        return null;
    }

    @Override
    public List<Article> SearchByCategory(String category) {
        System.out.println("Artikel - Kategorie - File");
        return null;
    }

    @Override
    public Article SearchByID(int primaryKey) {
        System.out.println("Artikel - ID - File");
        return null;
    }
}
