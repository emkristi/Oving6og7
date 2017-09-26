package pakke;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eline on 24.09.2017.
 */
public class DatabaseClass {
    // lagrer som statisk variabel slik at alle klasser kan nå
    private static Map<Long, Order> orders = new HashMap<>();
    private static Map<Long, Table> tables = new HashMap<>();

    public static Map<Long, Order> getOrders(){
        return orders;
    }

    public static Map<Long, Table> getTables(){
        return tables;
    }
}
