package lk.ijse.gdse72.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Girl2 implements Agreement{

    public Girl2(){
        System.out.println("Girl 2 constructor");
    }

    @Override
    public void chat() {
        System.out.println("Girl 2 is chatting...");
    }
}
