package lesson10;

/**
 * Created by admin on 03.11.2016.
 */
public class filmRating_Const {
    public static String getFilmNameXpathByID(int ID) {
        String xpath = ".//*[@id='main']/div/span/div/div/div[3]/table/tbody/tr["+ID+"]/td[2]/a";
        return xpath;
    }
    public static String getFilmRatingXpathByID(int ID) {
        String xpath = ".//*[@id='main']/div/span/div/div/div[3]/table/tbody/tr["+ID+"]/td[3]/strong";
        return xpath;
    }

}
