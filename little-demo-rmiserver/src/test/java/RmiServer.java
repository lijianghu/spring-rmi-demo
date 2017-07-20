
  
  
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class RmiServer {  
  
    public static void main(String[] args) throws InterruptedException {  
        new ClassPathXmlApplicationContext("classpath*:config/spring-rmi.xml");  
          
        Object lock = new Object();  
        synchronized (lock) {  
            lock.wait();  
        }  
    }  
} 