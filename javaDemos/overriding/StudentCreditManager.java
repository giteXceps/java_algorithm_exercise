package overriding;

public class StudentCreditManager extends BaseCreditManager {
    public /*final*/ /*if you do not want to override you will do final! */ double hesapla(double tutar){
        return tutar * 1.10;
    }
}

//overrided!