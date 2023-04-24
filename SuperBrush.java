package superbrush;
import java.util.Scanner;
import java.util.ArrayList;

public class SuperBrush {

  public static Scanner scanner = new Scanner(System.in);
  public static ArrayList<Artist> artists = new ArrayList<>();
  public static ArrayList<Customers> costumersList = new ArrayList<>();
  public static ArrayList<Artist> likedArtists = new ArrayList<>();
  public static ArrayList<Artist> buyList = new ArrayList<>();

  public static void main(String[] args) {

    artists.add(new Artist("John", 1121, "abstract art" , 500));
    artists.add(new Artist("Aldon", 1512, "decorative art", 100));
    artists.add(new Artist("Jack", 1771, "engineering art" , 200));
    artists.add(new Artist("Nail", 1851, "Abstract art & Expressionism" , 300));

    System.out.println("Artist: ");
    for (int i = 0; i < artists.size(); i++) {
      System.out.println(artists.get(i).toString() + ", and type of drawing: " + artists.get(i).typeOfDrwaing);
       }

    System.out.println();
    
    System.out.print("How Many Drawing Did You Like ? : ");
    int howMany = scanner.nextInt() ;
    for(int i = 0 ; i < howMany ; i++){
      System.out.print( (i+1)  + ". Please Enter The Drawing ID You Liked : ");
      int drawIdInput = scanner.nextInt() ; 
      for(int j = 0 ; j < artists.size() ; j++){
        if( artists.get(j).getNumber() == drawIdInput ){
          likedArtists.add(artists.get(j));
        }
      }
    }
    
    System.out.println();

    System.out.println("The Liked Drawings Are ");
    for(int i = 0 ; i < likedArtists.size() ; i++){
      System.out.println(likedArtists.get(i).getNumber() + " By " + likedArtists.get(i).getName());
    }
     System.out.println();

    System.out.print("Would You Like To Buy Anyone Of Them ? ( Y / N ) : ");
    char c = scanner.next().charAt(0);
    while(c == 'y' || c == 'Y'){
      System.out.print("Which One Would You Like To Buy ? (ID) : ");
      int likedToBuy = scanner.nextInt();
      for(int i = 0 ; i < likedArtists.size() ; i++){
        if(likedArtists.get(i).getNumber() == likedToBuy){
          buyList.add(likedArtists.get(i)) ; 
        }
      }
      System.out.print("Would You Like To Buy Another One ? ( Y / N ) : ");
      c = scanner.next().charAt(0);
      if(c == 'y' || c == 'Y'){
        continue ; 
      } else {
        break ; 
      }
    }
    int total = 0 ; 
    for(int i = 0 ; i < buyList.size() ; i++){
      total += buyList.get(i).drawingPrice ; 
    }

    System.out.println();
    
    System.out.println("Your Total Is " + total);
     System.out.println("-------------------------------");
    System.out.println("Please Go To The Cashier");
    
    char choice;

    do {
      System.out.print("Would You Like To Add Rating (Y) : ");
      choice = scanner.next().charAt(0);
      if (choice != 'Y' && choice != 'y') {
        break;
      }
      System.out.print("Please Enter Your Name : ");
      String name = scanner.next();
      costumersList.add(new Customers(name));

    } while (true);

    for(int i = 0 ; i < costumersList.size(); i++) {
      String rating = (costumersList.get(i).rating > 2) ? (costumersList.get(i).rating > 3)? "Bad" : "Ok"  : (costumersList.get(i).rating > 1) ? "Good" : "Great" ;  
      System.out.println("Customers Name : " + costumersList.get(i).name + " Rating : " + rating);
    }
    
    System.out.println("Thank You For Visiting Us.");



  }

}
