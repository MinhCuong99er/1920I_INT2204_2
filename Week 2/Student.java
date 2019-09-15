package com.sstudent;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getGroup() {
        return group;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static String getInfo(Student A) {
        return A.name + " - " + A.id + " - " + A.group + " - " + A.email;
    }
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }
    public Student(String _name, String _id, String _email) {
        this.name = _name;
        this.id = _id;
        this.group = "K62CB";
        this.email = _email;
    }
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public static void main(String[] args) {
        Student S = new Student();
        System.out.println(getInfo(S));
        Student X = new Student("Nguyen Huy", "12425","fg@vnu.edu.vn");
        System.out.println(getInfo(X));
        Student B = new Student(S);
        System.out.println(getInfo(B));
    }

}
