package university.management.system;

//import java.awt.HeadlessException;
//import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener{

    public Project(){
        setSize(1540, 850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg")) ;
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT) ;
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
//        new information
        JMenu newInformation = new JMenu("New Information") ;
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation) ;
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem StudentInfo = new JMenuItem("New Student Information");
        StudentInfo.setBackground(Color.WHITE);
        StudentInfo.addActionListener(this);
        newInformation.add(StudentInfo);
        
//        details 
        JMenu details = new JMenu("View Details") ;
        details.setForeground(Color.RED);
        mb.add(details) ;
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem Studentdetails = new JMenuItem("View Student Details");
        Studentdetails.setBackground(Color.WHITE);
        Studentdetails.addActionListener(this);
        details.add(Studentdetails);
        
//        leave 
  
        JMenu leave = new JMenu("Apply leave") ;
        leave.setForeground(Color.BLUE);
        mb.add(leave) ;
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem Studentleave = new JMenuItem("Student Leave");
        Studentleave.setBackground(Color.WHITE);
        Studentleave.addActionListener(this);
        leave.add(Studentleave);
        
        //leave details
        JMenu leaveDetails = new JMenu("Leave Details") ;
        leaveDetails.setForeground(Color.RED);
        facultyleave.addActionListener(this);
        mb.add(leaveDetails) ;
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Deatils");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem Studentleavedetails = new JMenuItem("Student Leave Details");
        Studentleavedetails.setBackground(Color.WHITE);
        Studentleavedetails.addActionListener(this);
        leaveDetails.add(Studentleavedetails);
        
//        Exams
        JMenu exam = new JMenu("Examination") ;
        exam.setForeground(Color.BLUE);
        mb.add(exam) ;
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //Update Info
        JMenu updateInfo = new JMenu("Update details") ;
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo) ;
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update faculty details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update student details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
//        fees
        JMenu fee = new JMenu("Fee details") ;
        fee.setForeground(Color.BLUE);
        mb.add(fee) ;
        
        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);
        
        JMenuItem feeForm = new JMenuItem("Student Fee form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fee.add(feeForm);
        
//        utilty
        JMenu utilty = new JMenu("Utilty") ;
        utilty.setForeground(Color.RED);
        mb.add(utilty) ;
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utilty.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utilty.add(calc);
        
        
//        about
        JMenu about = new JMenu("About") ;
        about.setForeground(Color.BLUE);
        mb.add(about) ;
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
//        exit
        JMenu exit = new JMenu("Exit") ;
        exit.setForeground(Color.RED);
        mb.add(exit) ;
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if(msg.equals("Exit")){
            setVisible(false);
        }else if(msg.equals("Calculator")){
        try{
//            ecec is not working 
        Runtime.getRuntime().exec("calc.exe") ;
        } catch(Exception e){
         }
         }else if(msg.equals("Notepad")){
            try{
//            ecec is not working 
        Runtime.getRuntime().exec("notepad.exe") ;
        } catch(Exception e){
         }
        }else if(msg.equals("New Faculty Information")){
            new AddTeacher();
    }else if(msg.equals("New Student Information")){
        new AddStudent();
    }else if(msg.equals("View Faculty Details")){
        new TeacherDetails();
    }else if(msg.equals("View Student Details")){
        new StudentDetails();
    }else if(msg.equals("Faculty Leave")){
        new TeacherLeave();
    }else if(msg.equals("Student Leave")){
        new StudentLeave();
    }else if(msg.equals("Student Leave Details")){
        new StudentLeaveDetails();
    }else if(msg.equals("Teacher Leave Details")){
        new TeacherLeaveDetails();
    }else if(msg.equals("Update faculty details")){
        new UpdateTeacher();
    }else if(msg.equals("Update student details")){
        new UpdateStudent();
    }else if(msg.equals("Enter Marks")){
        new EnterMarks();
    }else if(msg.equals("Fee Structure")){
        new FeeStructure();
    }else if(msg.equals("About")){
        new About();
    }else if(msg.equals("Student Fee form")){
        new StudentFeeForm();
    }
    }
    
    public static void main(String[] args) {
        new Project();
    }
    
    
}
