package overriding;

public class Main {
    public static void main(String[] args){
        BaseCreditManager[] creditManagers = new BaseCreditManager[]
            {new OgretmenCreditManager(), new TarimCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager: creditManagers){
            double sum = creditManager.hesapla(1000);
            System.out.println(sum);
        }
    }
}
