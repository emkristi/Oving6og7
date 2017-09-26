package pakke;

import java.util.Date;

/**
 * Java class for an Order.
 *
 * Created by Eline on 14.09.2017.
 */
public class Order {

    private int orderId;
    private String numGuests;
    //private String meal;
    private String ap;
    private String mc;
    private String des;
    private String drink;
    private String time;

    public Order(){

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

    public String getAp(){
        return ap;
    }

    public void setAp(String ap){
        this.ap = ap;
    }

    public String getMc(){
        return mc;
    }

    public void setMc(String mc){
        this.mc = mc;
    }

    public String getDes(){
        return des;
    }

    public void setDes(String des){
        this.des = des;
    }


    /*
    public String getMeal(){
        return meal;
    }

    public void setMeal(String meal){
        this.meal = meal;
    }
    */

    public String getDrink(){
        return drink;
    }

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
