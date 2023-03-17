import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterProgram extends JFrame implements ActionListener {
    private final JButton convertButton= new JButton("convert");
    private final JTextField inputTextField = new JTextField();
    private final JTextField resultTextField = new JTextField();

    public TemperatureConverterProgram() {
        // title
        super("Temperature Convertor V1.0");

        // setup
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 150);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
