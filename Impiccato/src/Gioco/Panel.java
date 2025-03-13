package Gioco;

import javax.swing.*;

public class Panel extends JPanel {

    private final int xPanel = Frame.getxFrame();
    private final int yPanel = Frame.getyFrame();

    public Panel(Frame frame) {
        setLayout(null);
        setBounds(0, 0, xPanel, yPanel);
        setVisible(true);
        frame.add(this);
        setFocusable(false);
    }

    public int getxPanel() {
        return xPanel;
    }

    public int getyPanel() {
        return yPanel;
    }
}
