/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Name: Manasa Balaji

//NetId: mxb9247
//Student ID: 1001689246



package project3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JLabel;
import static project3.Client.jTextField1;
import static project3.Client.sequence;

/**
 *
 * @author manas
 */
public class Server extends javax.swing.JFrame {
    static String username;
    static InetAddress ip;
    static Socket s;
    static DataOutputStream dos;
    static DataInputStream dis;
    final static int ServerPort = 7654;
    static int pollValue=0;
    static String sequence;
    static ServerSocket ss;
    static int j = 0,i=0; 
    static int no=0;
    static int noClients=0;
    static double d;
    static String sendToClient="";
    static String initial="1";
    /**
     * Creates new form Server
     */
    public Server() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SERVER");

        jLabel2.setText("Active Clients:");

        jLabel3.setText("-----");

        jLabel4.setText("-----");

        jLabel5.setText("-----");

        jButton1.setText("Poll clients");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel4)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5)))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pollValue=1;
        System.out.println("Polling clients...");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
     static Vector<ClientHandler> ar = new Vector<>(); 
        static Queue<Integer> q = new LinkedList<>(); 

    
    
    public static void main(String args[]) throws Exception
        {  ss = new ServerSocket(ServerPort); 
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
        
//         try{
//            new Server().setVisible(true);
//        }
//        catch(Exception e)
//        {
//        }
//         
        while(true)
        {  // jLabel8.setText(" ");
            s = ss.accept(); 
            System.out.println("New client request received : " + s); 
            System.out.println(s.getInetAddress());
            // obtain input and output streams 
            dis = new DataInputStream(s.getInputStream()); 
            dos = new DataOutputStream(s.getOutputStream()); 
            String msg="Connected";
            
            dos.writeUTF(msg);
//            Server server=new Server();
            username = dis.readUTF(); 

            System.out.println("Creating a new handler for this client..."+ username); 
            System.out.println(username);
            noClients+=1;
            
            
//            JLabel jLabel=new JLabel(); 
//            jLabel.setText("New client connected :"+username); 
//            jLabel.setVisible(true); 
//            jPanel1.add(jLabel); 
//            jPanel1.revalidate();
            
            
//            jTextField1.setText(jTextField1.getText().toString()+"New client connected : \n " + s+ " "+username);
            
            
            ClientHandler mtch = new ClientHandler(s,"client " + i, dis, dos,username);
            Thread t = new Thread(mtch); 
            System.out.println("Adding this client to active client list"); 
            //setUsername(username);
//            jLabel8.setText("New client request received : " + s+"\nConnected\nCreating a new handler for this client...Adding this client to active client list");
            // add this client to active clients list 
            ar.add(mtch); 
            RawHttp rawHttp = new RawHttp();
            // start the thread. 
            t.start();
            if(rawHttp.getSeq()!="")
            {String s;
             s=rawHttp.getSeq();
             sequence+=s;
             j++;
            }
            if(true){
                String seq="";
//                int initial=1;
                 ScriptEngineManager mgr = new ScriptEngineManager();
                 ScriptEngine engine = mgr.getEngineByName("JavaScript");
                 String foo;
                 foo=sequence;
                 foo=initial+foo;
                 seq=seq+foo;
                 System.out.println("Calculating:"+seq);
                 try{         
                     d= (Double) engine.eval(foo);
                     if (!Double.isNaN(d)) {
//        System.out.println(String.format( "%.4f", d ));    
                     System.out.println("The output of the sequence from all clients:"+(String.format( "%.4f", d )));
                    sendToClient=String.valueOf(d);
                     }
            }
    catch(Exception e) {
        try{
        int i=(Integer) engine.eval(foo);
//      System.out.println( i );   
        double dValue=i;
        System.out.println("The output of the sequence from all clients:"+(String.format( "%.4f", dValue )));
        sendToClient=String.valueOf(dValue);
      
//        jLabel4.setText(" "+i);
        
        }
        catch(Exception x){
            System.out.println(x);
        }
    }
            }
            
            
          }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
// ClientHandler class 

 class ClientHandler extends Server implements Runnable  
{ 
    Scanner scn = new Scanner(System.in); 
    private String name; 
    final DataInputStream dis; 
    final DataOutputStream dos; 
    Socket s; 
    boolean isloggedin; 
    Server server; 
    String userName;
    String received,httpMsg; 
    String seq;
            int y;
            long timeBefore, timeAfter, total;

    // constructor 
    public ClientHandler(Socket s, String name, 
                            DataInputStream dis, DataOutputStream dos,String user) { 
        this.dis = dis; 
        this.dos = dos; 
        this.name = name; 
        this.s = s; 
        this.isloggedin=true; 
       // server.setUsername(user);
        this.userName=user;

    } 
    public String getValue(){
        return this.seq;
        }
    @Override
    public void run() { 
        
        //while(true)
        while (this.isloggedin)  
        {   try
            {   System.out.println("inside run");
              
                received = dis.readUTF(); 

                
                
                 if(pollValue==1){
                 try{
//                  dos.writeUTF("poll");
                  
//                jLabel3.setText(username);
                  System.out.println("\n\nSequence received:"+received);
            
                  //jTextField1.setText(jTextField1.getText().toString()+"Random number received :\n " + received);
                  System.out.println();
//                int n=Integer.parseInt(received.toString());
//                q.add(n);
                        
                  seq=received;
                  RawHttp rawhttp=new RawHttp();
                  rawhttp.getValues(seq);
                  
                  
                  if(received.equals("logout")){ 
                    System.out.println("Client "+username+" requested logout");
                    System.out.println("Client "+username+ " disconnected");
                    this.isloggedin=false; 
                    this.s.close(); 
                    break; 
                } 
                                    received=null;

//                httpMsg =null;        
                  }
                 
                 catch(Exception e){
                         System.out.println(e);
            }
                 
                 
                 
                 }
                 
                
                 
                 
                 
            }
                 
                  catch(Exception e){
                  System.out.println(e);
                   }
            
            
                   
//                 
                 }
                
                  
    
                  
                // break the string into message and recipient part 
//                StringTokenizer st = new StringTokenizer(received, "#"); 
//                String MsgToSend = st.nextToken(); 
//                String recipient = st.nextToken(); 
//  
//                // search for the recipient in the connected devices list. 
//                // ar is the vector storing client of active users 
//                for (ClientHandler mc : Server.ar)  
//                { 
//                    // if the recipient is found, write on its 
//                    // output stream 
//                    if (mc.name.equals(recipient) && mc.isloggedin==true)  
//                    { 
//                        mc.dos.writeUTF(this.name+" : "+MsgToSend); 
//                        break; 
//                    } 
//                } 
             
            
              
         
        try
        { 
            // closing resources 
            this.dis.close(); 
            this.dos.close(); 
              
        }
        catch(IOException e){ 
            e.printStackTrace(); 
        } 
    }
 }