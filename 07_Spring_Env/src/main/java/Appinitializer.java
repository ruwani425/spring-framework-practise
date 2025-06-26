import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-23
 */
public class Appinitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        //system environment variables
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            System.out.println(key + ": " + getenv.get(key));
        }
        System.out.println("=====================================================");
        //Access java Environment variables
        Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + ": " + properties.getProperty(key));
        }
        System.out.println("======================================================");
        String property = System.getProperty("os.name");
        System.out.println(property);
        context.registerShutdownHook();

        System.out.println("===================================================================");
    }
}
