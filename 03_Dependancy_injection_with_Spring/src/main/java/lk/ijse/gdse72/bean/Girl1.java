package lk.ijse.gdse72.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements Agreement{
//    public void chat(){
//        System.out.println("Girl is chatting");
//    }


    // HOW TO DO DEPENDANCY INJECTION IN SPRING

    public Girl1(){
        System.out.println("Girl 1 Constructor");
    }


    @Override
    public void chat() {
        System.out.println("Girl 1 is chatting...");
    }
}
