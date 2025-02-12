package multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;

public class Course <T extends CourseType>{
    ArrayList<T> list=new ArrayList<>();

    public void addItem(T item){
        list.add(item);
    }
    public ArrayList<T> getList(){
        return list;
    }
}
