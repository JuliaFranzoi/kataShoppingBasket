package shopCart;
import java.util.ArrayList;

public class Cart{
  private Customer customer;
  private ArrayList<Item>basket;
  
  public Cart(){
    this.basket = new ArrayList<Item>();
    this.customer = customer;
  }

  public void addToBasket(Item item){
    basket.add(item);
  }

  public void removeItem(Item item){
    basket.remove(item);
  }
  
  public int countItems(){
    return basket.size();
  }


  public double getTotalPrice(){
    double totalPrice = 0.0;
    for (Item item : basket){
      totalPrice += item.getPrice() * item.getQuantity();
    }
    return totalPrice;
  }
 
  public double applyDeal(){
    double dealDiscount = 0.0;

    for (Item i: basket){
      if ((i.getQuantity() == 2) && (i.getDeal() == true)){
        dealDiscount += i.getPrice();
      }
    }
    return dealDiscount;
  }


  public double getPriceAfterDiscount(){
    double totalPrice = getTotalPrice();
    double dealDiscount = applyDeal();
    double discountedPrice = totalPrice - dealDiscount;
    return  discountedPrice;
  }
  
  public double tenPcDiscount(){
    double total = getPriceAfterDiscount();
    if (total >= 10.00){
      total = (total)-(total * 10.00/100.00);
    }
    return total;
  }

  public double applyLCdiscount(Customer customer){
    double price = tenPcDiscount();
    if (customer.getCard() == true){
      price = (price) - (price * 2.00/100.00);
    }
    return price;
  }
 } 