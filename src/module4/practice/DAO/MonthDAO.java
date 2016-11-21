package module4.practice.DAO;

/**
 * Created by citsym on 21.11.16.
 */
public interface MonthDAO {

    boolean addWord(String word);
    boolean updateWord(String src, String dest);
    boolean delete(String wordToDelete);
    String[] getList();

}
