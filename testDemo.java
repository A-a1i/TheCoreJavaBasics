package interthreadcommunication;

public class testDemo {
	public static void main(String[] args) {
		
		Dabba db=new Dabba();
		new DosaMaster(db);
		new Supplier(db);
		
	}

}
