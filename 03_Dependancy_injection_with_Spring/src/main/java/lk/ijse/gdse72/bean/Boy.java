package lk.ijse.gdse72.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    // 01. property injection

//    Girl girl = new Girl();
//
//    public void chatWithGirl(){
//        girl.chat();
//    }


//    =====================================================================================


    // 02. Constructor through injection

//    Girl girl;
//
//    public Boy(Girl girl) {
//        this.girl = girl;
//    }
//
//    public void chatWithGirl(){
//        Boy boy = new Boy(new Girl());
//        boy.chat();
//    }

//    ==========================================================================


//    02. Setter method through injection

//    Girl girl;
//
//    public void setterMethod(Girl girl) {
//        this.girl = girl;
//    }
//
//    public void chatWithGirl(){
//        Boy boy = new Boy();
//        boy.setterMethod(new Girl());
//        boy.chat();
//    }



    // HOW TO DO DEPENDANCY INJECTION IN SPRING

    @Autowired
    @Qualifier("girl2")
    Agreement girl;

    public Boy(){
        System.out.println("Boy Constructor");
    }
    public void chatWithGirl(){
        girl.chat();
    }


}
