import java.util.*;
public class SetTest {
    public static void main(String[] args)
    {
        Set<String> strSet=new HashSet<>();
        strSet.add("Java");
        strSet.add("Git");
        strSet.add("Java");

        System.out.println("strSet="+strSet);
        System.out.println("size="+strSet.size());

        Set<Student> set1=new HashSet<>();
        set1.add(new Student("张三",18));
        set1.add(new Student("张三",18));
        System.out.println(set1.size());

        Set<Student> set2 =new HashSet<>();
        set2.add(new Student("张三",18));
        set2.add(new Student("张三",18));
        System.out.println(set2.size());
    }
    static class Student
    {
        private String name;
        private int age;

        public Student(String name,int age)
        {
            this.name=name;
            this.age=age;
        }

            @Override
            public boolean equals(Object o)
            {
                if (this==o) return true;
                if(o==null||getClass()!=o.getClass()) return false;
                Student student=(Student) o;
                return age==student.age&&Objects.equals(name,student.name);
            }
            @Override
            public int hashCode()
            {
                return Objects.hash(name,age);
            }


    }

}
