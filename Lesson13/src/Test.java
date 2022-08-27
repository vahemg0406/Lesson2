import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    static int c = 1;
    public static void main(String[] args) {
        final int a = 54;

        Human h = new Human(2000);
        System.out.println(h.getYear());
        Triangle t = new Triangle("T", 1, 1, 1, 5, 4, 1);
        t.printPerimetre();

        Triangle.MyPoint p1 = t.new MyPoint(4, 5);//Triangle.MyPoint p=new Triangle("T",1,1,1,5,4,1).new MyPoint(4,5);
//Triangle.MyPoint p2=new Triangle. MyPoint(4,5);

        Musician m = new Guitarist();
        m.playMusic();
        Musician p = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("playing piano");
            }
        };
        p.playMusic();
        Message sms = new Message() {
            @Override
            public void sendMessage(String text) {
                System.out.println("Sending sms " + text);
            }
        };
        sms.sendMessage("Barev");
        Geo g = new Geo() {
            @Override
            public void perimeterTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
                super.perimeterTriangle(x1, y1, x2, y2, x3, y3);
            }
        };

        JFrame f = new JFrame();
        f.setSize(600, 600);
        JButton j = new JButton("Press me");
        f.add(j);

        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("count " + c++);
            }
        });
        f.setVisible(true);

    }
}
