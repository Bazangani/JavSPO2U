public class Rectangle {
    private Point p;  // position of one of the vertices
    private double width;  // width of the rectangle
    private double height;  // height of the rectangle
    private double theta;  // angle between pq and the horizontal axis

    public Rectangle(Point p, double width, double height, double theta) {
        this.p = p;
        this.width = width;
        this.height = height;
        this.theta = theta;
    }

    public Point getP() {
        return p;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getTheta() {
        return theta;
    }

     public Rectangle translate(Vector v) {
        Point newP = new Point(p.getX() + v.getX(), p.getY() + v.getY());
        return new Rectangle(newP, width, height, theta);
    }


    public Rectangle rotate(double angle) {
        // Compute the new position of vertex p after rotation
        double newX = p.getX() * Math.cos(angle) - p.getY() * Math.sin(angle);
        double newY = p.getX() * Math.sin(angle) + p.getY() * Math.cos(angle);
        Point newP = new Point(newX, newY);

        // Compute the new angle of the rectangle
        double newTheta = theta + angle;

        // Return the new rectangle with the same width and height as the original
        return new Rectangle(newP, width, height, newTheta);
    }

        public Rectangle scale(double factor) {
        // Compute the new width and height of the rectangle
        double newWidth = width * factor;
        double newHeight = height * factor;

        // Compute the new position of vertex p after scaling
        double newX = p.getX() * factor;
        double newY = p.getY() * factor;
        Point newP = new Point(newX, newY);

        // Return the new rectangle with the new width, height, and position of p
        return new Rectangle(newP, newWidth, newHeight, theta);
    }

       public String toSvg() {
        StringBuilder sb = new StringBuilder();
        sb.append("<rect ");
        sb.append("x='").append(this.x).append("' ");
        sb.append("y='").append(this.y).append("' ");
        sb.append("width='").append(this.width).append("' ");
        sb.append("height='").append(this.height).append("' ");
        sb.append("transform='rotate(").append(this.angle).append(" ")
          .append(this.centerX).append(" ").append(this.centerY).append(")' ");
        sb.append("/>");
        return sb.toString();
    }
}
