import java.awt.*;
public class AWTExp1 extends Frame {
    AWTExp1() {

Button b = new Button("Click Me!!");
b.setBounds(30,100,80,30);
b.setBackground(Color.blue);

add(b);
setSize(300,300);
setTitle("This is our basic AWT example");
setVisible(true);
}
public static void main(String args[]) {
    AWTExp1 intee = new AWTExp1();

}
}