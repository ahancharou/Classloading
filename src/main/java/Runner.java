import java.lang.reflect.Method;
public class Runner {

    public static void main (String[] args) {

        try {

            CustomClassLoader classloader = new CustomClassLoader(Runner.class.getClassLoader());

            Class semaphore = classloader.loadClass("com.epam.mentoring.lessone.Semaphore.class");

            Method method = semaphore.getMethod("lever");
            method.invoke(null);
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
