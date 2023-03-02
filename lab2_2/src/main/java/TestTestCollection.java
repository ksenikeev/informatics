import java.util.Iterator;

public class TestTestCollection {
    public static void main(String[] args) {
        TestCollection<Integer> testCollection = new TestCollection<>();

        testCollection.add(1);
        testCollection.add(2);
        testCollection.add(3);
        testCollection.add(4);

/*
        Object[] data = testCollection.toArray();

        for (Object o : data ) {
            System.out.println(o);
        }
*/

        Iterator<Integer> iterator = testCollection.iterator();

/*
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
*/

        for(Integer i : testCollection) {
            System.out.println(i);
        }
    }
}
