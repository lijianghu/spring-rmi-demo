
  
  
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.timesaving.web.service.AccountService;
  
public class RmiClient {  
  
    private static final Logger LOG = Logger.getLogger(RmiClient.class);  
      
    public static void main(String[] args) {  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:config/spring-rmi.xml");  
        AccountService accountService = (AccountService) ctx.getBean("rmiProxyService");  
        String result = accountService.getName("admin");
        LOG.info(result);  
    }  
  
} 