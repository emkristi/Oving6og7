package pakke;

/**
 * Created by Eline on 23.09.2017.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class that contains the GET and POST methods for the
 */
@Path("/orders")
public class RestaurantService {
    private static Map<String, Table> tables = new HashMap<>();
    private static Map<Integer, Order> orders = new HashMap<>();
    private static final AtomicInteger count = new AtomicInteger(0);
    private static final AtomicInteger countTable = new AtomicInteger(0);

    /**
     * POST method that submits an order. It also gives the order an Id.
     *
     * @param order
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int makeOrder(Order order){

        int id = count.incrementAndGet();
        order.setOrderId(id);
        orders.put(order.getOrderId(), order);

        int tableId = countTable.incrementAndGet();
        order.setTableId(tableId);
        orders.put(order.getTableId(), order);

        return order.getOrderId();
    }

    /**
     * GET method for getting all the orders that has been made.
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Order> getOrders(){
        return orders.values();
    }
}
