public class Main {
    public static void main(String[] args) {
        CartesianPoint p = new CartesianPoint(2, -1);
        CartesianPoint q = new CartesianPoint(0, 3);

        CartesianPoint translatedPoint = p.translate(q);

        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(translatedPoint.toString());
    }
}
