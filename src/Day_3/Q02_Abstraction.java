//Create a class Rectangle with width and height. Add method to calculate area.
package Day_3;

class Rectangle{
    float width;
    float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    float area(){
        return width * height;
    }
}
public class Q02_Abstraction {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println("Area of rectangle is : "+r.area());


    }
}
