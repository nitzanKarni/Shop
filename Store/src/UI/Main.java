package UI;

import java.util.*;
import BL.*;
import objects.*;

public class Main {
	
	static Scanner reader = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		ShopManager sm = new ShopManager();
		InsertManager im = new InsertManager();
		sm.DataInit();
		sm.printInventory();
		System.out.println(im.addProduct("neckless", "Laster", 4, 150));
		sm.printInventory();
		/*DeleteManager dll = new DeleteManager();
		System.out.println(dll.deleteProduct("neckless"));
		sm.printInventory();*/
		
		
		
	}

}
