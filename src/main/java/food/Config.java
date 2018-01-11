package food;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;


@Configuration
public class Config {

    @Value("${driverClass}")
    private String driverClass;

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;

    @Value("${usernamed}")
    private String usernamed;

    @Bean
    public DataSource myDataSource() {
        DruidDataSource dds = new DruidDataSource();
        dds.setUrl(url);
        dds.setDriverClassName(driverClass);
        dds.setUsername(usernamed);
        dds.setPassword(password);
        return dds;
    }
}
