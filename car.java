public class car{
    public static String companyName="Honada";
    public String carModel;
    public static void main(String[] args) {
        car obj1 = new car();
        car obj2 = new car();
        obj1.carModel="CIVIC";
        obj2.carModel="Accord";
        System.out.println(car.companyName);
        System.out.println("carmodel :" +obj1.carModel);
        System.out.println("carmodel :" +obj2.carModel);

    }
}
 