import java.util.*;

class Student{
    int id;
    double cgpa;
    String name;
    
    public Student(int id, double cgpa, String name){
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }
    
    public int getID(){
        return id;
    }
    
    public double getCgpa(){
        return cgpa;
    }
    
    public String getName(){
        return name;
    }
}

class Sorting implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getCgpa()==s2.getCgpa()){
            if(s1.getName().equals(s2.getName())){
                return s1.getID() - s2.getID();
            }
            else{
                return s1.getName().compareTo(s2.getName());
            }
        }
        else{
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
        }
        
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> list = new PriorityQueue<>(events.size(), new Sorting());
        List<Student> studentList = new ArrayList<>();
        
        for(int i=0;i<events.size();i++){
            String _str = events.get(i);
            if(_str.equals("SERVED")) {
                list.poll();
                
            }
            else {
                String[] str = _str.split(" ");
                String name = str[1];
                double cpga = Double.parseDouble(str[2]);
                int id = Integer.parseInt(str[3]);
                list.add(new Student(id, cpga, name));
            }
        }
        
        for(Student student : list){
            studentList.add(student);
        }
        return studentList;
    }
}