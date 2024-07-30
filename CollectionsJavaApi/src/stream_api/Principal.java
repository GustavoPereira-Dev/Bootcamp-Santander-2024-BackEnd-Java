package stream_api;

import stream_api.list.List;
import stream_api.set.Set;
import stream_api.map.Map;


import javax.swing.JOptionPane;

public class Principal {
	static List menuLista = List.getInstancia();
	static Set menuSet = Set.getInstancia();
	static Map menuMap = Map.getInstancia();
	
	public static void main(String args[]) {
		int opc = 0;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Qual o conjunto de menu das estruturas de classes que deseja ver? \n 1 - Lista \n 2 - Set \n 3 - Map \n Outro - Finalizar"));
			switch(opc) {
				case 1:
					menuLista.chamarMenu();
					break;
					
				case 2: 
					menuSet.chamarMenu();
					break;
				
				case 3: 
					menuMap.chamarMenu();
					break;
			}
		} while(opc >= 1 && opc <= 3);
		
		
	}
}
