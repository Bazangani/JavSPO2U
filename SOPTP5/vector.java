public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getMagnitude() {
        return Math.sqrt(x*x + y*y);
    }

    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y);
    }

    public Vector subtract(Vector v) {
        return new Vector(x - v.x, y - v.y);
    }

    public double dotProduct(Vector v) {
        return x*v.x + y*v.y;
    }

    public double angleBetween(Vector v) {
        double dot = dotProduct(v);
        double mag = getMagnitude() * v.getMagnitude();
        return Math.acos(dot/mag);
    }

    public Vector opposite() {
        return new Vector(-x, -y);

    } 
    

    public Vector multiply(double scalar) {
        return new Vector(x * scalar, y * scalar);
    }   


    public Vector rotate(double angle) {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        double newX = x * cos - y * sin;
        double newY = x * sin + y * cos;
        return new Vector(newX, newY);
    }

    public double getNorm() {
        return Math.hypot(x, y);
    }
}
