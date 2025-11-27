import javax.swing.*;
import java.awt.*;

class ButtonExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JLabel label = new JLabel("まだ押されてないよ");
            JButton button = new JButton("押してみて");
            button.addActionListener(e -> label.setText("ボタンが押されたよ！"));

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(label);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));
            panel.add(button);
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JFrame frame = new JFrame("ボタンのサンプル");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}