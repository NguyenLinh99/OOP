package tuan2;


import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String group;
    private String email;

    public Student(){
        this.id = "000";
        this.name = "Student";
        this.group = "K60CC";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String nid, String n, String em){
        this.id = nid;
        this.name = n;
        this.email = em;
        this.group = "K62 UET";
    }

    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.group = s.group;
        this.email = s.email;
    }

    public void inputStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap MSV: ");
        id = input.nextLine();
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap lop: ");
        group = input.nextLine();
        System.out.println("Nhap email: ");
        email = input.nextLine();
    }


    public void setId(String n){
        this.id = n;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setGroup(String n){
        this.group = n;
    }
    public void setEmail(String n){
        this.email = n;
    }

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getGroup(){
        return this.group;
    }
    public String getEmail(){
        return this.email;
    }

    public String getInf(){
//        System.out.println(this.getId());
//        System.out.println(this.getName());
//        System.out.println(this.getGroup());
//        System.out.println(this.getEmail());
        return "Name :" + this.name + "  ID : " + this.id;
    }

    // tai sao lal dung this
}
