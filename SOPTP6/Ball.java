public class Ball {


// Ajouter les propriétés nécessaires à la classe Ball. Donner des noms explicites (p, v, m ne sont pas sufsants).

    private Vector p; // Position de la balle
    private Vector v; // Vélocité de la balle
    private double m; // Masse de la balle

// 5. Pour caractériser la dynamique de la balle, il nous faut deux paramètres supplémentaires :


    private static final Vector GRAVITY = new Vector(0, -9.807); // Gravité
    private static final double REBOUND_LOSS = 0.9; // Perte de vitesse lors d'un rebond



// constructeur pour une balle avec vélocité nulle    

    public Ball(Vector p, double m) {
        this.p = p;
        this.v = new Vector(0, 0); // Vélocité initiale nulle;
        this.m = m;
    }


//    4. Ajouter deux méthodes retournant les valeurs de la position et de la vélocité de la balle.

    
    public Vector getPosition() {
        return this.p;
    }

    public Vector getVelocity() {
        return this.v;
    }


//    6. Dans notre modèle simplié, la balle subit comme seule force la gravité. Cette force est donnée par m~g. Écrire une méthode privée getForce() calculant la force subie par la balle

     private Vector getForce() {
        return GRAVITY.times(this.m);
    }


// 7.  Méthode privée pour calculer l'accélération subie par la balle
     private Vector getAcceleration() {
         return getForce().times(1.0 / this.m);
    }


// 8.    Méthode privée pour mettre à jour la vélocité de la balle
     private void updateVelocity(double dt) {
        Vector dv = getAcceleration().times(dt);
        this.v = this.v.plus(dv);  //The updated velocity is stored back in this.v.
    }

// 9.    Méthode privée pour mettre à jour la vélocité de la balle

     private void updatePosition(double dt) {
        Vector dp = this.v.times(dt);
        this.p = this.p.plus(dp); // The updated position is stored back in this.p.
    }

// 10.    This method first updates the velocity and position of the ball by calling the updateVelocity(dt) and updatePosition(dt) methods.
// After that, it checks if the ball has hit the ground by comparing the y coordinate of its position with 0.
// If the y coordinate is less than 0, it means the ball has hit the ground, so we need to make it bounce. 
    //To do that, we use the reflect() method of the Vector class to compute the symmetric position and velocity with respect to the ground plane.
    // We then multiply the velocity by the REBOUND_LOSS constant to simulate energy loss during the bounce.

     public void update(double dt) {
        updateVelocity(dt);
        updatePosition(dt);

        // Si la balle touche le sol, on la fait rebondir
        if (this.p.getY() < 0) {
           // On calcule la nouvelle position et vélocité symétrique par rapport à y = 0
           Vector newP = this.p.reflectY();
           Vector newV = this.v.reflectY().times(REBOUND_LOSS);

        // On met à jour la position et la vélocité de la balle
        this.p = newP;
        this.v = newV;
        }
    }

// 12.    Ajouter dans la classe Ball une méthode tryRebound efectuant le rebond si nécessaire.
    public void tryRebound() {
        if (position.getY() < 0) { // if ball below ground level
           position = position.reflectY(); // reflect position around the ground
           velocity = velocity.reflectY().scalarMultiply(REBOUND_LOSS); // reflect velocity and reduce speed
        }
    }

// 13.    Ajouter à la méthode update un appel à la méthode tryRebound.
    public void update(double dt) {
        updateVelocity(dt); // update velocity first
        updatePosition(dt); // update position using the new velocity
        tryRebound(); // check for rebound and update position and velocity if necessary
    } 



    public double getMass() {
        return this.m;
    }

    // Mutateurs pour les attributs de la classe Ball
    public void setPosition(Vector p) {
        this.p = p;
    }

    public void setVelocity(Vector v) {
        this.v = v;
    }

    public void setMass(double m) {
        this.m = m;
    }
}
