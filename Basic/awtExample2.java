//without event handling there is creation of button but it does not preforms any action .
import java.awt.*;

class MyFrame extends Frame 
{
    Label lbl_fn, lbl_sn, lbl_res;       // Labels
    TextField txt_fn, txt_sn, txt_res;  // TextFields
    Button btn_add;                     // Button
    FlowLayout layout_flow;             // Layout

    public MyFrame()
    {
        // Initialize components
        lbl_fn = new Label("First Num:");
        lbl_sn = new Label("Second Num:");
        lbl_res = new Label("Result:");
        txt_fn = new TextField(20);
        txt_sn = new TextField(20);
        txt_res = new TextField(20);
        btn_add = new Button("Add");

        // Make the result field non-editable
        txt_res.setEditable(false);

        // Set layout and add components
        layout_flow = new FlowLayout();
        setLayout(layout_flow);
        add(lbl_fn);
        add(txt_fn);
        add(lbl_sn);
        add(txt_sn);
        add(lbl_res);
        add(txt_res);
        add(btn_add);

        // Set frame properties
        setSize(400, 300);
        setTitle("AWT Example - Addition");
        setVisible(true);
    }
}

public class awtExample2
    {
    public static void main(String[] args) 
        {
        new MyFrame(); // Create and display the frame
    }
}
