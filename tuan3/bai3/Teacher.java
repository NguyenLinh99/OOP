package tuan3.bai3;

public class Teacher {
    private String name, subjects, group;


    public Teacher(String name, String group, String subjects){
        this.name = name;
        this.group = group;
        this.subjects = subjects;
    }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){ return group; }

    public void setSubjects(String subjects){
        this.subjects = subjects;
    }
    public String getSubjects(){
        return subjects;
    }

    public void showInf(){
        System.out.println(this.name);
        System.out.println(this.group);
        System.out.println(this.subjects);
    }

    public void checkName(Teacher other){
        if(name.equals(other.name)==true) System.out.print("2 giao vien cung ten"+name);
        else System.out.print("2 giao vien khac ten");
    }

    public void checkGroup(Teacher other){
        if(group.equals(other.group)==true) System.out.print("cung day mot lop");
        else System.out.print("khong day cung lop");
    }

    public void checkSub(Teacher other){
        if(subjects.equals(other.subjects)==true) System.out.print("cung day mon"+subjects);
        else System.out.print("day khac mon");
    }

    public void swap(Teacher other){
        String temp=group;
        this.group=other.getGroup();
        other.setGroup(temp);
    }

}



