package shopCart;


public class Item{
  private String id;
  private Double price;
  private int quantity;
  private boolean deal;

  public Item(String id, Double price, int quantity, boolean deal){
    this.id = id;
    this.price = price;
    this.quantity = quantity;
    this.deal = deal;
  }
   public String getId(){
    return this.id;
   }
   
  public Double getPrice(){
    return this.price;
   }
  
  public int getQuantity(){
    return this.quantity;
  }
  
  public boolean getDeal(){
    return this.deal;
  }
 
}