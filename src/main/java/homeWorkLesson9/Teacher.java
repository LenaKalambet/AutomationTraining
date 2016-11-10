package homeWorkLesson9;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;

/**
 * Created by admin on 29.10.2016.
 */
public class Teacher extends Worker{
    private String subject;
    public Teacher(String name, String lastName, int age, char sex, String previousPosition, String currentPosition, int jobExpirianceYear, String subject){
        super(name,lastName,age,sex,previousPosition,currentPosition,jobExpirianceYear);
        this.subject = subject;
    }

    @Override
    public void getInfo() {

        super.getInfo();
        System.out.println("Subject: "+subject);
    }
}
