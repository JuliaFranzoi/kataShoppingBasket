import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import shopCart.*;

public class CartTest{
  Cart cart;
  Item item1;
  Item item2;
  Item item3;
  Item item4;
  Item item5;
  Customer customer;
  Customer customer2;
  

  @Before
  public void beforeEach(){
    cart = new Cart();
    item1 = new Item("cheese", 2.00, 2, true);
    item2 = new Item("1234", 4.00, 2, true);
    item3 = new Item("boots", 30.00, 1, false);
    item4 = new Item("boots", 20.00, 2, false);
    item5 = new Item("boots", 10.00, 1, true);
    customer= new Customer("julia", true);
    customer2= new Customer("julia", false);
    cart.addToBasket(item1);
    cart.addToBasket(item2);
  }
  
 
  @Test
  public void addToBasketTest(){
    assertEquals(2, cart.countItems());
  }

  @Test
  public void removeItemTest(){
    cart.removeItem(item2);
    assertEquals(1, cart.countItems());
  }
 
  @Test
  public void baskedIsClearTest(){
    cart.clearCart();
    assertEquals(0, cart.countItems());
  }
  


  @Test
  public void getTotalPriceTest()
  { 
    assertEquals(12.00, cart.getTotalPrice(), 0.01);
 }

  @Test
  public void getTotalPriceMoreItemsTest()
  { cart.addToBasket(item3); 
    assertEquals(42.00, cart.getTotalPrice(), 0.01);
}


  @Test
  public void getTotalPrice2MoreItemsTest()
   { cart.addToBasket(item3); 
     cart.addToBasket(item4); 
     cart.addToBasket(item5); 
     assertEquals(92.00, cart.getTotalPrice(), 0.01);
 }


  @Test 
  public void applyDealBiggerThan2Test(){
    assertEquals(6.00, cart.applyDeal(), 0.01);
  }
  

  @Test 
  public void applyDeal2Test(){
    cart.addToBasket(item3);
    assertEquals(6.00, cart.applyDeal(), 0.01);
  }

  @Test 
  public void applyDeal3Test(){
    cart.addToBasket(item3);
    cart.addToBasket(item4);
    assertEquals(6.00, cart.applyDeal(), 0.01);
  }
  
  @Test 
  public void applyDeal4Test(){
    cart.addToBasket(item3);
    cart.addToBasket(item4);
    cart.addToBasket(item5);
    assertEquals(6.00, cart.applyDeal(), 0.01);
  }


  @Test
  public void getPriceAfterDiscountTest(){
    assertEquals(6.00, cart.getPriceAfterDiscount(), 0.01);

  }

  @Test
  public void getPriceAfterDiscount3ItemTest(){
    cart.addToBasket(item3);
    assertEquals(36.00, cart.getPriceAfterDiscount(), 0.01);

  }

  @Test
  public void getPriceAfterDiscount4ItemTest(){
    cart.addToBasket(item3);
    cart.addToBasket(item4);
    assertEquals(76.00, cart.getPriceAfterDiscount(), 0.01);

  }
  
  @Test
  public void getPriceAfterDiscount5ItemTest(){
    cart.addToBasket(item3);
    cart.addToBasket(item4);
    cart.addToBasket(item5);
    assertEquals(86.00, cart.getPriceAfterDiscount(), 0.01);

  }


  @Test
  public void TenPcDiscountTest(){ 
   assertEquals(6.00, cart.tenPcDiscount(), 0.01);
 }
  @Test
  public void TenPcDiscount2Test(){ 
   cart.addToBasket(item3);
   assertEquals(32.40, cart.tenPcDiscount(), 0.01);
 }
  

  @Test
  public void applyLCdiscountTest(){
    assertEquals(5.88, cart.applyLCdiscount(customer), 0.01);
  }
  
  @Test
  public void applyLCdiscountTest2(){
    cart.addToBasket(item3);
    assertEquals(31.752, cart.applyLCdiscount(customer), 0.01);
  }
  
  @Test
  public void applyLCdiscountNoLCTest(){
    assertEquals(6.00, cart.applyLCdiscount(customer2), 0.01);
  }

  @Test
  public void applyLCdiscountNoLCTest2(){
    cart.addToBasket(item3);
    assertEquals(32.4, cart.applyLCdiscount(customer2), 0.01);
  }


  
  // @Test
  // public void applyLCdiscount2Test(){
  //   cart.addToBasket(item3);
  //   cart.addToBasket(item4);
  //   assertEquals(31.752, cart.applyLCdiscount(customer), 0.01);
  // }



}
