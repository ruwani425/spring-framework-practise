package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;

    @Value("${LOGNAME}")
    private String logName;

    @Value("${db.name}")
    private String dbName;

    public SpringBean() {
        System.out.println("SpringBean constructor called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(logName);
        System.out.println("=====================================================");
        System.out.println(dbName);
    }
}
