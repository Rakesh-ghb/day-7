public class product {
   public static String category=" Electronics"; 
   public String productName;

public static void main(String[]args){
    product obj1=new product();
    product obj2=new product();
    obj1.productName="laptop";
    obj2.productName="smartphone";
    System.out.println("category");
    System.out.println("productName :"+obj1.productName);
    System.out.println("productName:"+ obj2.productName);
}
}
