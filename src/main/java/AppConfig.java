import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    //This configuration file is setting up beans to be available in the Spring application
    //If we need to change implementations down the road, we can change it here and not in every spot in code
    //Spring does not care what the method name is, just as long as beans are unique

    //Note: Beans are singletons! Only 1 will be created, calling for the bean again returns the same bean

    /*
    @Bean(name = "speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //Repository is being injected into service via the constructor
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());

        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
