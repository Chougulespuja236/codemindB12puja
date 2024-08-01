package testpackage;

public class Orders {
	
	int orderID;
	String orderName;
	int quantity;
	int price;
	public static void main(String[] args) {
		// parameterized constructor
		
		Orders order1=new Orders(101,"mobile",5,60000);
		order1.orderinfo();
		order1.orderprice();
		
		Orders order2=new Orders(102,"Tv",2,80000);
		order2.orderinfo();
		order2.orderprice();
		
		Orders order3=new Orders(103,"Washing Machine",1,45000);
		order3.orderinfo();
		order3.orderprice();
		
		Orders order4=new Orders(104,"oven",5,35000);
		order4.orderinfo();
		order4.orderprice();	
		
	}	
		public Orders(int orderID1, String orderName1, int quantity1, int price1){
			orderID = orderID1;
			orderName = orderName1;
			quantity = quantity1;
			price = price1;
		}
       public void orderinfo() {                                         //constructor1(int.string.int)
    	   System.out.println(orderID +" "+orderName +" "+quantity);
       } 
       public void orderprice() {                                       //constructor2(int)
        	   System.out.println(price);
       }	
}


