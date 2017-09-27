package pakke;

import java.util.Date;

/**
 * Java class for an Order.
 *
 * Created by Eline on 14.09.2017.
 */
public class Order {

    private int orderId;
    private int tableId;
    private String numGuests;
    private String ap;
    private String mc;
    private String des;
    private String drink;
    private String time;

    public Order(){

    }

    public int getTableId(){
        return tableId;
    }

    public void setTableId(int tableId){
        this.tableId = tableId;
    }

    /*
    public Order(String orderId, int numGuests, String meal, String drink, Date time){
        this.numGuests = numGuests;
        this.meal = meal;
        this.drink = drink;
        //this.time = time;
    }
    */

    /**
     * Method for getting an orderId
     * @return
     */
    public int getOrderId(){
        return orderId;
    }

    /**
     * Method for setting an orderId
     * @param orderId
     */
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    /**
     * Method for getting number of guests
     * @return
     */
    public String getNumGuests() {
        return numGuests;
    }

    /**
     * Method for setting number og guests
     * @param numGuests
     */
    public void setNumGuests(String numGuests) {
        this.numGuests = numGuests;
    }

    /**
     * Method for getting appetizer
     * @return
     */
    public String getAp(){
        return ap;
    }

    /**
     * Method for setting appetizer
     * @param ap
     */
    public void setAp(String ap){
        this.ap = ap;
    }

    /**
     * Method for getting Main Course
     * @return
     */
    public String getMc(){
        return mc;
    }

    /**
     * Method for setting Main Course
     * @param mc
     */
    public void setMc(String mc){
        this.mc = mc;
    }

    /**
     * Method for getting Dessert
     * @return
     */
    public String getDes(){
        return des;
    }

    /**
     * Method for setting Dessert
     * @param des
     */
    public void setDes(String des){
        this.des = des;
    }

    /**
     * Method for getting drink
     * @return
     */
    public String getDrink(){
        return drink;
    }

    /**
     * Method for setting drink
     * @param drink
     */
    public void setDrink(String drink){
        this.drink = drink;
    }

    /**
     * Method for getting time
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * Method for setting time
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }
}
