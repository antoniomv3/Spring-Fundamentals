import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        //This loads our Spring configuration file.
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Old way: Application is hard coded, not great :(
        ///SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());

        //Shows that the service bean is a single instance
        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);
    }
}
