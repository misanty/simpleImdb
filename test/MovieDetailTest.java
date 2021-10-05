import java.time.LocalDate;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.egitim.entity.Cast;
import org.egitim.entity.FilmCategory;
import org.egitim.entity.Movie;
import org.egitim.entity.MovieDetail;
import org.egitim.entity.PersonRoles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovieDetailTest {

	@BeforeEach
	void setUp() throws Exception {
	
	}

	@Test
	void test() {
		Movie mv = new MovieDetail();
		mv.setTitle("Ghost in the Shell");
		mv.setDescription("is a movie adapted by an anime");
		mv.setReleaseDate(LocalDate.of(12,12,12));
		mv.setCategory(EnumSet.of(FilmCategory.ACTION,FilmCategory.CYBERPUNK,FilmCategory.SCI_FI));
		MovieDetail detail = (MovieDetail) mv;
		
		detail.setCasting(new HashMap<Cast,EnumSet<PersonRoles>>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{put(new Cast("Scarlet","Johnson",LocalDate.of(1970, 12, 12)),EnumSet.of(PersonRoles.ACTOR, PersonRoles.DIRECTOR));}
		});
		
		System.out.println(mv.getTitle());
		System.out.println(mv.getDescription());
		
		mv.getCategory().forEach(System.out::println);
		for (Map.Entry<Cast, EnumSet<PersonRoles>> ite : detail.getCasting().entrySet()) {
			
			System.out.println("Artist: " + ite.getKey().getName() +" "+ite.getKey().getLastName());
			ite.getValue().forEach(System.out::print);
		}
		
		//fail("Not yet implemented");
	}

}
