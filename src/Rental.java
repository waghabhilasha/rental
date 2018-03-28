
public class Rental {
	
	     private movie _movie;
	     private int _daysRented;

	     public Rental(movie movie, int daysRented) {
	       _movie = movie;
	       _daysRented = daysRented;
	     }
	     public int getDaysRented() {
	       return _daysRented;
	     }
	     public movie getMovie() {
	       return _movie;
	     } 
	 }

