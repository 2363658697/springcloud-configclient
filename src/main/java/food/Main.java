package food;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@RefreshScope
@SpringBootApplication   //必须添加SpringBootApplication 启用spring的自动配置功能
public class Main {
	/**
	 * just run springboot启动的方法
	 */
	public static void main(String[] args) {
		//启动会加载自动配置 
		SpringApplication.run(Main.class, args);
	}
}
