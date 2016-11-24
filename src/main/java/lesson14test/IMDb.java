package lesson14test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stas1 on 18.11.2016.
 */
public class IMDb {
    public static void main(String[] args) {

        filmRating films = new filmRating();
        films.setUpBrowser();
        films.driver.get ("http://www.imdb.com/chart/top");
        List<String> list = new ArrayList();
        List<Double> list1 = new ArrayList();
        for (int i =1;i<=250;i++) {
            list.add(films.getFilmNameById(i));
        }
        for (int i =1; i<=250;i++){
            list1.add(films.getFilmRatingById(i));
        }

        for (int i =0; i<list1.size();i++){
            if (list1.get(i)>9.0 || list1.get(i)<8.5){
                list.remove(i);
                list1.remove(i);
                i--;
            }
        }
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i)+" "+list1.get(i));
        }
        films.driver.quit();
    }
}
