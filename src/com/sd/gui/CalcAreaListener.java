package com.sd.gui;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e) { // from actionlistener
    //System.out.println("Hello");
    JButton b=(JButton)e.getSource(); //event�߻��� �� �ҽ�������
    String cmd=e.getActionCommand();
    if(cmd.equals("���")) {
      //��걸��
      //Double r=Double.parseDouble(radiusTf1.getText());
      //areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�.");
    } 
    else if(cmd.equals("���")) {
      //radiusTf1.setText(" ");
      //areaTf1.setText(" ");
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�.");
    }
  }
}