实验二 学生选课模拟系统


实验目的：初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；掌握面向对象的类设计方法（属性、方法）；掌握通过构造方法实例化对象；
业务要求：学校人员分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。初期为了设计简单，每名教师讲1门课程，每名学生选1门课程。
         对象：教师（编号、姓名、性别、所授课程）
         学生（编号、姓名、性别）
         课程（课程名称、编号、上课地点、教学时长）


过程：
1.建立一个包，名字叫做pack
2.创建5个类，分别为Coursae,Person,Student,Teacher,instance
3.在每个类中都设有各自的属性和不同的构建方法。
4.利用extends，把Person作为子类，继承到Student和Teacher类中。之所以利用继承性，是因为
Student和Teacher类中存在相同属性和行为，将这些内容抽取到单独一个类中，那么这两个类无需再定义这些属性和行为，只要继承Person类即可。
5.在instance类中写了一个main函数，通过对另外4个类的调用完成业务要求。


核心代码：
Person类：
package pack;
public class Person {
    int number;
    String name;
    String sex;
    public Person(int number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }
}

Student类
Student继承Person类
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

Teacher类
Teacher继承Person类
package pack;
public class Teacher extends Person {
    String lesson;
    public Teacher(int number, String name, String sex, String lesson) {
        super(number, name, sex);
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.lesson = lesson;
    }
    public String toString() {
        return "Teacher(教师信息):" + "  编号：" + number + "    姓名：" + name + "   性别：" + sex + "     所授课程：" + lesson;
    }
}

Person类作为父类，Student类和Teacher类作为子类，继承父类中所有的属性和方法。
也就是说，Student类和Teacher类中的属性继承了Person中的属性
int number;
String name;
String sex;

Student类和Teacher类中的方法继承了Person中的方法
public Person(int number, String name, String sex) {
    this.number = number;
    this.name = name;
    this.sex = sex;
}


运行结果：
![867c018bcbb4ce5be2ffc0635f93645](https://github.com/yysn1/experiment_two/assets/124029692/85785633-10fe-4e9c-8d55-7258431c353a)


实验感想：
通过这次实验，我大致了解并掌握了Java的继承性，知道了继承性是什么东西，具体怎么用。
为什么要有继承。当多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要继承那个类即可。
类继承语法规则: class Subclass extends SuperClass{ }
2.继承性的作用 继承的出现减少了代码冗余，提高了代码的复用性。 继承的出现，更有利于功能的扩展。 继承的出现让类与类之间产生了关系，提供了多态的前提。
注意：不要仅为了获取其他类中某个功能而去继承
3.继承性的说明 子类继承了父类，就继承了父类的方法和属性。 在子类中，可以使用父类中定义的方法和属性，也可以创建新的数据和方法。 在Java 中，继承的关键字用的是“extends”，即子类不是父类的子集，而是对父类的“扩展” 。
关于继承的规则： 子类不能直接访问父类中私有的(private) 的成员变量和方法。
4.java中继承性的特点 Java只支持单继承和多层继承，不允许多重继承 一个子类只能有一个父类 一个父类可以派生出多个子类 class Student extends Demo{ } //ok class Student extends Demo1,Demo2…//error
