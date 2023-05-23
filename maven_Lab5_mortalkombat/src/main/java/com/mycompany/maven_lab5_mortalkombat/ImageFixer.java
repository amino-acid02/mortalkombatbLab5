package com.mycompany.maven_lab5_mortalkombat;


import java.awt.Image;
import javax.swing.ImageIcon;
/*
*    Класс работы с картинками
*/

public class ImageFixer 
{
    /*
    * Метод изменения размеров картинки
    */
    public ImageIcon getScaledImage(Image srcImg)
    {
        ImageIcon resizedImg = new ImageIcon(srcImg.getScaledInstance(300, 250,  java.awt.Image.SCALE_SMOOTH));
        return  resizedImg;   
    }
   
}

