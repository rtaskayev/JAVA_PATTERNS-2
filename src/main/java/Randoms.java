import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private Random random = new Random();

    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator2();
    }

    private class RandomsIterator2 implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min) + min;
            //return (int) ((Math.random() * (max - min)) + min);
        }
    }

}

