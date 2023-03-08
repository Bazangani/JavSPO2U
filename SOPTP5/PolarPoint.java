public class PolarPoint{
	private double r;
	private double theta;


	public PolarPoint(double initr, double initheta){
		this.r = initr;
		this.theta = initheta;
	}

	public double getR(){
		return r;
	}

	public double getTheta(){
		retun theta;
	}

   // Tâche 5 : implémente la représentation polaire d’un point du plan.
   public CartesianPoint toCartesian(){  // method returns the resulting CartesianPoint object.
   	double x = r* Math.cos(theta);
   	double y = r* Math.sin(theta);


   	return new CartesianPoint(x,y);
   }


   // Tâche 6 : calculer l’image du point par une rotation autour de l’origine, d’angle α.
   public PolarPoint rotate(double alpha) {
	double newTheta = theta + alpha;
	return new PolarPoint(r, newTheta);
    }


// Tâche 7 : Ajouter une méthode public String toString() à PolarCoordinate. L’appel s.toString()
  public String toString():
    return String.format("(r = %f, theta = %f)", r, theta); //  where %f is a placeholder for a floating-point value
// Tâche 9 : Implémenter deux méthodes : CartesianPoint toCartesian() dans la classe PolarPoint qui permet de passer d’un CartesianPoint à un PolarPoint   

  public CartesianPoint toCartesian() {
    double x = r * Math.cos(theta);
    double y = r * Math.sin(theta);
    return new CartesianPoint(x, y);
  }

 // Tâche 10 : Compléter les classes PolarPoint 

    public PolarPoint translate(CartesianPoint q) {
      CartesianPoint p = this.toCartesian();
      CartesianPoint newP = p.translate(q);
      return newP.toPolar();
    }
   


} 
