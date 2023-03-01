package MyPackage;

public class Main {
public static void main(String[] args) {
	Movie m = new Movie();
	m.setMovieName("3 Idiot");
	m.setMovieStartTime(11.30);
	m.setMovieEndTime(2.30);
	m.setMovieAmount(170);
	
	System.out.println("Movie Name is:" + m.getMovieName());
	System.out.println("Movie Start Time is:"+m.getMovieStartTime());
	System.out.println("Movie End Time is :"+ m.getMovieEndTime());
	System.out.println("Movie Amount is:"+m.getMovieAmount());
}
}
