public class CartesianPoint {
    private int x;
    private int y;
    
    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getters and setters for x and y
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    // Method to translate the point  (creates a new point obtained by translating the original point by the vector Oq. The translated point should have coordinates of (0,3), and the original p and q points should not be modified.)
    public CartesianPoint translate(CartesianPoint q) { //  takes in a CartesianPoint object q as a parameter.
        int newX = this.x + q.getX();
        int newY = this.y + q.getY();
        return new CartesianPoint(newX, newY);
    }
    public toString(){
        return "(x = " + x + "," + "y = " +y + ")";
    }


    // Tâche 9 : Implémenter deux méthodes PolarPoint toPolar() dans la classe CartesianPoint qui permet de passer d’un CartesianPoint à un PolarPoint
    public PolarPoint toPolar() {
    double r = Math.sqrt(x * x + y * y);
    double theta = Math.atan2(y, x);
    return new PolarPoint(r, theta);
    }

    // Tâche 10 : Compléter les classes CartesianPoint

    public CartesianPoint rotate(double alpha) {
        double newX = x * Math.cos(alpha) - y * Math.sin(alpha);
        double newY = x * Math.sin(alpha) + y * Math.cos(alpha);
        return new CartesianPoint(newX, newY);

 
}
