package cmput301.refactoring.exercise2;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

    public double getCharge() {
        return _movie.getCharge(this);
    }

    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }

	public PriceCode getPriceCodeObject(int _priceCode) {
		switch (_priceCode) {
		case Movie.REGULAR:
			return new Regular();
		case Movie.NEW_RELEASE:
			return new NewRelease();
		case Movie.CHILDRENS:
			return new Childrens();
		}
		return null;
	}
}
