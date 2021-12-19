import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public interface Screen {
    public void displayOutput(JPanel panel, Graphics g);

    public Screen respondToUserInput(KeyEvent key);
}
