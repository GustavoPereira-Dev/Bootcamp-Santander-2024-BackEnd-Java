package stream_api;

import stream_api.list.List;
import stream_api.set.Set;
import stream_api.map.Map;


import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String args[]) {
		int opc = 0;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Qual o conjunto de menu das estruturas de classes que deseja ver? \n 1 - Lista \n 2 - Set \n 3 - Map \n Outro - Finalizar"));
			switch(opc) {
				case 1:
					List.chamarMenu();
					break;
					
				case 2: 
					Set.chamarMenu();
					break;
				
				case 3: 
					Map.chamarMenu();
					break;
			}
		} while(opc >= 1 && opc <= 3);
		
		
	}
}
