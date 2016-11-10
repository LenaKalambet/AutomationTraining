package homeWorkLesson8;

import java.io.IOException;

/**
 * Created by admin on 27.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        AkinatorTest test = new AkinatorTest();
        test.setUpBrowser();
        test.trySelenium();
        test.tearDown();
    }
}
