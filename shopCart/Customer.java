package shopCart;

import java.util.ArrayList;


public class Customer {
    private String name;
    private boolean card;
    

    public Customer(String name, boolean card){
        this.name = name;
        this.card = card;

    }

    public String getName() {
        return this.name;
    }

    public boolean getCard(){
        return this.card;
    }
    
    
}