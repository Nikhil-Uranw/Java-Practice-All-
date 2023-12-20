//creatw two classes one for product and another for customer and create read and writable methods and properties method for it
// product class properties: itemNo, name, price,qty
// customer class properties: custId, name,address, phoneNo


package section11_OOps;

class Product{
	private String itemNo;
	private String name;
	private int price;
	private short qty;
	
	public Product(String itemno) {
		itemNo=itemno;
	}
	public Product(String itemno, String name)
	{
		this.itemNo=itemno;
		this.name=name;
	}
	public Product(String itemno, String name, int price, short qty) {
		this.itemNo=itemno;
		this.name=name;
		setPrice(price);
		setQty(qty);
	}
	
	
	public String getitemNo() {
		return itemNo;
	}
	public String getname() {
		return name;
	}
	public int getprice() {
		return price;
	}
	public short getqty() {
		return qty;
	}
	
	public void setPrice(int price) {
	if(price>0)
		this.price=price;
	else
		this.price=0;
	}
	
	public void setQty(short qty) {
		if(qty>0)
			this.qty=qty;
		else
			this.qty=0;
	}
	
}



class Customer{
	private String custId;
	private String name;
	private String address;
	private String phonno;
	
	public Customer(String custId) {
		this.custId=custId;
	}
	
	public Customer(String custId, String name) {
		this.custId=custId;
		this.name=name;
		
	}
	
	public Customer(String custId, String name, String address, String phonno) {
		this.custId=custId;
		this.name=name;
		setaddress(address);
        setphonno(phonno);
	}
	
	
	public String getcustId() {
		return custId;
	}
	public  String getname() {
		return name;
	}
	public String getaddress() {
		return address;
		
	}
	public String getphonno() {
		return phonno;
	}
	
	public void setaddress(String address) {
		this.address=address;
	}
	
	public void setphonno(String phonno) {
		this.phonno=phonno;
	}
}


public class Lect_117_StudentChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
