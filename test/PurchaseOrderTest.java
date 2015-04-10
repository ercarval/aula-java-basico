
public class PurchaseOrderTest {
	
	
	
	public static void main(String[] args) {
	
		// 1 - Criar uma instancia de PO 
		// 2 - para Cada PO.items devo atribuir uma instancia de POItem
		System.out.println("");
	
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		//setup
		for (int i=0; i < purchaseOrder.items.length ;i++){
			purchaseOrder.items[i] = new PurchaseOrderItem(); 
			purchaseOrder.items[i].price = 12.0;
			purchaseOrder.items[i].quantity = 5.0;
		}
		
		//test
		double receivedTotalAmmount = purchaseOrder.totalAmmount();
		double expected = 324234.00;
		
		System.out.println("Passoou !!! " + ( receivedTotalAmmount == expected ) );
		
	}

}
