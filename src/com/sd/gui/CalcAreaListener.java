package com.sd.gui;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalcAreaListener implements ActionListener {
  public void actionPerformed(ActionEvent e) { // from actionlistener
    //System.out.println("Hello");
    JButton b=(JButton)e.getSource(); //event발생한 곳 소스가져옴
    String cmd=e.getActionCommand();
    if(cmd.equals("계산")) {
      //계산구현
      //Double r=Double.parseDouble(radiusTf1.getText());
      //areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
      System.out.println("계산 버튼");
      b.setText("계산했습니다.");
    } 
    else if(cmd.equals("취소")) {
      //radiusTf1.setText(" ");
      //areaTf1.setText(" ");
      System.out.println("취소 버튼");
      b.setText("취소했습니다.");
    }
  }
}