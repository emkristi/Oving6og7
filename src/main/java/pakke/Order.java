package pakke;

import java.util.Date;

/**
 * Created by Eline on 14.09.2017.
 */
public class Order {

    private int orderId;
    //private int totalTables;
    private String numGuests;
    //private Table[] table; // tabell over bordene
    private String meal;
    private String drink;
    private String time;

    public Order(){

    }

    /*
    public Order(String orderId, int numGuests, String meal, String drink, Date time){
        //this.totalTables = totalTables;
        this.numGuests = numGuests;
        this.meal = meal;
        this.drink = drink;
        //this.time = time;
    }
    */

    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    /*public int getTotalTables() {
        return totalTables;
    }

    public void setTotalTables(int totalTables) {
        this.totalTables = totalTables;
    }*/

    public String getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(String numGuests) {
        this.numGuests = numGuests;
    }

    /*public Table[] getTable() {
        return table;
    }
    */
/*
    public void setTable(Table[] table) {
        this.table = table;
    }
*/
    public String getMeal(){
        return meal;
    }

    public void setMeal(String meal){
        this.meal = meal;
    }

    public String getDrink(){
        return drink;
    }

    public void setDrink(String drink){
        this.drink = drink;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
