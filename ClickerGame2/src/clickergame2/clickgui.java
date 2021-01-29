package clickergame2;

import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class clickgui extends javax.swing.JFrame {

    public int points = 0;
    public int workers = 0;
    public int offices = 0;
    public int factories = 0;
    public int mines = 0;
    public int moneymakers = 0;

    Timer timer;
    boolean increase = true;

    public clickgui() {
        initComponents();

        pointDisplay.setText("Coins: " + points);

        workerDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        officeDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        factoryDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        diamondmineDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        moneyprintDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        pointDisplay.setHorizontalAlignment(SwingConstants.CENTER);

        workerDisplay.setOpaque(true);
        officeDisplay.setOpaque(true);
        factoryDisplay.setOpaque(true);
        diamondmineDisplay.setOpaque(true);
        moneyprintDisplay.setOpaque(true);
        pointDisplay.setOpaque(true);

        pointDisplay.setBackground(Color.WHITE);
        Title.setForeground(Color.WHITE);
        Title.setFont(new Font("Serif", Font.PLAIN, 20));

        workerDisplay.setBackground(Color.WHITE);
        officeDisplay.setBackground(Color.WHITE);
        factoryDisplay.setBackground(Color.WHITE);
        diamondmineDisplay.setBackground(Color.WHITE);
        moneyprintDisplay.setBackground(Color.WHITE);

        workerButton.setBackground(Color.WHITE);
        officeButton.setBackground(Color.WHITE);
        factoryButton.setBackground(Color.WHITE);
        diamondmineButton.setBackground(Color.WHITE);
        moneyprintButton.setBackground(Color.WHITE);

        mainClicker.setContentAreaFilled(false);
        mainClicker.setBorderPainted(false);

        ImageIcon coin = new ImageIcon("coinImage.png");
        mainClicker.setIcon(coin);

        workerButton.setEnabled(false);
        officeButton.setEnabled(false);
        factoryButton.setEnabled(false);
        diamondmineButton.setEnabled(false);
        moneyprintButton.setEnabled(false);
        
        Thread clickers = new Thread() {
            public void run() {
                while(true){
                    autoClick();
                }
            }
        };

        clickers.start();
    }

    public void autoClick() {

        Thread clickers = new Thread() {
            public void run() {
                try {
                    while (true) {
                        while (workers > 0) {
                            points = points + 1;
                            pointDisplay.setText("Coins: " + points);
                            sleep(1000);
                        }
                    }

                } catch (Exception e) {
                }
            }
        };

        clickers.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainClicker = new javax.swing.JButton();
        pointDisplay = new javax.swing.JLabel();
        workerButton = new javax.swing.JButton();
        factoryButton = new javax.swing.JButton();
        diamondmineButton = new javax.swing.JButton();
        officeButton = new javax.swing.JButton();
        moneyprintButton = new javax.swing.JButton();
        officeDisplay = new javax.swing.JLabel();
        workerDisplay2 = new javax.swing.JLabel();
        factoryDisplay = new javax.swing.JLabel();
        workerDisplay = new javax.swing.JLabel();
        moneyprintDisplay = new javax.swing.JLabel();
        diamondmineDisplay = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainClicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainClickerActionPerformed(evt);
            }
        });

        workerButton.setText("???");
        workerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerButtonActionPerformed(evt);
            }
        });

        factoryButton.setText("???");
        factoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoryButtonActionPerformed(evt);
            }
        });

        diamondmineButton.setText("???");
        diamondmineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diamondmineButtonActionPerformed(evt);
            }
        });

        officeButton.setText("???");
        officeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officeButtonActionPerformed(evt);
            }
        });

        moneyprintButton.setText("???");
        moneyprintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyprintButtonActionPerformed(evt);
            }
        });

        officeDisplay.setText("???");

        factoryDisplay.setText("???");

        workerDisplay.setText("???");

        moneyprintDisplay.setText("???");

        diamondmineDisplay.setText("???");

        Title.setText("MONEY MAKER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pointDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(factoryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(officeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(diamondmineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moneyprintButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(mainClicker, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(workerDisplay2, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factoryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(officeDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workerDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diamondmineDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(moneyprintDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pointDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(workerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(officeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(factoryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workerDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diamondmineDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moneyprintDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(workerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(officeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diamondmineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moneyprintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mainClicker, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainClickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainClickerActionPerformed
        points = points + 1;
        pointDisplay.setText("Coins: " + points);

        if (points >= 100) {
            workerButton.setEnabled(true);
            workerButton.setText("Hire worker = $100");
            workerDisplay.setText("Workers: " + workers);
        } else {
            workerButton.setEnabled(false);
        }
        if (workers > 0) {
            points = points + workers;
        }

        if (points >= 5000) {
            officeButton.setEnabled(true);
            officeButton.setText("Construct office = $5000");
            officeDisplay.setText("Offices: " + offices);
        } else {
            officeButton.setEnabled(false);
        }
        if (offices > 0) {
            points = points + (offices * 100);
        }

        if (points >= 20000) {
            factoryButton.setEnabled(true);
            factoryButton.setText("Construct factory = $20000");
            factoryDisplay.setText("Factories: " + factories);
        } else {
            factoryButton.setEnabled(false);
        }
        if (factories > 0) {
            points = points + (factories * 250);
        }

        if (points >= 50000) {
            diamondmineButton.setEnabled(true);
            diamondmineButton.setText("Start Mine = $50000");
            diamondmineDisplay.setText("Mineshafts: " + mines);
        } else {
            diamondmineButton.setEnabled(false);
        }
        if (mines > 0) {
            points = points + (mines * 500);
        }

        if (points >= 100000) {
            moneyprintButton.setEnabled(true);
            moneyprintButton.setText("Build MoneyMaker = $100000");
            moneyprintDisplay.setText("MoneyMakers: " + moneymakers);
        } else {
            moneyprintButton.setEnabled(false);
        }
        if (moneymakers > 0) {
            points = points + (mines * 1000);
        }

    }//GEN-LAST:event_mainClickerActionPerformed

    private void workerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerButtonActionPerformed
        workers = workers + 1;
        points = points - 100;

        workerDisplay.setText("Workers: " + workers);
        pointDisplay.setText("Coins: " + points);

        if (points < 100) {
            workerButton.setEnabled(false);
        }

    }//GEN-LAST:event_workerButtonActionPerformed

    private void officeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officeButtonActionPerformed
        offices = offices + 1;
        points = points - 5000;

        officeDisplay.setText("Offices: " + offices);
        pointDisplay.setText("Coins: " + points);

        if (points < 5000) {
            officeButton.setEnabled(false);
        }
    }//GEN-LAST:event_officeButtonActionPerformed

    private void factoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoryButtonActionPerformed
        factories = factories + 1;
        points = points - 20000;

        factoryDisplay.setText("Factories: " + factories);
        pointDisplay.setText("Coins: " + points);

        if (points < 20000) {
            factoryButton.setEnabled(false);
        }
    }//GEN-LAST:event_factoryButtonActionPerformed

    private void diamondmineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diamondmineButtonActionPerformed
        mines = mines + 1;
        points = points - 50000;

        diamondmineDisplay.setText("Mineshafts: " + mines);
        pointDisplay.setText("Coins: " + points);

        if (points < 50000) {
            diamondmineButton.setEnabled(false);
        }
    }//GEN-LAST:event_diamondmineButtonActionPerformed

    private void moneyprintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyprintButtonActionPerformed
        moneymakers = moneymakers + 1;
        points = points - 100000;

        moneyprintDisplay.setText("MoneyMakers: " + moneymakers);
        pointDisplay.setText("Coins: " + points);

        if (points < 100000) {
            moneyprintButton.setEnabled(false);
        }
    }//GEN-LAST:event_moneyprintButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clickgui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton diamondmineButton;
    private javax.swing.JLabel diamondmineDisplay;
    private javax.swing.JButton factoryButton;
    private javax.swing.JLabel factoryDisplay;
    private javax.swing.JButton mainClicker;
    private javax.swing.JButton moneyprintButton;
    private javax.swing.JLabel moneyprintDisplay;
    private javax.swing.JButton officeButton;
    private javax.swing.JLabel officeDisplay;
    private javax.swing.JLabel pointDisplay;
    private javax.swing.JButton workerButton;
    private javax.swing.JLabel workerDisplay;
    private javax.swing.JLabel workerDisplay2;
    // End of variables declaration//GEN-END:variables
}
