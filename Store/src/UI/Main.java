package UI;

import java.util.*;
import BL.*;
import objects.*;

public class Main {
	
	static Scanner reader = new Scanner( System.in );
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopManager sm = new ShopManager();
		sm.DataInit();
		sm.printInventory();
		
		
	}

}
