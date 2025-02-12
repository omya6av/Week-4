package multileveluniversitycoursemanagementsystem;

public abstract class CourseType {
    String name;
    CourseType(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return (getClass().getSimpleName()+" : "+name);
    }
}
