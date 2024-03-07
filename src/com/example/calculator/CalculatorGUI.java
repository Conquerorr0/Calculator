/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author User
 */
public class CalculatorGUI extends javax.swing.JFrame {

    private String input;
    private double result;
    private ProcessPriority pp;

    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI() {
        initComponents();
        getContentPane().setBackground(Color.decode("#9CA6AB"));    // Arka plan rengi
        setLocationRelativeTo(null);    // Pencerenin ekranın ortasında çıkmasını sağlıyor
        input = "";
        txtInput.setBackground(Color.decode("#9CA6AB"));
        txtInput.setFocusable(true);
        txtInput.addKeyListener(new MyKeyListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnEquals = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnTimes = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnComma = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnPercantage = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnOpenPrnths = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextPane();
        btnClosePrnths = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesap Makinesi");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon("src\\ico\\Windows_Calculator_icon.png").getImage());
        setResizable(false);

        btnEquals.setBackground(new java.awt.Color(0, 153, 255));
        btnEquals.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 255, 255));
        btnEquals.setText("=");
        btnEquals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        btnEquals.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(153, 153, 153));
        btnPlus.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        btnPlus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(153, 153, 153));
        btnMinus.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        btnMinus.setText("-");
        btnMinus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        btnMinus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnTimes.setBackground(new java.awt.Color(153, 153, 153));
        btnTimes.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnTimes.setText("x");
        btnTimes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimesActionPerformed(evt);
            }
        });
        btnTimes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnDivide.setBackground(new java.awt.Color(153, 153, 153));
        btnDivide.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        btnDivide.setText("÷");
        btnDivide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        btnDivide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnComma.setBackground(new java.awt.Color(153, 153, 153));
        btnComma.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnComma.setText(",");
        btnComma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommaActionPerformed(evt);
            }
        });
        btnComma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnThree.setBackground(new java.awt.Color(204, 204, 204));
        btnThree.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnThree.setText("3");
        btnThree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnThree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnSix.setBackground(new java.awt.Color(204, 204, 204));
        btnSix.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnSix.setText("6");
        btnSix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnSix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnNine.setBackground(new java.awt.Color(204, 204, 204));
        btnNine.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnNine.setText("9");
        btnNine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnNine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnPercantage.setBackground(new java.awt.Color(153, 153, 153));
        btnPercantage.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        btnPercantage.setText("%");
        btnPercantage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnPercantage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercantageActionPerformed(evt);
            }
        });
        btnPercantage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(204, 204, 204));
        btnSeven.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnSeven.setText("7");
        btnSeven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnSeven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(153, 153, 153));
        btnDel.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        btnDel.setText("DEL");
        btnDel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        btnDel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(204, 204, 204));
        btnZero.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnZero.setText("0");
        btnZero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnZero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnZero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnTwo.setBackground(new java.awt.Color(204, 204, 204));
        btnTwo.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnTwo.setText("2");
        btnTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnTwo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnFive.setBackground(new java.awt.Color(204, 204, 204));
        btnFive.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnFive.setText("5");
        btnFive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnFive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnEight.setBackground(new java.awt.Color(204, 204, 204));
        btnEight.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnEight.setText("8");
        btnEight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnEight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnOpenPrnths.setBackground(new java.awt.Color(153, 153, 153));
        btnOpenPrnths.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        btnOpenPrnths.setText("(");
        btnOpenPrnths.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnOpenPrnths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPrnthsActionPerformed(evt);
            }
        });
        btnOpenPrnths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(153, 153, 153));
        btnC.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnC.setText("C");
        btnC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        btnC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnOne.setBackground(new java.awt.Color(204, 204, 204));
        btnOne.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnOne.setText("1");
        btnOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnOne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        btnFour.setBackground(new java.awt.Color(204, 204, 204));
        btnFour.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btnFour.setText("4");
        btnFour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnFour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        lblResult.setForeground(new java.awt.Color(204, 204, 204));
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResult.setText("Result");

        txtInput.setEditable(false);
        txtInput.setBackground(new java.awt.Color(153, 153, 153));
        txtInput.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtInput);
        // Metni sağa hizala
        StyledDocument doc = txtInput.getStyledDocument();
        SimpleAttributeSet rightAlign = new SimpleAttributeSet();
        StyleConstants.setAlignment(rightAlign, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), rightAlign, false);

        btnClosePrnths.setBackground(new java.awt.Color(153, 153, 153));
        btnClosePrnths.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        btnClosePrnths.setText(")");
        btnClosePrnths.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnClosePrnths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosePrnthsActionPerformed(evt);
            }
        });
        btnClosePrnths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZeroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnComma, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnOpenPrnths, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnClosePrnths, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnPercantage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPercantage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnOpenPrnths, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClosePrnths, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // Buton grup ile rakam butonlarının hepsinin işlemlerini burada yapacağız
        handleNumericButton(evt.getActionCommand());
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnZeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnZeroKeyPressed
        // İlgili klavye tuşlarıylada işlem yapabilme
        int keyCode = evt.getKeyCode();
        if (keyCode == KeyEvent.VK_0 || keyCode == KeyEvent.VK_NUMPAD0 ) {
            handleNumericButton("0");
        } else if (keyCode >= KeyEvent.VK_1 && keyCode <= KeyEvent.VK_9) {
            char inputChar = (char) ('0' + (keyCode - KeyEvent.VK_1 + 1));
            handleNumericButton(String.valueOf(inputChar));
        } else if (keyCode >= KeyEvent.VK_NUMPAD1 && keyCode <= KeyEvent.VK_NUMPAD9) {
            char inputChar = (char) ('0' + (keyCode - KeyEvent.VK_NUMPAD1 + 1));
            handleNumericButton(String.valueOf(inputChar));
        } else if (!input.equals("") && input.charAt(input.length() - 1) != '(' && keyCode == 107) {
            if (input.charAt(input.length() - 1) == '-') {
                input = deleteLastCharachter(input);
            }
            handleOperatorButton("+");
        } else if (!input.equals("") && input.charAt(input.length() - 1) != '(' && keyCode == 109) {
            if (input.charAt(input.length() - 1) == '+') {
                input = deleteLastCharachter(input);
            }
            handleOperatorButton("-");
        } else if (!input.equals("") && input.charAt(input.length() - 1) != '(' && keyCode == KeyEvent.VK_MULTIPLY) {
            if (input.charAt(input.length() - 1) == '÷') {
                input = deleteLastCharachter(input);
            }
            handleOperatorButton("x");
        } else if (!input.equals("") && input.charAt(input.length() - 1) != '(' && keyCode == KeyEvent.VK_DIVIDE) {
            if (input.charAt(input.length() - 1) == 'x') {
                input = deleteLastCharachter(input);
            }
            handleOperatorButton("÷");
        } else if (!input.equals("") && (keyCode == KeyEvent.VK_DELETE || keyCode == KeyEvent.VK_BACK_SPACE)) {
            deleteProcess();
        } else if (keyCode == KeyEvent.VK_ENTER) {
            result();
        } else if (!input.equals("") && input.charAt(input.length() - 1) != '(' && (keyCode == KeyEvent.VK_COMMA || keyCode == 110)) {
            handleOperatorButton(",");
        } else {
            System.out.println("Yanlis giris");
        }
    }//GEN-LAST:event_btnZeroKeyPressed

    private void result() {
        pp = new ProcessPriority(txtInput.getText());
        result = pp.getResult();
        if (result == (int) result) {
            lblResult.setText((int) result + "");
            input = (int) result + "";
        } else {
            lblResult.setText(String.valueOf(result).replace(".", ","));
            input = String.valueOf(result).replace(".", ",");
        }
        txtInput.setText("");
        input = "";
    }

    private String deleteLastCharachter(String input) {
        return input.substring(0, input.length() - 1);
    }

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        input = "";
        lblResult.setText("");
        txtInput.setText(input);
    }//GEN-LAST:event_btnCActionPerformed

    private void handleNumericButton(String digit) {
        input += digit;
        txtInput.setText(input);
    }

    private void handleOperatorButton(String operator) {
        char op = input.charAt(input.length()-1);
        if(op != '+' && op != '-' && op != 'x' && op != '÷'){
            input += operator;
            txtInput.setText(input);
        }
    }

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        if (input.charAt(input.length() - 1) == '-') {
            input = deleteLastCharachter(input);
        }
        if (!input.equals("") && input.charAt(input.length() - 1) != '(') {
            handleOperatorButton("+");
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (input.charAt(input.length() - 1) == '+') {
            input = deleteLastCharachter(input);
        }
        if (!input.equals("") && input.charAt(input.length() - 1) != '(') {
            handleOperatorButton("-");
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimesActionPerformed
        if (input.charAt(input.length() - 1) == '÷') {
            input = deleteLastCharachter(input);
        }
        if (!input.equals("") && input.charAt(input.length() - 1) != '(') {
            handleOperatorButton("x");
        }
    }//GEN-LAST:event_btnTimesActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        if (input.charAt(input.length() - 1) == 'x') {
            input = deleteLastCharachter(input);
        }
        if (!input.equals("") && input.charAt(input.length() - 1) != '(') {
            handleOperatorButton("÷");
        }
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnPercantageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercantageActionPerformed
        if (!input.equals("") && input.charAt(input.length() - 1) != '(') {
            handleOperatorButton("%");
        }
    }//GEN-LAST:event_btnPercantageActionPerformed

    private void btnCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommaActionPerformed
        // , işlemi burada sayıyı double'a çevirecek
        if (!input.equals("") && input.charAt(input.length() - 1) != '(') {
            handleOperatorButton(",");
        }
    }//GEN-LAST:event_btnCommaActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        // Hesaplamanın sonucu burada
        result();
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if (!input.equals(""))
            deleteProcess();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnOpenPrnthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPrnthsActionPerformed
        handleNumericButton("(");
    }//GEN-LAST:event_btnOpenPrnthsActionPerformed

    private void btnClosePrnthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosePrnthsActionPerformed
        handleNumericButton(")");
    }//GEN-LAST:event_btnClosePrnthsActionPerformed
    private void deleteProcess() {
        input = input.substring(0, input.length() - 1);
        txtInput.setText(input);
    }

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnClosePrnths;
    private javax.swing.JButton btnComma;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnOpenPrnths;
    private javax.swing.JButton btnPercantage;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTimes;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextPane txtInput;
    // End of variables declaration//GEN-END:variables
}

class MyKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!isValid(c)) {
            e.consume(); // Geçersiz karakterleri tüket
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Implement your key released logic here if needed
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Implement your key released logic here if needed
    }

    private boolean isValid(char c) {
        // İzin verilen karakterler: rakamlar, +, -, *, /, %, .
        return Character.isDigit(c) || "(+-*/%,)".indexOf(c) != -1;
    }
}
