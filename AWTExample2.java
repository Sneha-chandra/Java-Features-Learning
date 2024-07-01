import java.awt.*;
class AWTExample2 {
AWTExample2() {
Frame f = new Frame();
Button b = new Button("Click me");
f.add(b);

f.setSize(400,300);

f.setTitle("Employee info");
f.setLayout(null);

f.setVisible(true);
}

public static void main(String args[]) {

AWTExample2 awt_obj = new AWTExample2();

}

}