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
}
