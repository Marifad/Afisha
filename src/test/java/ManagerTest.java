import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Movie item1 = new Movie("Бладшот");
    Movie item2 = new Movie("Вперед");
    Movie item3 = new Movie("Отель Белград");
    Movie item4 = new Movie("Джентельмены");
    Movie item5 = new Movie("Человек-невидимка");

    @Test
    public void shouldAddItems() {
        Manager afishaManager = new Manager();
        afishaManager.add(item1);
        afishaManager.add(item2);
        Movie[] expected = {item1, item2};
        Movie[] actual = afishaManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfEmptyConstractor() {
        Manager afishaManager = new Manager();
        afishaManager.add(item1);
        afishaManager.add(item2);
        afishaManager.add(item3);
        afishaManager.add(item4);
        afishaManager.add(item5);

        Movie[] expected = {item5, item4, item3, item2, item1};
        Movie[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfFindLess() {
        Manager afishaManager = new Manager(3);
        afishaManager.add(item1);
        afishaManager.add(item2);
        afishaManager.add(item3);
        afishaManager.add(item4);
        afishaManager.add(item5);

        Movie[] expected = {item5, item4, item3};
        Movie[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfFindAll() {
        Manager afishaManager = new Manager(5);
        afishaManager.add(item1);
        afishaManager.add(item2);
        afishaManager.add(item3);
        afishaManager.add(item4);
        afishaManager.add(item5);

        Movie[] expected = {item5, item4, item3, item2, item1};
        Movie[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfFindMore() {
        Manager afishaManager = new Manager(7);
        afishaManager.add(item1);
        afishaManager.add(item2);
        afishaManager.add(item3);
        afishaManager.add(item4);
        afishaManager.add(item5);

        Movie[] expected = {item5, item4, item3, item2, item1};
        Movie[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfFindZero() {
        Manager afishaManager = new Manager(0);
        afishaManager.add(item1);
        afishaManager.add(item2);
        afishaManager.add(item3);
        afishaManager.add(item4);
        afishaManager.add(item5);

        Movie[] expected = {};
        Movie[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
