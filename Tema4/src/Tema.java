
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bogdan Timofte
 */
public class Tema extends javax.swing.JFrame {
    LinkedList<String> lista;

    public Tema() {
        lista = new LinkedList<>();
        initComponents();

    }

    private boolean verificare(String nume, String prenume, String cnp, String media) {
        if (nume.equals("") || prenume.equals("") || cnp.equals("") || media.equals("")) {
            errorL.setText("Camp necompletat\n");
            showL.setText("");
            return false;
        }
        return true;
    }

    private boolean parseCNP(String cnp) {
        char[] CNP = cnp.toCharArray();
        if (CNP.length != 13) {
            errorL.setText("CNP invalid");
            showL.setText("");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numeI = new javax.swing.JTextField();
        prenumeI = new javax.swing.JTextField();
        cnpI = new javax.swing.JTextField();
        medieI = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        show = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        errorL = new javax.swing.JLabel();
        showL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nume:");

        jLabel2.setText("Prenume:");

        jLabel3.setText("CNP:");

        jLabel4.setText("Medie:");

        numeI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeIActionPerformed(evt);
            }
        });

        medieI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medieIActionPerformed(evt);
            }
        });

        register.setText("Inregistreaza");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        show.setText("Afiseaza");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        exit.setText("Iesire");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        errorL.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(register)
                        .addGap(58, 58, 58)
                        .addComponent(show)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(showL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numeI)
                                .addComponent(prenumeI)
                                .addComponent(cnpI)
                                .addComponent(medieI, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                        .addComponent(errorL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(prenumeI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cnpI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(medieI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register)
                    .addComponent(show)
                    .addComponent(exit))
                .addGap(18, 18, 18)
                .addComponent(showL, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeIActionPerformed

    private void medieIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medieIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medieIActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // register button
        String nume, prenume, cnp, media;
        nume = numeI.getText();
        prenume = prenumeI.getText();
        cnp = cnpI.getText();
        media = medieI.getText();
        if (verificare(nume, prenume, cnp, media)) {
            if (parseCNP(cnp)) {
                File file = new File(nume + prenume + ".txt");
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    errorL.setText("Eroare la inregistrare");
                    showL.setText("");

                }
                try {
                    FileWriter writer = new FileWriter(file);
                    writer.write(nume + " " + prenume + " " + cnp + " " + media);
                    writer.close();
                    lista.add(nume + " " + prenume);
                    FileOutputStream fos = new FileOutputStream("list.ser");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(lista);
                    oos.close();
                    fos.close();
                    numeI.setText("");
                    prenumeI.setText("");
                    cnpI.setText("");
                    medieI.setText("");
                    showL.setText("Adaugare reusita");
                } catch (IOException ex) {
                    Logger.getLogger(Tema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_registerActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // showButton
        String nume, prenume;
        nume = numeI.getText();
        prenume = prenumeI.getText();
        if (!nume.equals("") && !prenume.equals("")) {
            String nf = nume + prenume + ".txt";
            File F = new File(nf);
            try {
                Scanner s = new Scanner(F);
                showL.setText(s.nextLine());
                errorL.setText("");
                s.close();
            } catch (Exception ex) {
                //Logger.getLogger(Tema.class.getName()).log(Level.SEVERE, null, ex);
                errorL.setText("Persoana nu exista!");
                showL.setText("");
            }
        } else if (!nume.equals("")) {
            FileInputStream fis;
            try {
                fis = new FileInputStream("list.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                LinkedList<String> list = (LinkedList) ois.readObject();
                ois.close();
                String p[];
                String NF = "";
                boolean gasit = false;
                for (int i = 0; i < list.size(); i++) {
                    p = list.get(i).split(" ");
                    if (p[0].equals(nume)) {
                        NF = p[0] + p[1] + ".txt";
                        gasit = true;
                    }
                }
                if (gasit == true) {
                    Scanner s = new Scanner(new File(NF));
                    showL.setText(s.nextLine());
                    errorL.setText("");
                    s.close();
                } else {
                    errorL.setText("Nu s-a gasit!");
                    showL.setText("");
                }

            } catch (Exception ex) {
                //Logger.getLogger(Tema.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (!prenume.equals("")) {
            FileInputStream fis;
            try {
                fis = new FileInputStream("list.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                LinkedList<String> list = (LinkedList) ois.readObject();
                ois.close();
                String p[];
                String NF = "";
                boolean gasit = false;
                for (int i = 0; i < list.size(); i++) {
                    p = list.get(i).split(" ");
                    if (p[1].equals(prenume)) {
                        NF = (String) p[0] + (String) p[1] + ".txt";
                        gasit = true;
                    }
                }
                if (gasit == true) {
                    Scanner s = new Scanner(new File(NF));
                    showL.setText(s.nextLine());
                    errorL.setText("");
                    s.close();
                } else {
                    errorL.setText("Nu s-a gasit!");
                    errorL.setText("");
                }

            } catch (Exception ex) {
                //Logger.getLogger(Tema.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{
            errorL.setText("Cautarea se face dupa nume sau prenume sau ambele!");
            showL.setText("");
        }
    }//GEN-LAST:event_showActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // Exit button
        System.exit(NORMAL);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tema().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnpI;
    private javax.swing.JLabel errorL;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField medieI;
    private javax.swing.JTextField numeI;
    private javax.swing.JTextField prenumeI;
    private javax.swing.JButton register;
    private javax.swing.JButton show;
    private javax.swing.JLabel showL;
    // End of variables declaration//GEN-END:variables
}
