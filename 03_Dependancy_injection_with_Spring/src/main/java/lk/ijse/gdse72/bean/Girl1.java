package lk.ijse.gdse72.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//Agreement eken class dekak implement wela tibba.e nisa default kagenda reference eka wetenna ona kiyala me annotation eken define kara
//Qualifier annotation eka dala netnm meka tama wetenne
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
