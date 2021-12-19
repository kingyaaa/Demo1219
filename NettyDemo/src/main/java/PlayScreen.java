import javax.swing.*;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class PlayScreen implements Screen{
    private int screenWidth;
    private int screenHeight;
    private Creature player;
    private Image image;
    public PlayScreen(int width,int height){
        this.screenWidth = width;
        this.screenHeight = height;
        this.player = new Creature(10,10);
        //this.images = new ElementImage();
    }
    @Override
    public void displayOutput(JPanel panel, Graphics g){
        displayPlayers(panel,g);

    }
    @Override
    public Screen respondToUserInput(KeyEvent key) {
        switch (key.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                player.moveBy(-1, 0,Dir.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                player.moveBy(1, 0,Dir.RIGHT);
                break;
            case KeyEvent.VK_UP:
                player.moveBy(0, -1,Dir.UP);
                break;
            case KeyEvent.VK_DOWN:
                player.moveBy(0, 1,Dir.DOWN);
                break;
        }
        return this;
    }
    public void displayPlayers(JPanel panel, Graphics g){
        String path;
        if(player.getDir() == Dir.UP){
            //image = ElementImage.Player1Img[0];
            path = "resources/Player1-up.png";
        }
        else if(player.getDir() == Dir.DOWN){
            //image = ElementImage.Player1Img[1];
            path = "resources/Player1-down.png";
        }
        else if(player.getDir() == Dir.LEFT){
            //image = ElementImage.Player1Img[2];
            path = "resources/Player1-left.png";
        }
        else{
            //image = ElementImage.Player1Img[3];
            path = "resources/Player1-down.png";
        }
        image = getImage(path).getImage();
        g.drawImage(image,player.getX() ,player.getY(),10,10,panel);
    }
    public ImageIcon getImage(String path){
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(path));
        if(icon == null){
            System.out.println("null");
            return null;
        }
        else{
            return icon;
        }
    }

}
