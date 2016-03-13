package question3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by student on 2016/03/13.
 */
@Configuration
public class Configurations {
    @Bean(name="impl")
    public Names getService(){
        return new ImplementNames();
    }
}
