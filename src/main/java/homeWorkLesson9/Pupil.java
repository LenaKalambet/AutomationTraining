package homeWorkLesson9;

/**
 * Created by admin on 29.10.2016.
 */
public class Pupil extends Human{
    private String educationPlace;

    public Pupil(String name,String lastName, int age, char sex, String educationPlace){
        super(name,lastName,age,sex);
        this.educationPlace = educationPlace;
    }


    @Override
    public void getInfo() {

        super.getInfo();
        System.out.println("Education place: "+educationPlace);
    }
}
