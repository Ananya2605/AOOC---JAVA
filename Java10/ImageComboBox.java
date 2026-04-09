import javax.swing.*;

public class ImageComboBox extends JFrame {

    JComboBox<String> combo;
    JLabel label;

    ImageComboBox() {
        setTitle("Image Viewer");
        setSize(400, 400);
        setLayout(null);

        String images[] = {"https://stockcake.com/i/rain-soaked-orange-flowers_1426695_621012.jpg", "https://in.pinterest.com/pin/rain--22869910603850215/.jpg", "https://www.facebook.com/groups/5165667646873559/posts/24137388435941528/.jpg"};

        combo = new JComboBox<>(images);
        combo.setBounds(100, 20, 200, 30);

        label = new JLabel();
        label.setBounds(50, 80, 300, 250);

        combo.addItemListener(e -> {
            String img = (String) combo.getSelectedItem();
            label.setIcon(new ImageIcon(img));
        });

        add(combo);
        add(label);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageComboBox();
    }
}