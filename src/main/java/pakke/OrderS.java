package pakke;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Eline on 24.09.2017.
 */
public class OrderS {
    private Map<Long, Order> orders = DatabaseClass.getOrders();

    public List<Order> getAllOrders(){
        return new ArrayList<Order>(orders.values());
    }

    public Order getOrder(long id){
        return orders.get(id);
    }

    public Order addOrder(Order order){
        //order.setOrderId(orders.size() + 1);
        //orders.put(order.getOrderId(), order);
        return order;
    }

    // ????
    public Order updateOrder(Order order){
        /*if(order.getOrderId() <= 0){
            return null;
        }
        orders.put(order.getOrderId(), order);*/
        return order;
    }

}
