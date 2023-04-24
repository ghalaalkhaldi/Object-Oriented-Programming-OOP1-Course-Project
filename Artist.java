package superbrush;
public class Artist extends Person {

    public double drawingPrice;
    public int drawId;
    public String typeOfDrwaing;

    public Artist() {
    }

    public Artist(String name, int number, String typeOfDrwaing , double drawingPrice) { 
        super(name, number);
        this.typeOfDrwaing = typeOfDrwaing;
        this.drawingPrice = drawingPrice;
    }

    public Artist(double drawingPrice, int drawId) {
        this.drawingPrice = drawingPrice;
        this.drawId = drawId;
    }

    public String getTypeOfDrwaing() {
        return typeOfDrwaing;
    }

   
    @Override
    public int rating() {
        System.out.println("1 : Great");
        System.out.println("2 : Good");
        System.out.println("3 : Ok");
        System.out.println("4 : Bad");
        System.out.print("Could you please rate the Customer from 1 to 4 : ");
        int rating = 0;
        rating = SuperBrush.scanner.nextInt();
        return rating;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}