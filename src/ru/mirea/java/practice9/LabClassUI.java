package ru.mirea.java.practice9;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LabClassUI extends JPanel implements LabClass {
    private final int WIDTH = 1200, HEIGHT = 1200;
    private List<Student> students = new ArrayList<>();

    JLabel mainLabel = new JLabel();
    JLabel innLabel = new JLabel();
    JLabel filLabel = new JLabel();
    JTextField fio = new JTextField();
    JTextField inn = new JTextField();
    JButton Adding = new JButton(), Finding = new JButton(), Sorting = new JButton();

    JPanel[] pnl = new JPanel[3];
    JPanel[] pnlD = new JPanel[3];
    JPanel[] pnlCenterDown = new JPanel[2];
    JPanel[] pnlTop = new JPanel[3];
    JPanel[] pnlLabel = new JPanel[2];
    LabClassUI(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(new GridLayout(3, 1));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].setLayout(new GridLayout(1, 3));
        pnl[1].setLayout(new GridLayout(1, 3));
        pnl[2].setLayout(new GridLayout(1, 3));
        for(int i = 0 ; i < 3 ; i++)
        {
            pnlD[i] = new JPanel();
            pnl[2].add(pnlD[i]);
            pnlTop[i] = new JPanel();
            pnl[0].add(pnlTop[i]);
        }
        pnlD[1].setLayout(new GridLayout(2, 1));
        pnlD[0].setLayout(new GridLayout(2, 1));
        for(int i = 0 ; i < 2 ; i++)
        {
            pnlCenterDown[i] = new JPanel();
            pnlD[1].add(pnlCenterDown[i]);
            pnlLabel[i] = new JPanel();
            pnlD[0].add(pnlLabel[i]);
        }
        mainLabel.setPreferredSize(new Dimension(1200, 400));
        fio.setPreferredSize(new Dimension(400, 150));
        inn.setPreferredSize(new Dimension(400, 150));
        Adding.setPreferredSize(new Dimension(400, 400));
        Finding.setPreferredSize(new Dimension(400, 400));
        Sorting.setPreferredSize(new Dimension(400, 400));

        Font font = new Font("Times New Roman", Font.BOLD, 30);

        mainLabel.setVerticalAlignment(JLabel.CENTER);
        mainLabel.setHorizontalAlignment(JLabel.CENTER);
        mainLabel.setFont(font);
        mainLabel.setForeground(Color.BLACK);
        mainLabel.setText("Введите ФИО и ИНН");

        innLabel.setVerticalAlignment(JLabel.CENTER);
        innLabel.setHorizontalAlignment(JLabel.CENTER);
        innLabel.setFont(font);
        innLabel.setForeground(Color.BLACK);
        innLabel.setText("Введите ИНН");

        filLabel.setVerticalAlignment(JLabel.BOTTOM);
        filLabel.setHorizontalAlignment(JLabel.CENTER);
        filLabel.setFont(font);
        filLabel.setForeground(Color.BLACK);
        filLabel.setText("Введите ФИО");

        Adding.setVerticalAlignment(JLabel.CENTER);
        Adding.setHorizontalAlignment(JLabel.CENTER);
        Adding.setFont(font);
        Adding.setForeground(Color.BLACK);
        Adding.setText("Добавить студента");

        Finding.setVerticalAlignment(JLabel.CENTER);
        Finding.setHorizontalAlignment(JLabel.CENTER);
        Finding.setFont(font);
        Finding.setForeground(Color.BLACK);
        Finding.setText("Оформить заказ");

        Sorting.setVerticalAlignment(JLabel.CENTER);
        Sorting.setHorizontalAlignment(JLabel.CENTER);
        Sorting.setFont(font);
        Sorting.setForeground(Color.BLACK);
        Sorting.setText("Отсортировать студентов");

        fio.setHorizontalAlignment(JLabel.HORIZONTAL);
        fio.setFont(font);
        fio.setForeground(Color.BLACK);

        inn.setHorizontalAlignment(JLabel.CENTER);
        inn.setFont(font);
        inn.setForeground(Color.BLACK);

        pnl[1].add(mainLabel);
        pnlCenterDown[0].add(fio);
        pnlCenterDown[1].add(inn);
        pnlTop[0].add(Sorting);
        pnlTop[1].add(Adding);
        pnlTop[2].add(Finding);
        pnlLabel[0].add(filLabel);
        pnlLabel[1].add(innLabel);

        Adding.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Fio = fio.getText();
                String Inn = inn.getText();
                Student stu = new Student(Fio, Inn);
                AddStudent(stu);
            }
        });

        Sorting.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SortStudents();
            }
        });

        Finding.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Fio = fio.getText();
                String Inn = inn.getText();
                Student stu = new Student(Fio, Inn);
                FindStudent(stu);
            }
        });
    }

    @Override
    public void FindStudent(Student s) {
        boolean f = true;
        try{
            for (Student student: students){
                if (student.getName().equals(s.getName())){
                    f = false;
                    if(s.getInn().equals(student.getInn())){
                        mainLabel.setText("Заказ оформлен");
                    } else
                        throw new EmptyStringExeption();
                    break;
                }
            }
            if (f)
                throw new NotFoundStudentExeption();
        } catch (NotFoundStudentExeption err){
            mainLabel.setText("Такого студента нет в базе");
        } catch (EmptyStringExeption err){
            mainLabel.setText("Ваш ИНН недействителен");
        }
    }

    @Override
    public void AddStudent(Student s) {
        try {
            if (!(s.getName().equals("") || s.getInn().equals(""))) {
                students.add(s);
                mainLabel.setText("Студент успешно добавлен");
            } else {
                throw new EmptyStringExeption();
            }
        }
        catch (EmptyStringExeption err) {
            mainLabel.setText("Заполните все поля");
        }
    }

    @Override
    public void SortStudents() {
        Comparator<Student> comp = new SortingStudents();
        students.sort(comp);
        mainLabel.setText("Список успешно отсортирован");
    }
}
