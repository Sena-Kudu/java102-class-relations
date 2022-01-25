package java102;

public class Main {

    public static void main(String[] args){

        Student student = new Student("Sena","Kudu","1","address",90);
        Student student2 = new Student("Fatma","Kudu","2","address",90);
        Student student3 = new Student("Metehan","Başol","3","address",90);
        //student.setNote(-100);
        System.out.println(student3.getNote());

        //There is a Composition
        Instructor teacher = new Instructor("Mahmut","Hüseyin","CENG");
        Course mat = new Course("mat101","MAT",teacher);
        Course com = new Course("COM101","com",teacher);
        System.out.println(mat.getInstructor().getName());

        Student[] stu = {student,student2,student3};

        System.out.println("Ortalama: "+mat.calcAvarage(stu));

    }
}
