import org.example.Customer;
import org.example.Order;
import org.example.Product;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class OrderTest {


    private Order order;
    private Customer customer;
    private Product product1;
    private Product product2;


    @Before
    public void setup(){
        customer = new Customer("Jakob", "forsbacka", "jakob.forsbacka@gmail.com");
        product1 = new Product("kaka", 5);
        product2 = new Product("kanelbulle", 10);


        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        order = new Order(0,customer, products,"date");
    }


    @Test
    public void testOrderIntegration(){
        assertEquals(15, order.getFullPrice(), 0);
        //assertEquals(order.getCustomer("Jakob", order.getCustomer().getFirstName()));
        assertEquals(2,order.products.size());

    }


}
