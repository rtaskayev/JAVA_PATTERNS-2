public class Main {

    public static void main(String[] args) {

        int i = 1;

        for (int r : new Randoms(90, 101)) {
            System.out.println("Итерация [" + i + "] Случайное число: " + r);
            i++;
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}