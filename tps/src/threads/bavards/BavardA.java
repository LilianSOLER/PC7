package bavards;

public  class BavardA extends Thread { // extends Thread instead of implements Runnable
    int nloops;
    int id;

    public BavardA(int id, int nloops) {
        this.id = id;
        this.nloops = nloops;
        this.start(); // start the thread
    }
    public void run() {
        for (int i = 0; i < nloops; i++) {
            Starter.print("BavardA", id, i); // print bavard A, id and step
            Thread.yield(); // yield to other threads
        }
        System.out.println("BavardA " + id + " completed\n");
    }
}
