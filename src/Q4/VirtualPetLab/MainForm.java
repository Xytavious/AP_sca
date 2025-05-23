package Q4.VirtualPetLab;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Base64;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JButton feedButton;
    private JButton playButton;
    private JButton sleepButton;
    private JLabel statusLabel;
    private JLabel imageLabel;
    private JComboBox<String> petSelectorComboBox;
    private JButton button1;
    private JTextField textField1;
    private JButton catButton;
    private JButton dogButton;
    private JButton foxButton;
    // TODO: add adoption buttons
    // Pet list
    private PetManager petManager = new PetManager();
    ArrayList<Pet> PetList = new ArrayList<Pet>();

    public MainForm() {
        super("Virtual Pet Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(800, 600));
        this.setResizable(false);
        this.pack();

        // Initialize starting pets
        Dog buddy = new Dog("Buddy");
        petManager.addPet(buddy);
        Cat whiskers = new Cat("Whiskers");
        petManager.addPet(whiskers);
        updatePetList();
        petSelectorComboBox.setSelectedItem(null);  // Clear selection after populating

        // Feed button action
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnPet().feed();
                updateStatusLabel(returnPet().getStats());
            }
        });

        // Play button action
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnPet().play();
                updateStatusLabel(returnPet().getStats());
            }
        });

        // Sleep button action
        sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnPet().sleep();
                updateStatusLabel(returnPet().getStats());
            }
        });

        // Pet selector action
        petSelectorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Make sure the action event isn't triggered by the removeAllItems() call
                if (petSelectorComboBox.getSelectedIndex() == -1) return;
                updateStatusLabel(returnPet().getStats());
                setPetImage(returnPet().getImage());
                // TODO: Implement pet selection change
                // 1. Grab the current pet from the petManager using petSelectorComboBox.getSelectedIndex()
                // 2. Update statusLabel with the selected pet's status
                // 3. Update imageLabel with the selected pet's image using setPetImage()
            }
        });

        // TODO: Implement adoption button actions
        foxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter new pet name: ");

                for (int checker = 0; checker < PetList.size(); checker++) {
                    if (name.trim().equalsIgnoreCase(PetList.get(checker).getName().trim())) {
                        name = JOptionPane.showInputDialog("Pet name already used! Enter new pet name: ");
                        checker = -1;
                    }
                    else if (name.trim().isEmpty()) {
                        name = JOptionPane.showInputDialog("pet name empty! Enter new pet name: ");
                        checker = -1;
                    }
                }

                // Pet fox = new Fox(name);
                // PetList.add(fox);
                //updatePetList();
            }
        });

        catButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter new pet name: ");

                for (int checker = 0; checker < PetList.size(); checker++) {
                    if (name.trim().equalsIgnoreCase(PetList.get(checker).getName().trim())) {
                        name = JOptionPane.showInputDialog("Pet name already used! Enter new pet name: ");
                        checker = -1;
                    }
                    else if (name.trim().isEmpty()) {
                        name = JOptionPane.showInputDialog("pet name empty! Enter new pet name: ");
                        checker = -1;
                    }
                }

                Pet cat = new Cat(name);
                PetList.add(cat);
                updatePetList();
            }
        });

        dogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter new pet name: ");

                for (int checker = 0; checker < PetList.size(); checker++) {
                    if (name.trim().equalsIgnoreCase(PetList.get(checker).getName().trim())) {
                        name = JOptionPane.showInputDialog("Pet name already used! Enter new pet name: ");
                        checker = -1;
                    }
                    else if (name.trim().isEmpty()) {
                        name = JOptionPane.showInputDialog("pet name empty! Enter new pet name: ");
                        checker = -1;
                    }
                }

                Pet dog = new Dog(name);
                PetList.add(dog);
                updatePetList();
            }
        });
    }

    public void updateStatusLabel(String status) {
        statusLabel.setText(status);
    }

    public void updatePetList() {
        petSelectorComboBox.removeAllItems();  // Clear existing items
        for (Pet p : PetList) {
            petSelectorComboBox.addItem(p.getName());
        }
        // After adding the pet, set the selected index to the last item (petManager.getPets().size() - 1)
    }

    public Pet returnPet() {
        int selected = petSelectorComboBox.getSelectedIndex();
        return PetList.get(selected);
    }

    /* ========== DO NOT MODIFY BELOW ========== */
    public void waitButtons(int seconds) {
        // Disable buttons
        feedButton.setEnabled(false);
        playButton.setEnabled(false);
        sleepButton.setEnabled(false);

        // Set a timer to re-enable the buttons after N seconds (1000 ms = 1 second)
        Timer timer = new Timer(seconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedButton.setEnabled(true);
                playButton.setEnabled(true);
                sleepButton.setEnabled(true);
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();
    }

    public void setPetImage(String base64Image) {
        try {
            byte[] imageBytes = Base64.getDecoder().decode(base64Image);
            ImageIcon icon = new ImageIcon(imageBytes);
            Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);

            imageLabel.setIcon(icon);
            imageLabel.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            imageLabel.setIcon(null);
            imageLabel.setText('❌' + e.getMessage());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Virtual pet Lab");
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
