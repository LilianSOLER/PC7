package td3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int nThreads = 1000;
        int nLoops = 100000;
        ThreadCount[] threads = new ThreadCount[nThreads];

        for(int i = 0; i < nThreads; i++) {
            threads[i] = new ThreadCount(nLoops);
        }


        for(int i = 0; i < nThreads; i++) {
                threads[i].join();
        }

        ThreadCount.getResults(nLoops, nThreads);
    }
}
