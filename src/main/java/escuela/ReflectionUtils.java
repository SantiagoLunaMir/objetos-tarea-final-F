package escuela;

import java.lang.reflect.Constructor;

public class ReflectionUtils {
    public static <T> Constructor<T> getDeclaredConstructor(Class<T> clazz) throws NoSuchMethodException {
        return clazz.getDeclaredConstructor();
    }
}
