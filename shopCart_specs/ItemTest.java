import static org.junit.Assert.*;
import org.junit.*;
import shopCart.*;

public class ItemTest {
  Item item;
  Item item2;


  @Before
  public void beforeEach() {
    item = new Item("cheese", 2.00, 2, true);
    item2 = new Item("banana", 3.00, 1, false);
    
  }

  @Test
  public void getIdTest(){
    assertEquals("cheese", item.getId());
   
  }

  @Test
  public void getPrice(){
    assertEquals(item.getPrice(), 2.00, 0.01);
   
  }

  @Test
  public void getQuantity(){
    assertEquals(item.getQuantity(), 2);
   
  }

  @Test
  public void getDealTest(){
    assertEquals(true, item.getDeal());
  }

  @Test
  public void getDealFalseTest(){
    assertEquals(false, item2.getDeal());
  } 
  
   

}