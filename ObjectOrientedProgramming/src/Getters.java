public class Getters {
    public static void main(String[] args) {
        pen p1= new pen();  //created pen object p1
        p1.setColor("red");
        p1.setTip(24);
//        System.out.println(p1.color);
        System.out.println(p1.getColor());
//        System.out.println(p1.tip);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
//        System.out.println(p1.color);
//        p1.color="green";//directly we have changed the value of string if therre it was the password .then it can be modified easyly.here concept comes of acces modifiers
//        System.out.println(p1.color);

        BankAccount ba1=new BankAccount();
        ba1.username="ganesh Shinde";
//        ba1.password="mahesh";
        //cannot acces password because string password is private but we can create the function
        ba1.setPassword("Mahesh");
    }
}

class pen{
   private String color;
   private int tip;

    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newTip){
        tip=newTip;
    }

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

}

class Student{
    String name;
    int age;
    float percentage;

    void percentage(int a,int b,int c){}

}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String newpass){
        password=newpass;
    }
}
