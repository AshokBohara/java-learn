import java.awt.*;

public class demo3 extends Frame
 {
    public demo3()
     {
        super("This is my first frame");
        setSize(700, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.RED);
        setLayout(null);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setVisible(true);
    }

    public static void main(String[] args)
     {
        new demo3();
    }
}
