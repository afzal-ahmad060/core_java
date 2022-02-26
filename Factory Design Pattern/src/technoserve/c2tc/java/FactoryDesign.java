package technoserve.c2tc.java;

//import java.security.Permission;
import java.util.Scanner;
interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}
class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        if ("pizza".equals(order)) {
            return new Pizza();
        } else if ("cake".equals(order)) {
            return new Cake();
        }
        return null;
    }// End of getFood method
}


class Solution {
    public static void main(String args[]) {
        
        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            FoodFactory foodFactory = new FoodFactory();
            Food food = foodFactory.getFood(sc.nextLine());
            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        } 
        catch(Exception e)
        {
            System.out.println("Unsuccessful");
        }
    }
}