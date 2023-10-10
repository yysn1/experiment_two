package pack;


public class Student extends Person{
    int c;
    public Student(int number, String name,String sex) {
        super(number,name,sex);
        this.number = number;
        this.name = name;
        this.sex = sex;
    }

    public String toString(){
        return "Student(学生信息):  姓名：" + name
                + "    学号：" + number + "   性别：" + sex ;
    }
    void tuike() {
        c=1;
    }
    void delete() {
        if(c== 1);{
            System.out.println("学生选课信息为：");}

    }
}
