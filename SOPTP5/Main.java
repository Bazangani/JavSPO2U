public class Main {
    public static void main(String[] args) {
        CartesianPoint p = new CartesianPoint(2, -1);
        CartesianPoint q = new CartesianPoint(0, 4);

        CartesianPoint translatedPoint = p.translate(q);

        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("Translated point = " + translatedPoint);
    }
}