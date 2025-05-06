public class config {
    public static String configName="System config";
        public String settingvalue;
        public static void main(String[] args) {
           config obj1= new config();
           config obj2= new config();
           obj1.settingvalue= "dark mode";
           obj2.settingvalue="Light mode";
        System.out.println("configName :"+ configName);
        System.out.println("settingvalue1 :"+ obj1.settingvalue);
        System.out.println("settingvalue2 :"+ obj2.settingvalue);
        
    
        }
     }
    
