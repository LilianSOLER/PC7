package bavards;

public class Starter {

	public static void main(String[] args) throws InterruptedException {
		BavardA[] bavardsA;
		BavardB[] bavardsB;

		if (args.length != 2) {
			System.out.println("Usage: Starter <nb bavards nb loops>");
			return;
		}

		//int nbavards = new Integer(args[0]).intValue(); // number of bavards
		//int nloops = new Integer(args[1]).intValue(); // number of loops

		int nbavards = 2; // number of bavards
		int nloops = 3; // number of loops

		bavardsA = new BavardA[nbavards]; // create an array of bavards A
		bavardsB = new BavardB[nbavards]; // create an array of bavards B

		for (int i = 0; i < nbavards; i++){ // loop to create bavards A and B
			bavardsA[i] = new BavardA(i, nloops);
			bavardsB[i] = new BavardB(i+nbavards, nloops);
		}

		for (int i = 0; i < nbavards; i++){ // loop to join bavards A and B
			bavardsA[i].join();
			bavardsB[i].join();
		}
		System.out.println("End of program");
	}

	public static void print(String threadType, int threadId, int step) {
		System.out.println("thread:" + threadType +
						" id:" + threadId + " step:" + step + "\n");
	}
}
