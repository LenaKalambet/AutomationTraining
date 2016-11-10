package homeWorkLesson9;

/**
 * Created by admin on 29.10.2016.
 */
public class Human {

    private String name;
    private String lastName;
    private int age;
    private char sex;



    public Human (String name, String lastName, int age, char sex ){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void getInfo(){

        System.out.println("Name: "+name);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
        System.out.println("Sex: "+sex);

    }




}
