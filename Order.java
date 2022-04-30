import java.sql.Timestamp;
public class Order {
	private String date;
	private String order;
	private int orderId;
	
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	public Order(){
	}
	public Order (String d, String o, int id)
	{
		date = d;
		order = o;
		orderId = id;
	}
	public String send()
	{
		return "Sending " + order + ". Recieved at: " + timestamp + ".";
	}
	public void setFood(String newFood){
	    this.order = newFood;
        }
	public int getID()
	{
		return orderId;
	}
	public String getFood()
	{
		return order;
	}
}