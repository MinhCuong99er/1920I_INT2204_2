package com.sstudent;

public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup() == s2.getGroup());
    }
    /*public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudent(Student newStudent) {
        Student add = new Student(newStudent);
    }*/
    /*public String studentsByGroup(){

    }
    public void removeStudent(String id){

    }*/
    public static void main(String[] args) {
        Student S = new Student();
        Student X = new Student("Nguyen Huy", "12425","fg@vnu.edu.vn");
        System.out.println(sameGroup(S,X));

    }

    /*String studentsByGroup() {
        ArrayList <Student> data = new ArrayList<>(students); // tạo một danh sách mới và làm việc trên đó
        String re = "";
        while (!data.isEmpty()) {
            int i = 0;
            String thisGroup = data.get(i).getGroup();
            if (!re.equals(""))
                re += "\n";
            re += thisGroup;
            for (int j = 0; j < data.size(); ) {
                if(data.get(j).getGroup().equals(thisGroup)) {
                    if (!re.equals(""))
                        re += "\n";
                    re += data.get(j).getInfo();
                    data.remove(j);
                }
                else j++;
            }
        }
        return re;
    }

    void removeStudent(String id) {
        for (int i = 0; i < students.size(); ) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
            }
            else i++;
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            System.out.print("Scan Group: ");
            String s = sc.nextLine();
            sm.students.add(new Student("00","name",s,"asfdfd"));
        }
        sm.studentsByGroup();
    }*/
}
