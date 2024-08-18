import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class costsharing {

    String cost_sharing_choice;
    double cost_sharing_fee;
    public final double tuition = 1382.11;
    private JList cs;
   // interface1 b =new interface1();
   // double csf=b.getcost_sharing_fee();
    //String csc =b.getCost_sharing_choice();
    public costsharing(JList cs){
        this.cs= cs;
    }
    public void costsharing_m() {

        cs.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = cs.getSelectedIndex();
                if (index == 0) {
                    cost_sharing_choice = "You only choose Housing Option";
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

                double total_fee;
                total_fee = cost_sharing_fee + tuition;
                System.out.println("Your cost sharing choice is: " + cost_sharing_choice );
                System.out.println("And your Total fee = " + total_fee);
            }
        });




       // double total_fee;
      //  total_fee = cost_sharing_fee + tuition;
      //  System.out.println("Your cost sharing choice is: " + cost_sharing_choice );
      //  System.out.println("And your Total fee= " + total_fee);

    }

    public double getCostSharingFee() {
        return cost_sharing_fee;
    }

}
