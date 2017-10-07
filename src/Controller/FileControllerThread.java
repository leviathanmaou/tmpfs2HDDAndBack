package Controller;

public class FileControllerThread extends Thread {

	public void run() {
		while (true) {
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
