import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //This configuration file is setting up beans to be available in the Spring application
    //If we need to change implementations down the road, we can change it here and not in every spot in code
    //Spring does not care what the method name is, just as long as beans are unique

    //Note: Beans are singletons! Only 1 will be created, calling for the bean again returns the same bean

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        //Repository is being injected into service via the constructor
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
