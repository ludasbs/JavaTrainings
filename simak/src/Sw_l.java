package src;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;

class CurrentIP {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Current IP");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        String IP = "";
        try {
            IP = InetAddress.getLocalHost().getHostAddress();
        }
        catch (Exception e) {
            IP = "Error finding IP";
        }
        //��������� ������,
        //������� ����� �������� ���������� � IP ������
        JPanel panel = new JPanel();
        //���������� ������� � ������
        panel.setBorder(BorderFactory.createTitledBorder("Current IP Address"));
                panel.add(new JLabel("          " + IP + "          "));
        //���������� ������ � ������
        frame.getContentPane().add(panel);
        //����� �ack(); �������� Swing � ���,
        //��� ����� ������� ����������� ����������� ������� ���
        //����������� ��������� �� � �����.
        //������ ������ - ������� setSize(int width, int height).
        frame.pack();
        //��� ����, ����� ������� ���� �� ������
        //�� ������ ������� ����� setVisible(true)
        frame.setVisible(true);
    }
}