import javax.swing.*;
import java.awt.*;

public class ThreePanelGrid extends JFrame {


    public ThreePanelGrid() {
        initializeFrame();
        addPanels();
    }

    public void initializeFrame() {
        setTitle("Three Panel Grid Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize window
    }


    public void addPanels() {
        JPanel panel1 = createPanel(Color.RED);
        JPanel panel2 = createPanel(Color.GREEN);
        JPanel panel3 = createPanel(Color.BLUE);

        add(panel1);
        add(panel2);
        add(panel3);
    }


    public JPanel createPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }





}