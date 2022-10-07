package threads.td3;

public  class ThreadCount extends Thread { // extends Thread instead of implements Runnable
    static int cptDesync = 0;
    static int cptSync = 0;

    int nloops;

    public ThreadCount(int n) {
        this.start(); // start the thread
        nloops = n;

    }
    public void run() {
        for(int i = 0; i < nloops; i++) {
            incr();
            incr_desynchronized();
        }
    }

    public static synchronized void incr() {
        cptSync++;
    }

    public static void incr_desynchronized() {
        cptDesync++;
    }

    public static void getResults(int nLoops, int nThreads) {
        System.out.println("cptSync = " + cptSync);
        System.out.println("cptDesync = " + cptDesync);
        System.out.println("cptSync - cptDesync = " + (cptSync - cptDesync));
        System.out.println("nLoops * nThreads = " + (nLoops * nThreads));
        System.out.println("cptSync - nLoops * nThreads = " + (cptSync - nLoops * nThreads));
        System.out.println("cptDesync - nLoops * nThreads = " + (cptDesync - nLoops * nThreads));
        System.out.println("Error rate sync = " + (double)(cptSync - nLoops * nThreads) / (nLoops * nThreads));
        System.out.println("Error rate desync = " + (Math.abs((double)(cptDesync - nLoops * nThreads) / (nLoops * nThreads))));
    }


}
