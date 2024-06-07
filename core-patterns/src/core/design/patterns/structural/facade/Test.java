package core.design.patterns.structural.facade;

public class Test {
	
	public static void main(String[] args) {
		
		
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.processOrder("Macbook", 3);
		
		//To hide the logic from the client
		//To avoid this block of code in the client class
		/*OrderProcessor processor = new OrderProcessor();
		if(processor.checkStock("Macbook")) {
			String orderId = processor.placeOrder("Macbook", 3);
			processor.shipOrder(orderId);
		}*/
		
	}
	

}
