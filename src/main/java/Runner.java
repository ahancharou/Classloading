import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class Runner {

    public static void main (String[] args) {

        try {

            List<URL> urls = new ArrayList<URL>();
            for (String arg: args){
                urls.add(new URL(arg));
            }


            CustomClassLoader classloader = new CustomClassLoader((URL[])urls.toArray());
            Class semaphore = classloader.loadClass("Semaphore.class");

            Method method = semaphore.getMethod("lever");
            method.invoke(null);
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
