import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomClassLoader extends ClassLoader{
    public void invokeClassMethod(String classBinName, String methodName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            ClassLoader classLoader = this.getClass().getClassLoader();
            Class loadedMyClass = classLoader.loadClass(classBinName);
            System.out.println("Loaded class name: " + loadedMyClass.getName());
            Constructor constructor = loadedMyClass.getConstructor();
            Object myClassObject = constructor.newInstance();
            Method method = loadedMyClass.getMethod(methodName);
            System.out.println("Invoked method name: " + method.getName());
            method.invoke(myClassObject);
    }
}