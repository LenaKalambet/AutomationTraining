package lesson10;

import static java.lang.StrictMath.abs;

/**
 * Created by admin on 03.11.2016.
 */
public class filmMain {
    public static void main(String[] args) throws InterruptedException {
        double IMDBRating;
        double KinopoiskRating;
        filmRating films = new filmRating();
        films.setUpBrowser();
        films.setUpBrowser1();
        films.driver.get ("http://www.imdb.com/chart/top");
        films.driver1.get("https://www.kinopoisk.ru/");
        for (int ID = 1; ID <=250;ID++) {
            String filmName = films.getFilmNameById(ID);
            IMDBRating = films.getFilmRatingById(ID);
            KinopoiskRating = films.getFilmRatingByNameKinopoisk(filmName);
            System.out.println("Film: "+filmName+"    IMDb Rating: "+IMDBRating+"    Kinopoisk Rating: "+KinopoiskRating);
        }
    }
}
