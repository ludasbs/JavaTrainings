package Boll;

/**
 * Created by Lsimak on 13.07.2015.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Bol{

    public static void main (String [] args) {
        JFrame myWindow = new Window();
        myWindow.setVisible(true);



        final Graphics g = myWindow.getGraphics();

        // TODO разобраться почему здесь использованы массивы из одного элемента
        // TODO улучшить, т.е. хранить эти параметны в некотором объекте
        final int[] x = {50};
        final int[] y = {150};

        final int size = 50;
        // HINT: нужно добавить шаг по OX
        final int[] step = {2};

        Timer timer = new Timer(20, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear old image

                g.clearRect(0,0, 300,460);
                g.setColor(new Color(4, 81, 40));
                g.fillOval(x[0], y[0],size,size);
                y[0] += step[0];

                // HINT нужно проверять и по оси OX
                if(y[0] > 300-size) {
                    step[0] =-step[0];
                } else if(y[0]<size/2) {
                    step[0] =-step[0];
                }
            }
        });

        timer.start();
    }


    }




