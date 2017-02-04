import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import shopCart.*;

public class CustomerTest{
  Customer customer;
  Customer customer2;
  Item item;
  Cart cart;

  @Before
  public void beforeEach(){
    // item = new Item("cheese", 2.00, 2, true);
    // cart = new Cart();
    // cart.addToBasket(item);
    customer = new Customer("julia", true);
    customer2 = new Customer("niko", false);
  }

  @Test
  public void getNameTest(){
    assertEquals("julia", customer.getName());
  }

  @Test
  public void hasCardTest(){
    assertEquals(true, customer.getCard());
  }

  @Test
  public void hasNoCardTest(){
    assertEquals(false, customer2.getCard());
  }


} 

  