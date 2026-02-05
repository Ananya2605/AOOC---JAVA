
import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    public void setDim(int alength, int abreadth){
        this.length = alength;
        this.breadth = abreadth;

    }
    public int getArea(){
        return length*breadth;
    }


    public static void main(String[] args) {
        Area ar = new Area();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Length :");
        int length = sc.nextInt();

        System.out.println(" Enter the Breadth :");
        int breadth = sc.nextInt();
        ar.setDim( length, breadth);
        System.out.println(" Area of the rectangle is : " + ar.getArea());
    }
}
