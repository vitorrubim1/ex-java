
package telas;

import static java.lang.Thread.sleep;

public class splash extends javax.swing.JFrame {
    /**
     * Creates new form jogo
     */
    public splash() {
        initComponents();
        
        new Thread () {
            public void run (){
                for (int i=0; i<=101; i++)
            {
                try{
                    sleep(70);
                    jBarra.setValue(i); 
                    
                    if (jBarra.getValue()<=30){
                        jmsg.setText("O jogo está sendo carregado, aguarde..");
                    }else if (jBarra .getValue()<=68){
                            jmsg.setText("Abrindo o jogo e carregando as perguntas..");
                        
                        }else {
                            jmsg.setText("Abertura do sistema concluída.");
                        }
           
                } catch (InterruptedException ex){
            
            }
            
            }
                pergunta1 login = new pergunta1();
                login.setVisible(true);
                dispose();
            }
        } .start();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBarra = new javax.swing.JProgressBar();
        jmsg = new javax.swing.JLabel();
        jLbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLtitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(255, 0, 0));
        jLtitulo.setText("JOGO DO VITÃO");
        getContentPane().add(jLtitulo);
        jLtitulo.setBounds(240, 20, 220, 30);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("O jogo consiste em perguntas e respostas variadas..");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 100, 450, 21);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("REGRAS: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 150, 110, 30);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("A cada resposta correta +1Ponto.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 200, 290, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("A cada resposta errada -1 Vida.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 240, 270, 30);

        jBarra.setStringPainted(true);
        getContentPane().add(jBarra);
        jBarra.setBounds(150, 320, 460, 30);

        jmsg.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jmsg.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(jmsg);
        jmsg.setBounds(90, 360, 420, 20);

        jLbackground.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLbackground.setForeground(new java.awt.Color(255, 0, 0));
        jLbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        getContentPane().add(jLbackground);
        jLbackground.setBounds(0, 0, 770, 480);

        setSize(new java.awt.Dimension(758, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jBarra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JLabel jmsg;
    // End of variables declaration//GEN-END:variables
}
