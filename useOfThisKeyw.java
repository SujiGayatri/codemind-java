class Stu{
    String name;
    int age;
    char gender;
    String college;String branch;
    Stu(String name,int age,char gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    Stu(String name,int age,char gender,String college,String branch)
    {
        this(name,age,gender);
        this.college=college;
        this.branch=branch;
    }
    void print()
    {
        System.out.println(this);
    }
}
public class useOfThisKeyw {
    public static void main(String[] args)
    {
        Stu s1=new Stu("rst",17,'F');
        System.out.println(s1);
        s1.print();
    }
}
