package lesson9.package1;

import org.testng.annotations.Test;

/**
 * Created by admin on 28.10.2016.
 */
public class Incapsilation2 {

    @Test
    public void testIncapsulation(){
        IncapsulationExample incEx = new IncapsulationExample();
        incEx.age = 30;
        incEx.isTrue = true;

    }
}
