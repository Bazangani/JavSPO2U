public class Main {
    public static void main(String[] args) {
        CartesianPoint p = new CartesianPoint(2, -1);
        CartesianPoint q = new CartesianPoint(0, 3);

        CartesianPoint translatedPoint = p.translate(q);

        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(translatedPoint.toString());
        
        Rectangle rect1 = new Rectangle(new Point(0, 0), 3, 2, Math.PI / 4);
    Vector v = new Vector(2, 3);
    Rectangle rect2 = rect1.translate(v);



    Rectangle rect1 = new Rectangle(new Point(0, 0), 3, 2, Math.PI / 4);
    double angle = Math.PI / 2;
    Rectangle rect2 = rect1.rotate(angle);


    Rectangle r1 = new Rectangle(10, 20, 30, 40);
    Rectangle r2 = r1.translate(5, 10).rotate(Math.PI/4).scale(2);
    System.out.println(r1.toSvg());
    System.out.println(r2.toSvg());



    // create a rectangle object with initial parameters
    Rectangle rect = new Rectangle(new Point(0, 0), 50, 30, 0);
    // call the recursive method with initial depth of 3
    recursiveMethod(rect, 3);
     }
}
    

public static void recursiveMethod(Rectangle rect, int depth) {
    // display the SVG representation of the rectangle
    System.out.println(rect.toSvg());
    // apply a transformation of your choice (e.g. rotation)
    Rectangle transformedRect = rect.rotate(Math.PI/4);
    // check if the recursion depth is zero
    if (depth == 0) {
        return; // terminate the method
    } else {
        // recursively call the method with the transformed rectangle and reduced depth
        recursiveMethod(transformedRect, depth - 1);
    }
}
        
        
        
        
        
    }
}
