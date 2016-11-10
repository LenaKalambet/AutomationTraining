package homeWorkLesson9;

/**
 * Created by admin on 29.10.2016.
 */
public class SchoolStudent extends Pupil{

    private int mark;
    private String graduationDate;

    public SchoolStudent(String name, String lastName, int age, char sex, int mark, String graduationDate, String educationPlace){
        super(name,lastName,age,sex, educationPlace);
        this.mark = mark;
        this.graduationDate = graduationDate;
    }

    @Override
    public void getInfo() {

        super.getInfo();
        System.out.println("Mark: " + mark);
        System.out.println("Graduation date: "+graduationDate);
    }


}
