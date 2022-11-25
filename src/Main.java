public class Main {
    public static void main(String[] args) {
        Course mat=new Course("matematik","255","mat");
        Course fizik=new Course("fizik","fzk101","FZK");
        Course kimya=new Course("kimya","kmy101","KMY");

        Teacher t1=new Teacher("ahmet","123","mat");
        Teacher t2=new Teacher("mehmet","456","FZK");
        Teacher t3=new Teacher("ayşe","78","KMY");
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Student s1 = new Student("erdinc", "101", "1",mat,fizik,kimya);
        s1.addBulkExamNote(100,100,100,100,100,100);

        Student s2 = new Student("Damla", "102","1", mat,fizik,kimya);
        s2.addBulkExamNote(100,100,100,100,100,100);




    }
}