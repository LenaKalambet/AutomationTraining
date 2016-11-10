package homeWorkLesson9;

/**
 * Created by admin on 29.10.2016.
 */
public class Student extends Pupil {
    private int stependia;
    private boolean hostel;

    public Student(String name, String lastName, int age, char sex, String educationPlace, int stependia, boolean hostel) {
        super(name, lastName, age, sex, educationPlace);
        this.stependia = stependia;
        this.hostel = hostel;
    }

    @Override
    public void getInfo() {

        super.getInfo();
        System.out.println("Stependia: " + stependia);
        System.out.println("Hostel: "+hostel);
    }
}
