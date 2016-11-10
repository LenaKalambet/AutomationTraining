package homeWorkLesson9;

/**
 * Created by admin on 29.10.2016.
 */
public class FootballPlayer extends Worker{
    private String team;
    public FootballPlayer(String name, String lastName, int age, char sex, String previousPosition, String currentPosition, int jobExpirianceYear, String team){
        super(name,lastName,age,sex,previousPosition,currentPosition,jobExpirianceYear);
        this.team = team;
    }
    @Override
    public void getInfo() {

        super.getInfo();
        System.out.println("Team: "+team);
    }
}
