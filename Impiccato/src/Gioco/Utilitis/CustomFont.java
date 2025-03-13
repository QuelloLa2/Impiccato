package Gioco.Utilitis;

import javax.swing.*;
import java.awt.*;

public class CustomFont {

    public static void setPlain(JComponent component, int size) {
        if (size != 0) {
            Font font = new Font("Arial", Font.PLAIN, size);
            component.setFont(font);
        } else {
            Font currentFont = component.getFont();
            Font newFont = new Font("Arial", Font.PLAIN, currentFont.getSize());
            component.setFont(newFont);
        }

    }

    public static void setBold(JComponent component, int size) {
        if (size != 0) {
            Font font = new Font("Arial", Font.BOLD, size);
            component.setFont(font);
        } else {
            Font currentFont = component.getFont();
            Font newFont = new Font("Arial", Font.BOLD, currentFont.getSize());
            component.setFont(newFont);
        }
    }

    public static void setItalic(JComponent component, int size) {
        if (size != 0) {
            Font font = new Font("Arial", Font.ITALIC, size);
            component.setFont(font);
        } else {
            Font currentFont = component.getFont();
            Font newFont = new Font("Arial", Font.ITALIC, currentFont.getSize());
            component.setFont(newFont);
        }
    }

}
