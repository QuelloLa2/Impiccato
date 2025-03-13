package Gioco.Utilitis;

import javax.swing.*;
import java.awt.*;

public class RoundButton extends JButton {
    public static void createRoundedButton(JButton button, int radius, Color backgroundColor) {
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        button.setBackground(backgroundColor);

        button.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();

                // Attiva l'antialiasing per migliorare la qualità grafica
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
                g2.setColor(button.getBackground());
                g2.fillRoundRect(0, 0, button.getWidth(), button.getHeight(), radius, radius);
                g2.setColor(button.getForeground());
                g2.drawRoundRect(0, 0, button.getWidth() - 1, button.getHeight() - 1, radius, radius);
                g2.dispose();
                super.paint(g, c);
            }
        });
    }
}