public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
     int verbalGrade;
    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.verbalGrade=0;


    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            System.out.println("işlem başarılı");
        }else {
            System.out.println(t.name+"akademisyen bu dersi veremez");
        }

    }

}
