package pakke;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eline on 14.09.2017.
 */
public class Table {
    private int tableNumber;
    private boolean taken;
    private List<Order> orders;

    public Table(){

    }

    public Table(int tableNumber, boolean taken, List orders){
        this.tableNumber = tableNumber;
        this.taken = taken;
    }

    public int getTableNumber(){
        return tableNumber;
    }

    public boolean isTaken(){
        return taken;
    }

}
