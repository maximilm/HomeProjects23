package ru.mirea.java.practice6;



public class Student {
    private int IDnumber;
    private String name;
    private int bal;
    public Student(int IDnumber, String name,int bal) {
        this.IDnumber = IDnumber;
        this.name = name;
        this.bal = bal;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public String getName() {
        return name;
    }

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDnumber=" + IDnumber +
                ", name='" + name + '\'' +
                ", bal=" + bal +
                '}' + '\n';
    }
}
