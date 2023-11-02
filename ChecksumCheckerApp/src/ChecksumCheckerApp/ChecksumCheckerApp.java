package ChecksumCheckerApp;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;

public class ChecksumCheckerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Checksum Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new GridLayout(3, 1));

        JButton browseButton = new JButton("Browse");
        JTextArea resultTextArea = new JTextArea(10, 50);
        resultTextArea.setEditable(false);

        panel.add(browseButton);
        panel.add(resultTextArea);

        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the result text area before processing
                resultTextArea.setText("");

                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                fileChooser.setFileFilter(new FileNameExtensionFilter("All Files", "*"));

                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        String checksum = calculateChecksum(selectedFile);
                        resultTextArea.setText("Checksum: \n" + checksum);
                    } catch (IOException ex) {
                        resultTextArea.setText("Error: " + ex.getMessage());
                    }
                }
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    private static String calculateChecksum(File file) throws IOException {
        MessageDigest sha1Digest, md5Digest, sha256Digest;
        try {
            sha1Digest = MessageDigest.getInstance("SHA-1");
            md5Digest = MessageDigest.getInstance("MD5");
            sha256Digest = MessageDigest.getInstance("SHA-256");
        } catch (Exception e) {
            throw new RuntimeException("Unable to initialize checksum algorithms");
        }

        try (InputStream is = new FileInputStream(file)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = is.read(buffer)) != -1) {
                sha1Digest.update(buffer, 0, bytesRead);
                md5Digest.update(buffer, 0, bytesRead);
                sha256Digest.update(buffer, 0, bytesRead);
            }
        }

        String sha1Checksum = new String(Hex.encodeHex(sha1Digest.digest()));
        String md5Checksum = new String(Hex.encodeHex(md5Digest.digest()));
        String sha256Checksum = new String(Hex.encodeHex(sha256Digest.digest()));

        return "SHA-1: " + sha1Checksum + "\nMD5: " + md5Checksum + "\nSHA-256: " + sha256Checksum;
    }
}
