package lk.ijse.gdse72.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// BEAN LIFE CYCLE

public class MyConnection implements  DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    // 01. Instantiation - the state of the object creation
    public MyConnection() {
        System.out.println("MyConnection Constructor Called");
    }

    // 02. Population properties - There is no method to find state of the properties

    // 03. Bean name aware (Bean ID)
    @Override
    public void setBeanName(String name) { // from BeanNameAware Interface
        System.out.println("MyConnection setBeanName Called");

    }

    // 04. Bean Factory Aware (DI)
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException { // from BeanFactoryAware Interface
        System.out.println("MyConnection setBeanFactory Called");
    }

    // 05. Application Context aware (AOP and DP)
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException { // from ApplicationContextAware Interface

    }

    // 06. Initialization
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection afterPropertiesSet Called");
    }

    // 07. Disposable bean
    @Override
    public void destroy() throws Exception { // from DisposableBean Interface
        System.out.println("MyConnection is destroyed");
    }
}
