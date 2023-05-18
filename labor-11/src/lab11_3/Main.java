package lab11_3;

public class Main {
    public static void main(String[] args) {
        Storage storage1 =new Storage("data1000.txt");
        storage1.sort();
        long start = System.currentTimeMillis();
        int counter = storage1.update("update1000.txt");
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Products     | Updates         | Number of prod | execution time");
        System.out.println("data1000.txt | update1000.txt  |"+counter+"     |" + timeElapsed);

        Storage storage2 =new Storage("data1000.txt");
        storage2.sort();
        start = System.currentTimeMillis();
        counter = storage2.update("update1000000.txt");
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("data1000.txt | update1000000.txt  |"+counter+"     |" + timeElapsed);

        Storage storage3 =new Storage("data1000000.txt");
        storage3.sort();

        start = System.currentTimeMillis();
        counter = storage3.update("update1000.txt");
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;

        System.out.println("data1000000.txt  | update1000.txt  |" +counter+ "     |" + timeElapsed);

        Storage storage4 =new Storage("data1000000.txt");
        storage4.sort();

        start = System.currentTimeMillis();
        counter = storage4.update("update1000000.txt");
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;

        System.out.println("data1000000.txt  | update1000000.txt  |" +counter+ "     |" + timeElapsed);

    }
}

