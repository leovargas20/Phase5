import java.util.*;
import java.util.ArrayList;

public class DBTest {
    List<String> foodList = new ArrayList<String>();
    List<String> memberList = new ArrayList<String>();
    
    public DBTest(){
        foodList.add("pizza");
        foodList.add("burger");
        foodList.add("soda");
        foodList.add("fries");
        foodList.add("salad");
    }
    
    public boolean isFood(String food){
        //Returns true if food string exists in the arraylist, false if otherwise
        return foodList.contains(food);
    }
    
    public void msg(){
        System.out.println("Please pick your food from this list: ");
        System.out.println(foodList);
 }
}
