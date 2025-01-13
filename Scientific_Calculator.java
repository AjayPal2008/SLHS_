
    import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

    public class  Scientific_Calculator  extends JPanel {

        // Override paintComponent to draw shapes
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set a color for shapes
            g.setColor(Color.BLUE);

            // Draw a rectangle
            g.fillRect(50, 50, 100, 100);

            // Set another color
            g.setColor(Color.RED);

            // Draw a circle (as an oval with equal width and height)
            g.fillOval(200, 50, 100, 100);

            // Draw a line
            g.setColor(Color.BLACK);
            g.drawLine(50, 200, 300, 200);
        }

        public static void main(String[] args) {
            // Create a JFrame window
            JFrame frame = new JFrame("Graphics Example");

            // Set size, close operation, and visibility
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Add the custom JPanel to the frame
            frame.add(new GraphicsExample());

            // Make the frame visible
            frame.setVisible(true);
        }
    }


