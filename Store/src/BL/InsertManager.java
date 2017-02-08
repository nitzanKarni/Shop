package BL;

import java.util.*;
import DL.*;
import objects.*;

public class InsertManager {
	private static DLLManager dm;
	private static queryManager qm;
	
	public int addSupplier( String name, String address, String phone ) {
		Supplier supplier = new Supplier(name, address,phone);
		if( dm == null )
			dm = new DLLManager();
		int code = dm.addSupplier(supplier);
		return code;
	}
	
	public int addProduct( String name, String supplier, int amount, int price ) {
		if ( qm == null ) 
			qm = new queryManager();
		Supplier sup = qm.getSupplier(supplier);
		Product product = new Product(name, amount, price, sup);
		
		if( dm == null )
			dm = new DLLManager();
		
		int code = dm.addProduct(product);
		
		return code;
	}
	
	public int addOrder(String orderNum, String supplier, Date date, int cost) {
		if ( qm == null ) 
			qm = new queryManager();
		Supplier sup = qm.getSupplier(supplier);
		
		Orders order = new Orders(orderNum, sup, date, cost);
		
		if( dm == null )
			dm = new DLLManager();
		
		int code = dm.addOrder(order);
		
		return code;
	}
	
	

}
