package view;


import controller.UserProccess;
import factroy.MainGui;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;

/**
 * Created by hossam on 12/9/16.
 */
public class MainView extends JFrame implements MainGui{


    UserProccess userProccess = new UserProccess() ;

    private JPanel panel1;
    private JTextField name_editText;
    private JTextField age_editText;
    private JButton saveButton;

    public MainView() {

        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setVisible(true);

        initializeButton();
    }

    @Override
    public void initializeItmes() {

        userProccess.userName(name_editText.getText().toString());

        userProccess.userAge(age_editText.getText().toString());

    }

    @Override
    public void initializeButton() {

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                initializeItmes();
                Timer timer = new java.util.Timer();

                timer.schedule(new TimerTask() {

                    public void run() {

                        JOptionPane.showMessageDialog(null,"Name : "+userProccess.DETAILS().getName());
                        JOptionPane.showMessageDialog(null,"Age : "+userProccess.DETAILS().getAge());
                    }

                }, 0, 1000);
//                JOptionPane.showMessageDialog(null,"Name : "+userProccess.DETAILS().getName());
//                JOptionPane.showMessageDialog(null,"Age : "+userProccess.DETAILS().getAge());

            }
        });
    }
}
