/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sudoku_puzzle_game;

import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Sudoku extends javax.swing.JFrame {

    private String turn = "1";
    private boolean globalFlag = true;
    
    public String solveBoard[][] = {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"},
    };
    public Sudoku(){
        initComponents();
    }

    public void resetBoard(){
        
        JButton buttons[] = {txtbtn4,txtbtn7,txtbtn8,txtbtn9,txtbtn10,txtbtn14,txtbtn15,txtbtn16,txtbtn18,txtbtn19,
            txtbtn21,txtbtn23,txtbtn26,txtbtn32,txtbtn33,txtbtn35,txtbtn38,txtbtn39,txtbtn43,txtbtn44,txtbtn47,txtbtn49,
            txtbtn50,txtbtn56,txtbtn59,txtbtn61,txtbtn63,txtbtn64,txtbtn66,txtbtn67,txtbtn68,txtbtn72,txtbtn73,
            txtbtn74,txtbtn75,txtbtn78
        };
        
       JButton board[][] = {
           {txtbtn1, txtbtn2, txtbtn3, txtbtn4, txtbtn5, txtbtn6, txtbtn7, txtbtn8, txtbtn9},
           {txtbtn10, txtbtn11, txtbtn12, txtbtn13, txtbtn14, txtbtn15, txtbtn16, txtbtn17, txtbtn18},
           {txtbtn19, txtbtn20, txtbtn21, txtbtn22, txtbtn23, txtbtn24, txtbtn25, txtbtn26, txtbtn27},
           {txtbtn28, txtbtn29, txtbtn30, txtbtn31, txtbtn32, txtbtn33, txtbtn34, txtbtn35, txtbtn36},
           {txtbtn37, txtbtn38, txtbtn39, txtbtn40, txtbtn41, txtbtn42, txtbtn43, txtbtn44, txtbtn45},
           {txtbtn46, txtbtn47, txtbtn48, txtbtn49, txtbtn50, txtbtn51, txtbtn52, txtbtn53, txtbtn54},
           {txtbtn55, txtbtn56, txtbtn57, txtbtn58, txtbtn59, txtbtn60, txtbtn61, txtbtn62, txtbtn63},
           {txtbtn64, txtbtn65, txtbtn66, txtbtn67, txtbtn68, txtbtn69, txtbtn70, txtbtn71, txtbtn72},
           {txtbtn73, txtbtn74, txtbtn75, txtbtn76, txtbtn77, txtbtn78, txtbtn79, txtbtn80, txtbtn81},  
       };
       for(int i =0; i<9; i++){
           for(int j =0; j<9; j++){
               boolean flag = true;
               for(int k=0; k < buttons.length; k++){
                  if(board[i][j] == buttons[k]) flag = false; 
               }
               if(flag == true){
                   board[i][j].setText("");
                   board[i][j].setBackground(white);
               }
           }
       }
    }
    public void seeSolution(){
      JButton buttons[] = {txtbtn4,txtbtn7,txtbtn8,txtbtn9,txtbtn10,txtbtn14,txtbtn15,txtbtn16,txtbtn18,txtbtn19,
            txtbtn21,txtbtn23,txtbtn26,txtbtn32,txtbtn33,txtbtn35,txtbtn38,txtbtn39,txtbtn43,txtbtn44,txtbtn47,txtbtn49,
            txtbtn50,txtbtn56,txtbtn59,txtbtn61,txtbtn63,txtbtn64,txtbtn66,txtbtn67,txtbtn68,txtbtn72,txtbtn73,
            txtbtn74,txtbtn75,txtbtn78
        };
        
       JButton board[][] = {
           {txtbtn1, txtbtn2, txtbtn3, txtbtn4, txtbtn5, txtbtn6, txtbtn7, txtbtn8, txtbtn9},
           {txtbtn10, txtbtn11, txtbtn12, txtbtn13, txtbtn14, txtbtn15, txtbtn16, txtbtn17, txtbtn18},
           {txtbtn19, txtbtn20, txtbtn21, txtbtn22, txtbtn23, txtbtn24, txtbtn25, txtbtn26, txtbtn27},
           {txtbtn28, txtbtn29, txtbtn30, txtbtn31, txtbtn32, txtbtn33, txtbtn34, txtbtn35, txtbtn36},
           {txtbtn37, txtbtn38, txtbtn39, txtbtn40, txtbtn41, txtbtn42, txtbtn43, txtbtn44, txtbtn45},
           {txtbtn46, txtbtn47, txtbtn48, txtbtn49, txtbtn50, txtbtn51, txtbtn52, txtbtn53, txtbtn54},
           {txtbtn55, txtbtn56, txtbtn57, txtbtn58, txtbtn59, txtbtn60, txtbtn61, txtbtn62, txtbtn63},
           {txtbtn64, txtbtn65, txtbtn66, txtbtn67, txtbtn68, txtbtn69, txtbtn70, txtbtn71, txtbtn72},
           {txtbtn73, txtbtn74, txtbtn75, txtbtn76, txtbtn77, txtbtn78, txtbtn79, txtbtn80, txtbtn81}, 
       };
       
       if(globalFlag == true){
           globalFlag = false;
           jButton93.setText("HIDE SOLUTION");
         for(int i =0; i<9; i++){
           for(int j =0; j<9; j++){
               boolean flag = true;
               for(int k=0; k < buttons.length; k++)
               {
                  if(board[i][j] == buttons[k]) flag = false; 
               }
               if(flag == true)
               {
                   board[i][j].setText(solveBoard[i][j]);
                   board[i][j].setBackground(white);
                   board[i][j].setBackground(magenta);
               }
               
           }
         }  
       }
       else
       {
                   jButton93.setText("VIEW SOLUTION");
                   globalFlag = true;
                   resetBoard();
       }
    }
    
    public void checkMoves(){
       JButton buttons[] = {txtbtn4,txtbtn7,txtbtn8,txtbtn9,txtbtn10,txtbtn14,txtbtn15,txtbtn16,txtbtn18,txtbtn19,
            txtbtn21,txtbtn23,txtbtn26,txtbtn32,txtbtn33,txtbtn35,txtbtn38,txtbtn39,txtbtn43,txtbtn44,txtbtn47,txtbtn49,
            txtbtn50,txtbtn56,txtbtn59,txtbtn61,txtbtn63,txtbtn64,txtbtn66,txtbtn67,txtbtn68,txtbtn72,txtbtn73,
            txtbtn74,txtbtn75,txtbtn78
        };
        
       JButton board[][] = {
           {txtbtn1, txtbtn2, txtbtn3, txtbtn4, txtbtn5, txtbtn6, txtbtn7, txtbtn8, txtbtn9},
           {txtbtn10, txtbtn11, txtbtn12, txtbtn13, txtbtn14, txtbtn15, txtbtn16, txtbtn17, txtbtn18},
           {txtbtn19, txtbtn20, txtbtn21, txtbtn22, txtbtn23, txtbtn24, txtbtn25, txtbtn26, txtbtn27},
           {txtbtn28, txtbtn29, txtbtn30, txtbtn31, txtbtn32, txtbtn33, txtbtn34, txtbtn35, txtbtn36},
           {txtbtn37, txtbtn38, txtbtn39, txtbtn40, txtbtn41, txtbtn42, txtbtn43, txtbtn44, txtbtn45},
           {txtbtn46, txtbtn47, txtbtn48, txtbtn49, txtbtn50, txtbtn51, txtbtn52, txtbtn53, txtbtn54},
           {txtbtn55, txtbtn56, txtbtn57, txtbtn58, txtbtn59, txtbtn60, txtbtn61, txtbtn62, txtbtn63},
           {txtbtn64, txtbtn65, txtbtn66, txtbtn67, txtbtn68, txtbtn69, txtbtn70, txtbtn71, txtbtn72},
           {txtbtn73, txtbtn74, txtbtn75, txtbtn76, txtbtn77, txtbtn78, txtbtn79, txtbtn80, txtbtn81}, 
       }; 
       
        for(int i =0; i<9; i++){
           for(int j =0; j<9; j++){
             if(board[i][j].getText() != solveBoard[i][j] && board[i][j].getText() != " ")
             board[i][j].setBackground(orange);
              }
           }            
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn10 = new javax.swing.JButton();
        txtbtn11 = new javax.swing.JButton();
        txtbtn12 = new javax.swing.JButton();
        txtbtn19 = new javax.swing.JButton();
        txtbtn20 = new javax.swing.JButton();
        txtbtn21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn13 = new javax.swing.JButton();
        txtbtn14 = new javax.swing.JButton();
        txtbtn15 = new javax.swing.JButton();
        txtbtn22 = new javax.swing.JButton();
        txtbtn23 = new javax.swing.JButton();
        txtbtn24 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn16 = new javax.swing.JButton();
        txtbtn17 = new javax.swing.JButton();
        txtbtn18 = new javax.swing.JButton();
        txtbtn25 = new javax.swing.JButton();
        txtbtn26 = new javax.swing.JButton();
        txtbtn27 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtbtn28 = new javax.swing.JButton();
        txtbtn29 = new javax.swing.JButton();
        txtbtn30 = new javax.swing.JButton();
        txtbtn37 = new javax.swing.JButton();
        txtbtn38 = new javax.swing.JButton();
        txtbtn39 = new javax.swing.JButton();
        txtbtn46 = new javax.swing.JButton();
        txtbtn47 = new javax.swing.JButton();
        txtbtn48 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txtbtn31 = new javax.swing.JButton();
        txtbtn32 = new javax.swing.JButton();
        txtbtn33 = new javax.swing.JButton();
        txtbtn40 = new javax.swing.JButton();
        txtbtn41 = new javax.swing.JButton();
        txtbtn42 = new javax.swing.JButton();
        txtbtn49 = new javax.swing.JButton();
        txtbtn50 = new javax.swing.JButton();
        txtbtn51 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        txtbtn55 = new javax.swing.JButton();
        txtbtn56 = new javax.swing.JButton();
        txtbtn57 = new javax.swing.JButton();
        txtbtn64 = new javax.swing.JButton();
        txtbtn65 = new javax.swing.JButton();
        txtbtn66 = new javax.swing.JButton();
        txtbtn73 = new javax.swing.JButton();
        txtbtn74 = new javax.swing.JButton();
        txtbtn75 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        txtbtn58 = new javax.swing.JButton();
        txtbtn59 = new javax.swing.JButton();
        txtbtn60 = new javax.swing.JButton();
        txtbtn67 = new javax.swing.JButton();
        txtbtn68 = new javax.swing.JButton();
        txtbtn69 = new javax.swing.JButton();
        txtbtn76 = new javax.swing.JButton();
        txtbtn77 = new javax.swing.JButton();
        txtbtn78 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        txtbtn61 = new javax.swing.JButton();
        txtbtn62 = new javax.swing.JButton();
        txtbtn63 = new javax.swing.JButton();
        txtbtn70 = new javax.swing.JButton();
        txtbtn71 = new javax.swing.JButton();
        txtbtn72 = new javax.swing.JButton();
        txtbtn79 = new javax.swing.JButton();
        txtbtn80 = new javax.swing.JButton();
        txtbtn81 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        txtbtn34 = new javax.swing.JButton();
        txtbtn35 = new javax.swing.JButton();
        txtbtn36 = new javax.swing.JButton();
        txtbtn43 = new javax.swing.JButton();
        txtbtn44 = new javax.swing.JButton();
        txtbtn45 = new javax.swing.JButton();
        txtbtn52 = new javax.swing.JButton();
        txtbtn53 = new javax.swing.JButton();
        txtbtn54 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn10.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn10.setText("4");
        txtbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn10ActionPerformed(evt);
            }
        });

        txtbtn11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn11ActionPerformed(evt);
            }
        });

        txtbtn12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn12ActionPerformed(evt);
            }
        });

        txtbtn19.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn19.setText("7");
        txtbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn19ActionPerformed(evt);
            }
        });

        txtbtn20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn20ActionPerformed(evt);
            }
        });

        txtbtn21.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn21.setText("6");
        txtbtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn4.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn4.setText("5");
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn13ActionPerformed(evt);
            }
        });

        txtbtn14.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn14.setText("7");
        txtbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn14ActionPerformed(evt);
            }
        });

        txtbtn15.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn15.setText("8");
        txtbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn15ActionPerformed(evt);
            }
        });

        txtbtn22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn22ActionPerformed(evt);
            }
        });

        txtbtn23.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn23.setText("4");
        txtbtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn23ActionPerformed(evt);
            }
        });

        txtbtn24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtbtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton84.setBackground(new java.awt.Color(0, 0, 255));
        jButton84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton84.setForeground(new java.awt.Color(255, 255, 255));
        jButton84.setText("1");

        jButton85.setBackground(new java.awt.Color(0, 0, 0));
        jButton85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton85.setForeground(new java.awt.Color(255, 255, 255));
        jButton85.setText("2");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jButton86.setBackground(new java.awt.Color(0, 0, 0));
        jButton86.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton86.setForeground(new java.awt.Color(255, 255, 255));
        jButton86.setText("4");
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        jButton87.setBackground(new java.awt.Color(0, 0, 0));
        jButton87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton87.setForeground(new java.awt.Color(255, 255, 255));
        jButton87.setText("3");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jButton88.setBackground(new java.awt.Color(0, 0, 0));
        jButton88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton88.setForeground(new java.awt.Color(255, 255, 255));
        jButton88.setText("5");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton89.setBackground(new java.awt.Color(0, 0, 0));
        jButton89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton89.setForeground(new java.awt.Color(255, 255, 255));
        jButton89.setText("6");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(0, 0, 0));
        jButton90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton90.setForeground(new java.awt.Color(255, 255, 255));
        jButton90.setText("7");
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jButton91.setBackground(new java.awt.Color(0, 0, 0));
        jButton91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton91.setForeground(new java.awt.Color(255, 255, 255));
        jButton91.setText("8");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton92.setBackground(new java.awt.Color(0, 0, 0));
        jButton92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton92.setForeground(new java.awt.Color(255, 255, 255));
        jButton92.setText("9");
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jButton82.setBackground(new java.awt.Color(0, 102, 255));
        jButton82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton82.setText("RESET");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(255, 153, 0));
        jButton83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton83.setText("CHECK MOVES");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(51, 255, 51));
        jButton93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton93.setText("SOLUTION");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        jButton94.setBackground(new java.awt.Color(255, 0, 255));
        jButton94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton94.setText("EXIT");
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn7.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn7.setText("7");
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn8.setText("3");
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn9.setText("4");
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn16.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn16.setText("5");
        txtbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn16ActionPerformed(evt);
            }
        });

        txtbtn17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn17ActionPerformed(evt);
            }
        });

        txtbtn18.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn18.setText("9");
        txtbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn18ActionPerformed(evt);
            }
        });

        txtbtn25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn25ActionPerformed(evt);
            }
        });

        txtbtn26.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn26.setText("2");
        txtbtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn26ActionPerformed(evt);
            }
        });

        txtbtn27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbtn25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn28ActionPerformed(evt);
            }
        });

        txtbtn29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn29ActionPerformed(evt);
            }
        });

        txtbtn30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn30ActionPerformed(evt);
            }
        });

        txtbtn37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn37ActionPerformed(evt);
            }
        });

        txtbtn38.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn38.setText("3");
        txtbtn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn38ActionPerformed(evt);
            }
        });

        txtbtn39.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn39.setText("4");
        txtbtn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn39ActionPerformed(evt);
            }
        });

        txtbtn46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn46ActionPerformed(evt);
            }
        });

        txtbtn47.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn47.setText("6");
        txtbtn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn47ActionPerformed(evt);
            }
        });

        txtbtn48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbtn28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbtn37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbtn46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn31ActionPerformed(evt);
            }
        });

        txtbtn32.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn32.setText("3");
        txtbtn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn32ActionPerformed(evt);
            }
        });

        txtbtn33.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn33.setText("5");
        txtbtn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn33ActionPerformed(evt);
            }
        });

        txtbtn40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn40ActionPerformed(evt);
            }
        });

        txtbtn41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn41ActionPerformed(evt);
            }
        });

        txtbtn42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn42ActionPerformed(evt);
            }
        });

        txtbtn49.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn49.setText("1");
        txtbtn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn49ActionPerformed(evt);
            }
        });

        txtbtn50.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn50.setText("8");
        txtbtn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn50ActionPerformed(evt);
            }
        });

        txtbtn51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn51ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtbtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtbtn40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtbtn49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn55ActionPerformed(evt);
            }
        });

        txtbtn56.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn56.setText("4");
        txtbtn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn56ActionPerformed(evt);
            }
        });

        txtbtn57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn57ActionPerformed(evt);
            }
        });

        txtbtn64.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn64.setText("3");
        txtbtn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn64ActionPerformed(evt);
            }
        });

        txtbtn65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn65ActionPerformed(evt);
            }
        });

        txtbtn66.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn66.setText("5");
        txtbtn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn66ActionPerformed(evt);
            }
        });

        txtbtn73.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn73.setText("6");
        txtbtn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn73ActionPerformed(evt);
            }
        });

        txtbtn74.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn74.setText("8");
        txtbtn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn74ActionPerformed(evt);
            }
        });

        txtbtn75.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn75.setText("9");
        txtbtn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn75ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtbtn55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtbtn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtbtn73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn58ActionPerformed(evt);
            }
        });

        txtbtn59.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn59.setText("5");
        txtbtn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn59ActionPerformed(evt);
            }
        });

        txtbtn60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn60ActionPerformed(evt);
            }
        });

        txtbtn67.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn67.setText("9");
        txtbtn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn67ActionPerformed(evt);
            }
        });

        txtbtn68.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn68.setText("6");
        txtbtn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn68ActionPerformed(evt);
            }
        });

        txtbtn69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn69ActionPerformed(evt);
            }
        });

        txtbtn76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn76ActionPerformed(evt);
            }
        });

        txtbtn77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn77ActionPerformed(evt);
            }
        });

        txtbtn78.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn78.setText("1");
        txtbtn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn78ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtbtn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtbtn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtbtn76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn61.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn61.setText("9");
        txtbtn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn61ActionPerformed(evt);
            }
        });

        txtbtn62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn62ActionPerformed(evt);
            }
        });

        txtbtn63.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn63.setText("6");
        txtbtn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn63ActionPerformed(evt);
            }
        });

        txtbtn70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn70ActionPerformed(evt);
            }
        });

        txtbtn71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn71ActionPerformed(evt);
            }
        });

        txtbtn72.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn72.setText("2");
        txtbtn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn72ActionPerformed(evt);
            }
        });

        txtbtn79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn79ActionPerformed(evt);
            }
        });

        txtbtn80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn80ActionPerformed(evt);
            }
        });

        txtbtn81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn81ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtbtn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtbtn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtbtn79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtn34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn34ActionPerformed(evt);
            }
        });

        txtbtn35.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn35.setText("9");
        txtbtn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn35ActionPerformed(evt);
            }
        });

        txtbtn36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn36ActionPerformed(evt);
            }
        });

        txtbtn43.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn43.setText("2");
        txtbtn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn43ActionPerformed(evt);
            }
        });

        txtbtn44.setBackground(new java.awt.Color(102, 102, 255));
        txtbtn44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn44.setText("8");
        txtbtn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn44ActionPerformed(evt);
            }
        });

        txtbtn45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn45ActionPerformed(evt);
            }
        });

        txtbtn52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn52ActionPerformed(evt);
            }
        });

        txtbtn53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn53ActionPerformed(evt);
            }
        });

        txtbtn54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbtn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn54ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtbtn34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtbtn43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtbtn52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton93))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton83)
                                .addGap(18, 18, 18)
                                .addComponent(jButton94))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
        turn = "5";
        jButton88.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton85.setBackground(black);
        jButton86.setBackground(black);
        jButton87.setBackground(black);
        jButton89.setBackground(black);
        jButton90.setBackground(black);
        jButton91.setBackground(black);
        jButton92.setBackground(black);
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
        turn = "2";
        jButton85.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton86.setBackground(black);
        jButton87.setBackground(black);
        jButton88.setBackground(black);
        jButton89.setBackground(black);
        jButton90.setBackground(black);
        jButton91.setBackground(black);
        jButton92.setBackground(black);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
        turn = "3";
        jButton87.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton85.setBackground(black);
        jButton86.setBackground(black);
        jButton88.setBackground(black);
        jButton89.setBackground(black);
        jButton90.setBackground(black);
        jButton91.setBackground(black);
        jButton92.setBackground(black);
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
        turn = "4";
        jButton86.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton85.setBackground(black);
        jButton87.setBackground(black);
        jButton88.setBackground(black);
        jButton89.setBackground(black);
        jButton90.setBackground(black);
        jButton91.setBackground(black);
        jButton92.setBackground(black);
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
        turn = "6";
        jButton89.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton85.setBackground(black);
        jButton87.setBackground(black);
        jButton88.setBackground(black);
        jButton86.setBackground(black);
        jButton90.setBackground(black);
        jButton91.setBackground(black);
        jButton92.setBackground(black);
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
        turn = "7";
        jButton90.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton85.setBackground(black);
        jButton87.setBackground(black);
        jButton88.setBackground(black);
        jButton86.setBackground(black);
        jButton89.setBackground(black);
        jButton91.setBackground(black);
        jButton92.setBackground(black);
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
        turn = "8";
        jButton91.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton85.setBackground(black);
        jButton87.setBackground(black);
        jButton88.setBackground(black);
        jButton86.setBackground(black);
        jButton89.setBackground(black);
        jButton90.setBackground(black);
        jButton92.setBackground(black);
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
        turn = "9";
        jButton92.setBackground(blue);
        
        jButton84.setBackground(black);
        jButton85.setBackground(black);
        jButton87.setBackground(black);
        jButton88.setBackground(black);
        jButton86.setBackground(black);
        jButton89.setBackground(black);
        jButton90.setBackground(black);
        jButton91.setBackground(black);
    }//GEN-LAST:event_jButton92ActionPerformed

    private void txtbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn10ActionPerformed

    private void txtbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn19ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn19ActionPerformed

    private void txtbtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn21ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn21ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn14ActionPerformed

    private void txtbtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn23ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn23ActionPerformed

    private void txtbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn15ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn15ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn16ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn16ActionPerformed

    private void txtbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn18ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn18ActionPerformed

    private void txtbtn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn26ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn26ActionPerformed

    private void txtbtn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn32ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn32ActionPerformed

    private void txtbtn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn33ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn33ActionPerformed

    private void txtbtn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn35ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn35ActionPerformed

    private void txtbtn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn38ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn38ActionPerformed

    private void txtbtn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn39ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn39ActionPerformed

    private void txtbtn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn43ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn43ActionPerformed

    private void txtbtn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn44ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn44ActionPerformed

    private void txtbtn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn47ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn47ActionPerformed

    private void txtbtn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn49ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn49ActionPerformed

    private void txtbtn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn50ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn50ActionPerformed

    private void txtbtn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn56ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn56ActionPerformed

    private void txtbtn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn59ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn59ActionPerformed

    private void txtbtn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn61ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn61ActionPerformed

    private void txtbtn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn63ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn63ActionPerformed

    private void txtbtn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn64ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn64ActionPerformed

    private void txtbtn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn66ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn66ActionPerformed

    private void txtbtn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn67ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn67ActionPerformed

    private void txtbtn68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn68ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn68ActionPerformed

    private void txtbtn72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn72ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn72ActionPerformed

    private void txtbtn73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn73ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn73ActionPerformed

    private void txtbtn74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn74ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn74ActionPerformed

    private void txtbtn75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn75ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn75ActionPerformed

    private void txtbtn78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn78ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtbtn78ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
          JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "SUDOKU PUZZLE GAME", 
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
     
    }//GEN-LAST:event_jButton94ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(turn);
        txtbtn1.setBackground(white);
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(turn);
        txtbtn2.setBackground(white);
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(turn);
        txtbtn3.setBackground(white);
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(turn);
        txtbtn5.setBackground(white);
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(turn);
        txtbtn6.setBackground(white);
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn11ActionPerformed
        // TODO add your handling code here:
        txtbtn11.setText(turn);
        txtbtn11.setBackground(white);
    }//GEN-LAST:event_txtbtn11ActionPerformed

    private void txtbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn12ActionPerformed
        // TODO add your handling code here:
        txtbtn12.setText(turn);
        txtbtn12.setBackground(white);
    }//GEN-LAST:event_txtbtn12ActionPerformed

    private void txtbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn13ActionPerformed
        // TODO add your handling code here:
        txtbtn13.setText(turn);
        txtbtn13.setBackground(white);
    }//GEN-LAST:event_txtbtn13ActionPerformed

    private void txtbtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn20ActionPerformed
        // TODO add your handling code here:
        txtbtn20.setText(turn);
        txtbtn20.setBackground(white);
    }//GEN-LAST:event_txtbtn20ActionPerformed

    private void txtbtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn22ActionPerformed
        // TODO add your handling code here:
        txtbtn22.setText(turn);
        txtbtn22.setBackground(white);
    }//GEN-LAST:event_txtbtn22ActionPerformed

    private void txtbtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn24ActionPerformed
        // TODO add your handling code here:
        txtbtn24.setText(turn);
        txtbtn24.setBackground(white);
    }//GEN-LAST:event_txtbtn24ActionPerformed

    private void txtbtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn25ActionPerformed
        // TODO add your handling code here:
        txtbtn25.setText(turn);
        txtbtn25.setBackground(white);
    }//GEN-LAST:event_txtbtn25ActionPerformed

    private void txtbtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn27ActionPerformed
        // TODO add your handling code here:
        txtbtn27.setText(turn);
        txtbtn27.setBackground(white);
    }//GEN-LAST:event_txtbtn27ActionPerformed

    private void txtbtn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn28ActionPerformed
        // TODO add your handling code here:
        txtbtn28.setText(turn);
        txtbtn28.setBackground(white);
    }//GEN-LAST:event_txtbtn28ActionPerformed

    private void txtbtn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn29ActionPerformed
        // TODO add your handling code here:
        txtbtn29.setText(turn);
        txtbtn29.setBackground(white);
    }//GEN-LAST:event_txtbtn29ActionPerformed

    private void txtbtn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn30ActionPerformed
        // TODO add your handling code here:
        txtbtn30.setText(turn);
        txtbtn30.setBackground(white);
    }//GEN-LAST:event_txtbtn30ActionPerformed

    private void txtbtn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn31ActionPerformed
        // TODO add your handling code here:
        txtbtn31.setText(turn);
        txtbtn31.setBackground(white);
    }//GEN-LAST:event_txtbtn31ActionPerformed

    private void txtbtn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn34ActionPerformed
        // TODO add your handling code here:
        txtbtn34.setText(turn);
        txtbtn34.setBackground(white);
    }//GEN-LAST:event_txtbtn34ActionPerformed

    private void txtbtn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn36ActionPerformed
        // TODO add your handling code here:
        txtbtn36.setText(turn);
        txtbtn36.setBackground(white);
    }//GEN-LAST:event_txtbtn36ActionPerformed

    private void txtbtn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn37ActionPerformed
        // TODO add your handling code here:
        txtbtn37.setText(turn);
        txtbtn37.setBackground(white);
    }//GEN-LAST:event_txtbtn37ActionPerformed

    private void txtbtn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn40ActionPerformed
        // TODO add your handling code here:
        txtbtn40.setText(turn);
        txtbtn40.setBackground(white);
    }//GEN-LAST:event_txtbtn40ActionPerformed

    private void txtbtn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn41ActionPerformed
        // TODO add your handling code here:
        txtbtn41.setText(turn);
        txtbtn41.setBackground(white);
    }//GEN-LAST:event_txtbtn41ActionPerformed

    private void txtbtn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn42ActionPerformed
        // TODO add your handling code here:
        txtbtn42.setText(turn);
        txtbtn42.setBackground(white);
    }//GEN-LAST:event_txtbtn42ActionPerformed

    private void txtbtn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn45ActionPerformed
        // TODO add your handling code here:
        txtbtn45.setText(turn);
        txtbtn45.setBackground(white);
    }//GEN-LAST:event_txtbtn45ActionPerformed

    private void txtbtn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn46ActionPerformed
        // TODO add your handling code here:
        txtbtn46.setText(turn);
        txtbtn46.setBackground(white);
    }//GEN-LAST:event_txtbtn46ActionPerformed

    private void txtbtn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn48ActionPerformed
        // TODO add your handling code here:
        txtbtn48.setText(turn);
        txtbtn48.setBackground(white);
    }//GEN-LAST:event_txtbtn48ActionPerformed

    private void txtbtn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn51ActionPerformed
        // TODO add your handling code here:
        txtbtn51.setText(turn);
        txtbtn51.setBackground(white);
    }//GEN-LAST:event_txtbtn51ActionPerformed

    private void txtbtn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn52ActionPerformed
        // TODO add your handling code here:
        txtbtn52.setText(turn);
        txtbtn52.setBackground(white);
    }//GEN-LAST:event_txtbtn52ActionPerformed

    private void txtbtn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn53ActionPerformed
        // TODO add your handling code here:
        txtbtn53.setText(turn);
        txtbtn53.setBackground(white);
    }//GEN-LAST:event_txtbtn53ActionPerformed

    private void txtbtn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn54ActionPerformed
        // TODO add your handling code here:
        txtbtn54.setText(turn);
        txtbtn54.setBackground(white);
    }//GEN-LAST:event_txtbtn54ActionPerformed

    private void txtbtn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn55ActionPerformed
        // TODO add your handling code here:
        txtbtn55.setText(turn);
        txtbtn55.setBackground(white);
    }//GEN-LAST:event_txtbtn55ActionPerformed

    private void txtbtn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn57ActionPerformed
        // TODO add your handling code here:
        txtbtn57.setText(turn);
        txtbtn57.setBackground(white);
    }//GEN-LAST:event_txtbtn57ActionPerformed

    private void txtbtn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn58ActionPerformed
        // TODO add your handling code here:
        txtbtn58.setText(turn);
        txtbtn58.setBackground(white);
    }//GEN-LAST:event_txtbtn58ActionPerformed

    private void txtbtn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn60ActionPerformed
        // TODO add your handling code here:
        txtbtn60.setText(turn);
        txtbtn60.setBackground(white);
    }//GEN-LAST:event_txtbtn60ActionPerformed

    private void txtbtn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn62ActionPerformed
        // TODO add your handling code here:
        txtbtn62.setText(turn);
        txtbtn62.setBackground(white);
    }//GEN-LAST:event_txtbtn62ActionPerformed

    private void txtbtn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn65ActionPerformed
        // TODO add your handling code here:
        txtbtn65.setText(turn);
        txtbtn65.setBackground(white);
    }//GEN-LAST:event_txtbtn65ActionPerformed

    private void txtbtn69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn69ActionPerformed
        // TODO add your handling code here:
        txtbtn69.setText(turn);
        txtbtn69.setBackground(white);
    }//GEN-LAST:event_txtbtn69ActionPerformed

    private void txtbtn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn70ActionPerformed
        // TODO add your handling code here:
        txtbtn70.setText(turn);
        txtbtn70.setBackground(white);
    }//GEN-LAST:event_txtbtn70ActionPerformed

    private void txtbtn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn71ActionPerformed
        // TODO add your handling code here:
        txtbtn71.setText(turn);
        txtbtn71.setBackground(white);
    }//GEN-LAST:event_txtbtn71ActionPerformed

    private void txtbtn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn76ActionPerformed
        // TODO add your handling code here:
        txtbtn76.setText(turn);
        txtbtn76.setBackground(white);
    }//GEN-LAST:event_txtbtn76ActionPerformed

    private void txtbtn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn77ActionPerformed
        // TODO add your handling code here:
        txtbtn77.setText(turn);
        txtbtn77.setBackground(white);
    }//GEN-LAST:event_txtbtn77ActionPerformed

    private void txtbtn79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn79ActionPerformed
        // TODO add your handling code here:
        txtbtn79.setText(turn);
        txtbtn79.setBackground(white);
    }//GEN-LAST:event_txtbtn79ActionPerformed

    private void txtbtn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn80ActionPerformed
        // TODO add your handling code here:
        txtbtn80.setText(turn);
        txtbtn80.setBackground(white);
    }//GEN-LAST:event_txtbtn80ActionPerformed

    private void txtbtn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn81ActionPerformed
        // TODO add your handling code here:
        txtbtn81.setText(turn);
        txtbtn81.setBackground(white);
    }//GEN-LAST:event_txtbtn81ActionPerformed

    private void txtbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn17ActionPerformed
        // TODO add your handling code here:
        txtbtn17.setText(turn);
        txtbtn17.setBackground(white);
    }//GEN-LAST:event_txtbtn17ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to reset the board", "SUDOKU PUZZLE GAME", 
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            resetBoard();
        }
         
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
        checkMoves();
    }//GEN-LAST:event_jButton83ActionPerformed

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
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn10;
    private javax.swing.JButton txtbtn11;
    private javax.swing.JButton txtbtn12;
    private javax.swing.JButton txtbtn13;
    private javax.swing.JButton txtbtn14;
    private javax.swing.JButton txtbtn15;
    private javax.swing.JButton txtbtn16;
    private javax.swing.JButton txtbtn17;
    private javax.swing.JButton txtbtn18;
    private javax.swing.JButton txtbtn19;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn20;
    private javax.swing.JButton txtbtn21;
    private javax.swing.JButton txtbtn22;
    private javax.swing.JButton txtbtn23;
    private javax.swing.JButton txtbtn24;
    private javax.swing.JButton txtbtn25;
    private javax.swing.JButton txtbtn26;
    private javax.swing.JButton txtbtn27;
    private javax.swing.JButton txtbtn28;
    private javax.swing.JButton txtbtn29;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn30;
    private javax.swing.JButton txtbtn31;
    private javax.swing.JButton txtbtn32;
    private javax.swing.JButton txtbtn33;
    private javax.swing.JButton txtbtn34;
    private javax.swing.JButton txtbtn35;
    private javax.swing.JButton txtbtn36;
    private javax.swing.JButton txtbtn37;
    private javax.swing.JButton txtbtn38;
    private javax.swing.JButton txtbtn39;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn40;
    private javax.swing.JButton txtbtn41;
    private javax.swing.JButton txtbtn42;
    private javax.swing.JButton txtbtn43;
    private javax.swing.JButton txtbtn44;
    private javax.swing.JButton txtbtn45;
    private javax.swing.JButton txtbtn46;
    private javax.swing.JButton txtbtn47;
    private javax.swing.JButton txtbtn48;
    private javax.swing.JButton txtbtn49;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn50;
    private javax.swing.JButton txtbtn51;
    private javax.swing.JButton txtbtn52;
    private javax.swing.JButton txtbtn53;
    private javax.swing.JButton txtbtn54;
    private javax.swing.JButton txtbtn55;
    private javax.swing.JButton txtbtn56;
    private javax.swing.JButton txtbtn57;
    private javax.swing.JButton txtbtn58;
    private javax.swing.JButton txtbtn59;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn60;
    private javax.swing.JButton txtbtn61;
    private javax.swing.JButton txtbtn62;
    private javax.swing.JButton txtbtn63;
    private javax.swing.JButton txtbtn64;
    private javax.swing.JButton txtbtn65;
    private javax.swing.JButton txtbtn66;
    private javax.swing.JButton txtbtn67;
    private javax.swing.JButton txtbtn68;
    private javax.swing.JButton txtbtn69;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn70;
    private javax.swing.JButton txtbtn71;
    private javax.swing.JButton txtbtn72;
    private javax.swing.JButton txtbtn73;
    private javax.swing.JButton txtbtn74;
    private javax.swing.JButton txtbtn75;
    private javax.swing.JButton txtbtn76;
    private javax.swing.JButton txtbtn77;
    private javax.swing.JButton txtbtn78;
    private javax.swing.JButton txtbtn79;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn80;
    private javax.swing.JButton txtbtn81;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
