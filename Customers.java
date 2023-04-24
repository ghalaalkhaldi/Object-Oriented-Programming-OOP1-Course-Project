
package superbrush;

public class Customers extends Person {

    public String name ; 
    public int rating ; 

    Customers(String name){
        this.name = name ; 
        rating = rating() ; 
    }
@Override
    public int rating() {
        System.out.println("1 : Great");
        System.out.println("2 : Good");
        System.out.println("3 : Ok");
        System.out.println("4 : Bad");
        System.out.print("Could you please rate the Artist from 1 to 4 : ");
        rating = SuperBrush.scanner.nextInt();
        return rating; 
    }
}
