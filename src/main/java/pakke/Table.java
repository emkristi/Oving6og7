package pakke;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eline on 14.09.2017.
 */
public class Table {
    private int tableId;
    private boolean taken;
    private List<Order> ordre;

    public Table(){

    }

    public Table(int tableId, boolean taken){
        this.tableId = tableId;
        this.taken = taken;
    }

    public int getTableId(){
        return tableId;
    }

    public boolean isTaken(){
        return taken;
    }

}
