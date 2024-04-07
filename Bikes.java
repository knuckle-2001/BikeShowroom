import java.util.Scanner;

public class Bikes extends Showroom implements utility{

    String bike_name ;
    String bike_color ;
    String bike_brake_type ;
    int bike_price ;
    

    @Override
    public void get_details(){
        System.out.println("NAME : "+bike_name) ;
        System.out.println("COLOR : "+bike_color) ;
        System.out.println("BRAKE TYPE : "+bike_brake_type) ;
        System.out.println("PRICE : "+bike_price) ;
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("--------------------------------Enter Bike Details----------------------------") ;
        System.out.println() ;
        System.out.println("Bike Name : ") ;
        bike_name = sc.nextLine() ;
        System.out.println("Bike Color : ") ;
        bike_color = sc.nextLine() ;
        System.out.println("Bike Brake Type : ") ;
        bike_brake_type = sc.nextLine() ;
        System.out.println("Bike Price : ") ;
        bike_price = sc.nextInt() ;







    }

}
    

