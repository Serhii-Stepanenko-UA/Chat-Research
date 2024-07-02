package app;

// Надання даних через різний тип масиву
public class DataProvider {

    public String[] getUserNames() {
        return new String[] {"Alice", "Bob", "Alice", "Lucy", "Denis"};
    }

    public Integer[] getPostsQuota() {
        return new Integer[] {258, 123, 473, 56, 305};
    }
}