package homeWorkLesson9;

/**
 * Created by admin on 29.10.2016.
 */
public class Worker extends Human{
    private String previousPosition, currentPosition;
    private int jobExpirianceYear;
    public Worker(String name, String lastName, int age,char sex, String previousPosition, String currentPosition, int jobExpirianceYear){
        super(name,lastName,age,sex);
        this.previousPosition = previousPosition;
        this.jobExpirianceYear = jobExpirianceYear;
        this.currentPosition = currentPosition;
    }

    @Override
    public void getInfo() {

        super.getInfo();
        System.out.println("Previous work position: "+previousPosition);
        System.out.println("Current work position: "+currentPosition);
        System.out.println("Total job expiriance: "+jobExpirianceYear);
    }
}
