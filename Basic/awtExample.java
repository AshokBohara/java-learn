import java.awt.*;

class MyFrame extends Frame {
    public MyFrame() {
        setBackground(Color.RED); // Correct syntax for setting background color
        setSize(400, 500);        // Correct method name and arguments
        setTitle("Hello World");  // Correct method name for setting title
        setVisible(true);         // Correct method name and case
    }
}

public class awtExample { // Renamed class to avoid conflict with java.awt package
    public static void main(String[] args) {
        new MyFrame(); // Create an instance of MyFrame
    }
}
