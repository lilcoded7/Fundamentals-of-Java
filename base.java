import java.util.Date;


public class base {
    public void referenceTypes(){
        Date now = new Date();
        System.out.println(now);

    }
    public static void main(String[] args){
        // These are primitive types
        byte age = 20;
        long viewsCount = 3_434_433_554_433L;
        float price = 30.434F;
        char letter = 'A';
        boolean isEligible = false;


        System.out.println("hello Coded");

        base ref = new base();
        ref.referenceTypes();
    }
    
}
