package com.banchu;

import javax.swing.*;
import java.awt.*;

public class PlayPanel extends JPanel {
    int xBg, wBg, hBg, xI1, xI2, delta;
    Image bgImg;
    PlayPanel()
    {
       // setBackground(Color.BLACK);
        setSize(400,600);
        setLayout(null);
        initImageBg();
//        xBg = 0;
        initThread();
    }
    void initImageBg(){
        // Tao anh Bg
        Image bgImg = new ImageIcon(
                getClass().getResource("/IMG2/bg (2).jpg")
        ).getImage();
        hBg = 500;
        wBg = 500*bgImg.getWidth(null)/ bgImg.getHeight(null);
        xI1 = 0;
        xI2 = xI1 + xBg;
        delta =
    }
    @Override
    protected void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        // Tao anh
        Image menuImg = new ImageIcon(
                getClass().getResource("/IMG2/menu.jpg")
        ).getImage();
        g2d.drawImage(menuImg,0,0,400,100,null);

        g2d.drawImage(bgImg,xI1,100,wBg, 500,null);
        g2d.drawImage(bgImg,xI2,100,wBg, 500,null);
    }
    void initThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    xI1--;
                    xI2--;
                    if(xI2 == -delta) {
                        xI1 = -delta;
                        xI2 = 400;
                    }
                    repaint();
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
