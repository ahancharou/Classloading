import java.util.Scanner;

public class Runner {

    public static void main (String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter class name : ");
            String className = in.nextLine();
            try {
                CustomClassLoader classLoader = new CustomClassLoader();
                classLoader.invokeClassMethod("com.epam.mentoring.lessone."+className, "lever");
                return;
            }
            catch (Throwable e){
                System.out.println("Can't find "+className+", try again!");
            }
        }
    }

}
