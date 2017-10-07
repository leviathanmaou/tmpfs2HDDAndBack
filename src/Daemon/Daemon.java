package Daemon;

import Controller.FileControllerThread;

public class Daemon {

	public static void main(String[] args) {
		(new FileControllerThread()).start();
	}

}
