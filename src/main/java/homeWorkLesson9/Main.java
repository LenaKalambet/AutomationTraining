package homeWorkLesson9;

/**
 * Created by admin on 29.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human someHuman = new Human("Masha","Petrova",21,'f');
        Pupil somePupil = new Pupil("Stas","Boichenko", 23,'m', "NTUU KPI");
        SchoolStudent someSchoolStudent = new SchoolStudent("Alex", "Baranov", 15, 'm', 5, "10.10.2020", "Big Cool School");
        Student someStudent = new Student("Olena", "Kalambet", 20, 'f',"NTUU KPI", 751,true);
        Worker someWOrker = new Worker("Jonathan", "Lymer", 30,'m',"Manager", "Big manager",5);
        Teacher someTeacher = new Teacher ("Iryna", "Kalambet", 50, 'f',"Usual teacher","Cool teacher",25,"Math");
        FootballPlayer someFootballPlayer = new FootballPlayer("Jack", "Sparrow", 35,'m',"Footballplayer","Cool Footbalplayer", 3,"Real-Gorlovka");
        System.out.println("\n\nHERE IS SOME INFO ABOUT HUMAN!!!!\n\n");
        someHuman.getInfo();
        System.out.println("\n\nHERE IS SOME INFO ABOUT PUPIL!!!!\n\n");
        somePupil.getInfo();
        System.out.println("\n\nHERE IS SOME INFO ABOUT SCHOOL STUDENT!!!!\n\n");
        someSchoolStudent.getInfo();
        System.out.println("\n\nHERE IS SOME INFO ABOUT STUDENT!!!!\n\n");
        someStudent.getInfo();
        System.out.println("\n\nHERE IS SOME INFO ABOUT WORKER!!!!\n\n");
        someWOrker.getInfo();
        System.out.println("\n\nHERE IS SOME INFO ABOUT TEACHER!!!!\n\n");
        someTeacher.getInfo();
        System.out.println("\n\nHERE IS SOME INFO ABOUT FOOTBALL PLAYER!!!!\n\n");
        someFootballPlayer.getInfo();
    }
}
