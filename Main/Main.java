package Main;

import java.awt.EventQueue;

import projetoInterface.FramePrincipal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
