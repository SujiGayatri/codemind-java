class ConstructorOverloading{
    public static void main(String[] args) {
        Constructor c1=new Constructor("kavya");
         Constructor c2=new Constructor("kavya",12);
         Constructor c3=new Constructor("kavya",12,'F');
          Constructor c4=new Constructor("kavya",12,'F',"12345893");

    }
}
 class Constructor{
    String name;
    int age;
    char gender;
    String contact_Number;
    Constructor(){
        System.out.println("Default Constructor");
    }
    Constructor(String name){
        this.name=name;
        System.out.println("name:"+name);
    }
    Constructor(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
    }
    Constructor(String name,int age,char gender){
        this(name,age);
        this.gender=gender;
         System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender"+gender);
    }
    Constructor(String name,int age,char gender,String contact_Number)
    {
        this(name,age,gender);
        this.contact_Number=contact_Number;
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender"+gender);
        System.out.println("contactNumber:"+contact_Number);
    }
}
