package pakke;

/**
 * Created by Eline on 23.09.2017.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Path("/orders")
public class RestaurantService {
    private static Map<String, Table> tables = new HashMap<>();
    private static Map<Integer, Order> orders = new HashMap<>();

    private static final AtomicInteger count = new AtomicInteger(0);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int lagOrdre(Order order){
        int id = count.incrementAndGet();
        order.setOrderId(id);
        orders.put(order.getOrderId(), order);

        return order.getOrderId();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Order> getOrders(){
        return orders.values();
    }

    @GET
    @Path("/{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getTotalTables(@PathParam("orderId") int orderId){
        return orders.get(orderId);
    }




}
