/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Point otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        int currentPoint = distance();
        int otherPoint = otherObj.distance();

        if (xcor == otherObj.xcoor() && ycor == otherObj.ycoor() ) return 0;
        if (currentPoint == otherPoint) return 0;
        return currentPoint - otherPoint;


    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

    public int distance() {
        return (int)(xcor * xcor + ycor * ycor);
    }

    public double xcoor() {
        return xcor;
    }

    public double ycoor() {
        return ycor;
    }


}
