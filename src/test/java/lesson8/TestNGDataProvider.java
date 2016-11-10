package lesson8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by admin on 24.10.2016.
 */
public class TestNGDataProvider {

    @DataProvider
    public Object[][] emails(){
        return new Object[][]{

                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@spaqweqwerrow.com", "1234"},
                {"Jack@spar222row.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparr333ow.com", "1234"},
                {"0", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
                {"Jack@sparrow.com", "1234"},
        };
    }


    @Test(dataProvider = "emails")
    public static void emailValidation (String email, String pass){
        System.out.println(email);
        System.out.println(pass);



    }
}
