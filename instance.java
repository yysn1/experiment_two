package pack;

public class instance {
    public static void main(String[] args) {
        Student me = new Student(2022310904, "马同学", "MAN");
        me.tuike();
        me.delete();
        System.out.println("学生信息");
        System.out.println(me);
        Teacher b = new Teacher(01, "师老师", "WOMAN", "线性代数");
        System.out.println("教师信息");
        System.out.println(b);
        Course c = new Course("线性代数", 17, "207", 90f);
        System.out.println("课程信息");
        System.out.println(c);

    }
}