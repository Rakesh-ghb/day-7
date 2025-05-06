public class department{
    public static String departmentName="HR";
    public String employeeName;
    public static void main(String[] args) {
        department obj1=new department();
        department obj2=new department();
        departmentName = "Marketing";
        obj1.employeeName="john";
        obj2.employeeName="alice";
        System.out.println(department.departmentName);
        System.out.println("employeeName:" + obj1.employeeName);
        System.out.println("employeeName:"+ obj2.employeeName);
        System.out.println(department.departmentName);
        System.out.println("employeeName:" + obj1.employeeName);
        System.out.println("employeeName:"+ obj2.employeeName);

    }
}