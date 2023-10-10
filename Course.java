package pack;

public class Course {
    int id;
    String Coursename;
    String place;
    float time;

    public Course(String Coursename, int id, String place, float time) {
        this.id = id;
        this.Coursename = Coursename;
        this.place = place;
        this.time = time;
    }

    public String toString() {
        return Coursename + "(课程名)" + "     课程编号：" + id + "   上课地点：" + place
                + "    课程时间：" + time + "min";
    }
}