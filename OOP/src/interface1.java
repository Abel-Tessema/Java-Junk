import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class interface1 extends javax.swing.JFrame {
    private JPanel pp;
    private JTabbedPane tabbedPane1;
    private JTextField na;
    private JTextField id;
    private JTextField se;
    private JTextField em;
    private JTextField ph;
    private JTextField ad;
    private JTextField ba;
    private JButton REGISTORButton;
    private JTextField pna;
    private JTextField pem;
    private JTextField pph;
    private JTextField padd;
    private JList dep;
    private JList cs;
    public String department;
   public String cost_sharing_choice;
   public final double tuition = 1382.11;
   public double cost_sharing_fee;


    public interface1() {

        REGISTORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registeruser();
                caregiver();
                course();
                costsharing a= new costsharing(cs);
               a.costsharing_m();
               // f.costsharing_m();

                //costsharing();
               // costsharing a = new costsharing();
              //  a.costsharing_m();
               // costsharing costsharing1= new costsharing();

                JOptionPane.showMessageDialog(REGISTORButton, "your Registered " + na.getText() + "!");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                System.out.println("Registerd on: " + dtf.format(now));

                if (na.getText().isEmpty() || id.getText().isEmpty() || se.getText().isEmpty() || em.getText().isEmpty() || ph.getText().isEmpty() || ad.getText().isEmpty() || ba.getText().isEmpty() || pna.getText().isEmpty() || pem.getText().isEmpty() || pph.getText().isEmpty() || padd.getText().isEmpty()) {
                    throw new IllegalArgumentException("Please fill out all fields.");
                }


            }
        });
        dep.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = dep.getSelectedIndex();
                if (index == 0) {
                    department = "Electrical";
                } else if (index == 1) {
                    department = "Electro";
                } else if (index == 2) {
                    department = "Mechanical";
                } else if (index == 3) {
                    department = "Enviromental";
                }

            }
        });
        costsharing a = new costsharing(cs);
        a.costsharing_m();
       cs.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = cs.getSelectedIndex();
                if (index == 0) {
                    cost_sharing_choice = "You only chose Housing Option";
                    cost_sharing_fee = 600;
                } else if (index == 1) {
                    cost_sharing_choice = "You only chose Food Optiom";
                    cost_sharing_fee = 4500;
                } else if (index == 2) {
                    cost_sharing_choice = "You chose both Housing and Food";
                    cost_sharing_fee = 5100;
                } else if (index == 3) {
                    cost_sharing_choice = "You chose Money for Option";
                    cost_sharing_fee = 5100;
                }
                costsharing cstshr = new costsharing(cs);
                cstshr.costsharing_m();
            }

       });

    }


    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(interface1.class.getClassLoader().getResource("icon.jpg"));
        interface1 f = new interface1();
        f.setIconImage(icon.getImage());
        f.setContentPane(f.pp);
        f.setTitle("AASTU REGISTRATION FORM ....");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interface1 p = new interface1();
        p.setSize(600, 400);

    }


    public void registeruser() {

        String Name = na.getText();
        String Id = id.getText();
        String Section = se.getText();
        String Email = em.getText();
        String Phone = ph.getText();
        String Address = ad.getText();
        String Batch = ba.getText();
        int i = Integer.parseInt(ba.getText());
        System.out.println("Name: " + Name);
        System.out.println("ID: " + Id);
        System.out.println("Section: " + Section);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + Phone);
        System.out.println("Address: " + Address);
        System.out.println("Batch: " + Batch);


    }

    public void caregiver() {
        String Parent_Name = pna.getText();
        String Parent_Email = pem.getText();
        String Parent_phone = pph.getText();
        String Parent_address = padd.getText();

        System.out.println("Parent's name: " + Parent_Name);
        System.out.println("Parent's Email: " + Parent_Email);
        System.out.println("Parent's Phone: " + Parent_phone);
        System.out.println("Parent's address: " + Parent_address);
    }

    public void course() {
        int i = Integer.parseInt(ba.getText());
        String courses;
        if (department == "Electro") {
            switch (i) {
                case 1:
                    courses = "[EM course 1a, EM course 1b,EM course 1c,EM course 1d,EM course 1e,EM course 1f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 2:
                    courses = "[EM course 2a, EM course 2b, EM course 2c,EM course 2d,EM course 2e,EM course 2f]";
                    System.out.println("The courses you will be taking are: "+courses);
                    break;
                case 3:
                    courses = "[EM course 3a, EM course 3b, EM course 3c,EM course 3d,EM course 3e,EM course 3f]";
                    System.out.println("The courses You will be Takeing are: "+courses);
                    break;
                case 4:
                    courses = "[EM course 4a,EM  course 4b,EM course 4c,EM course 4d,EM course 4e,EM course 4f]";
                    System.out.println("The courses You will be taking are"+courses);
                    break;
                case 5:
                    courses = "[EM course 5a, EM course 5b,EM course 5c,EM course 5d, EM course 5e,EM course 5f]";
                    System.out.println("The courses You will be taking are"+courses);
                    break;
            }
        }
        if (department == "Electrical") {
            switch (i) {
                case 1:
                    courses = "E course 1a, E course1b,E course1c,E course1d,E course1e,E course1f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 2:
                    courses = "[E course2a, E course2b, E course2c,E course2d,E course2e,E course2f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 3:
                    courses = "[E course3a, E course3b, E course3c,E course3d,E course3e,E course3f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 4:
                    courses = "[E course4a,E  course4b,E course4c,E course4d,E course4e,E course4f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 5:
                    courses = "E course5a, E course5b,E course5c,E course5d, E course5e,E course5f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
            }
        }
        if (department == "Mechanical") {
            switch (i) {
                case 1:
                    courses = "[M course 1a, M course 1b,M course 1c,M course 1d,M course 1e,M course 1f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 2:
                    courses = "[M course 2a, M course 2b, M course 2c,M course 2d,M course 2e,M course 2f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 3:
                    courses = "[M course 3a, M course 3b, M course 3c,M course 3d,M course 3e,M course 3f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 4:
                    courses = "[M course 4a,M course 4b,M course 4c,M course 4d,M course 4e,M course 4f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 5:
                    courses = "[M course 5a, M course 5b,M course 5c,M course 5d, M course 5e,M course 5f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
            }
        }
        if (department == "Mechanical") {
            switch (i) {
                case 1:
                    courses = "[M course 1a, M course 1b,M course 1c,M course 1d,M course 1e,M course 1f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 2:
                    courses = "[M course 2a, M course 2b, M course 2c,M course 2d,M course 2e,M course 2f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 3:
                    courses = "[M course 3a, M course 3b, M course 3c,M course 3d,M course 3e,M course 3f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 4:
                    courses = "[M course 4a,M course 4b,M course 4c,M course 4d,M course 4e,M course 4f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 5:
                    courses = "[M course 5a, M course 5b,M course 5c,M course 5d, M course 5e,M course 5f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
            }
        }
        if (department == "Enviromental") {
            switch (i) {
                case 1:
                    courses = "[Enivo course 1a, Enivo course 1b,Enivo course 1c,Enivo course 1d,Enivo course 1e, Enivo course 1f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 2:
                    courses = "[Enivo course 2a, Enivo course 2b, Enivo course 2c,Enivo course 2d,Enivo course 2e, Enivo course 2f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 3:
                    courses = "[Enivo course 3a, Enivo course 3b, Enivo course 3c,Enivo course 3d,Enivo course 3e, Enivo course 3f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 4:
                    courses = "[Enivo course 4a,Enivo course 4b,Enivo course 4c,Enivo course 4d,Enivo course 4e, Enivo course 4f]";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
                case 5:
                    courses = "[Enivo course 5a, Enivo course 5b,Enivo course 5c,Enivo course 5d, Enivo course 5e, Enivo course 5f]\"";
                    System.out.println("The courses You will be taking are: "+courses);
                    break;
            }

        }

    }
    public double getCostSharingFee() {
        return cost_sharing_fee;
    }

}