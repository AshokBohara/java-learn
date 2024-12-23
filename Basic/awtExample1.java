import java.awt.*;

class Mytframe extends Frame {
    MenuBar mb;         // MenuBar instance
    Menu m_file;        // Menu instance
    MenuItem mi_new, mi_close; // MenuItem instances

    public Mytframe() { // Constructor name matches class name
        // Create MenuBar and Menu
        mb = new MenuBar();
        m_file = new Menu("File"); // Menu, not MenuItem

        // Create MenuItems
        mi_new = new MenuItem("New");
        mi_close = new MenuItem("Close");

        // Add MenuItems to Menu
        m_file.add(mi_new);
        m_file.add(mi_close);

        // Add Menu to MenuBar
        mb.add(m_file);

        // Set MenuBar for Frame
        setMenuBar(mb);

        // Set Frame properties
        setSize(400, 500);
        setTitle("AWT Example");
        setVisible(true);
    }
}

public class awtExample1 {
    public static void main(String[] args) {
        new Mytframe(); // Create an instance of Mytframe
    }
}
