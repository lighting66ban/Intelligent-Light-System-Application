package IntelligentLightSystemApplication.Buttons;

import IntelligentLightSystemApplication.Room.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ModeButton extends JButton {
    ModeButton(Room room) {
        super(new ImageIcon(ModeButton.class.getResource("/ModeButton.png")));
        setPreferredSize(new Dimension(50, 50));
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                room.setMode(!room.isMode());
            }
        });
    }
}

