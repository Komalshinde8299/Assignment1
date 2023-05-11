public class ExplainStatic {
    static int num = 12;
    public static void getAdd(){
        System.out.println("this is static method we dont need to create object to call this method");

    }
    static{
        System.out.println("Static block always execute berfor the main method ");
    }

    public static void main(String[] args) {
        System.out.println("we are able to acess static variable inside" +
                " any menthod by using veriable name " + "vale of variable "+num);
         getAdd();



    }

}
